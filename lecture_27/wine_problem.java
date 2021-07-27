package lecture_27;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-05-Nov-2018
 */
public class wine_problem {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 4 };
		int[][] strg = new int[arr.length][arr.length];
		System.out.println(wineprobTD(arr, 0, 4, strg));
		System.out.println(wineprob(arr, 0, 4));
		System.out.println(winprobBU(arr));
	}

	public static int wineprob(int[] price, int si, int ei) {
		if (si > ei) {
			return 0;
		}
		int year = price.length - (ei - si);
		int f1 = wineprob(price, si + 1, ei) + (price[si] * year);
		int f2 = wineprob(price, si, ei - 1) + (price[ei] * year);
		return Math.max(f1, f2);
	}

	public static int wineprobTD(int[] price, int si, int ei, int[][] strg) {
		if (si > ei) {
			return 0;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int year = price.length - (ei - si);
		int f1 = wineprobTD(price, si + 1, ei, strg) + (price[si] * year);
		int f2 = wineprobTD(price, si, ei - 1, strg) + (price[ei] * year);
		int ans = Math.max(f1, f2);
		strg[si][ei] = ans;
		return ans;
	}

	public static int winprobBU(int[] price) {
		int n = price.length;
		int[][] strgs = new int[price.length][price.length];
		for (int slide = 0; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;
				int year = price.length - (ei - si);
				if (si == ei) {
					strgs[si][ei] = price[si] * year;
				}
				int f1 = wineprob(price, si + 1, ei) + (price[si] * year);
				int f2 = wineprob(price, si, ei - 1) + (price[ei] * year);
				strgs[si][ei] = Math.max(f1, f2);
			}
		}
		return strgs[0][4];

	}
}
