package lecture_26;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_boardpath_topbottom {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		System.out.print(boardpathI(0, N));

	}

	public static int boardpathI(int curr, int end) {

		int[] strg = new int[end + 6];
		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {

			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];

		}
		return strg[0];
	}
}
