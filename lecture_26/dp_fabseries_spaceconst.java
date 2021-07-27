package lecture_26;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_fabseries_spaceconst {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		System.out.println(fibSE(n));
	}

	public static int fibSE(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 1; i <= n - 1; i++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		return strg[1];
	}

}
