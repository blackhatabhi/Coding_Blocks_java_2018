package lecture_26;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_boardpath_bottomup {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int[] arr = new int[N];
		System.out.print(maze1(0, N, arr));

	}

	public static int maze1(int curr, int end, int[] strgs) {

		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strgs[curr] != 0) {
			return strgs[curr];
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += maze1(curr + dice, end, strgs);

		}
		strgs[curr] = count;

		return count;
	}
}
