package lecture_28;
/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-10-Nov-2018
 */
public class Knapsack {

	public static void main(String[] args) {
		int[] wt = { 1, 2, 3, 4 };
		int[] price = { 1, 4, 5, 7 };
		int cap = 7;
		System.out.println(Knapsack1(wt, price, 0, cap));
		System.out.println(Knapsack1TD(wt, price, 0, 7, new int[wt.length][cap + 1]));
		System.out.println(Knapsack1BU(wt, price, cap));
	}

	public static int Knapsack1(int[] wt, int[] price, int vidx, int cap) {
		if (vidx == wt.length) {
			return 0;
		}
		int include = 0;
		if (cap >= wt[vidx]) {
			include = Knapsack1(wt, price, vidx + 1, cap - wt[vidx]) + price[vidx];
		}
		int exclude = Knapsack1(wt, price, vidx + 1, cap);
		int ans = Math.max(include, exclude);
		return ans;

	}

	public static int Knapsack1TD(int[] wt, int[] price, int vidx, int cap, int[][] strgs) {
		if (vidx == wt.length) {
			return 0;
		}
		if (strgs[vidx][cap] != 0) {
			return strgs[vidx][cap];
		}
		int include = 0;
		if (cap >= wt[vidx]) {
			include = Knapsack1TD(wt, price, vidx + 1, cap - wt[vidx], strgs) + price[vidx];
		}
		int exclude = Knapsack1TD(wt, price, vidx + 1, cap, strgs);
		int ans = Math.max(include, exclude);
		strgs[vidx][cap] = ans;
		return ans;

	}

	public static int Knapsack1BU(int[] wt, int[] price, int cap) {
		int nr = wt.length + 1;
		int nc = cap + 1;
		int[][] strgs = new int[nr][nc];
		for (int row = 0; row < nr; row++) {
			for (int col = 0; col < nc; col++) {
				if (row == 0 || col == 0) {
					strgs[row][col] = 0;
				} else {
					int include = 0;
					if (col >= wt[row - 1]) {
						include = price[row - 1] + strgs[row - 1][col - wt[row - 1]];
					}
					int exclude = strgs[row - 1][col];
					int ans = Math.max(include, exclude);
					strgs[row][col] = ans;

				}
			}
		}
		return strgs[nr - 1][nc - 1];
	}
	
}
