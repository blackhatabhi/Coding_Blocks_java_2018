package lecture_26;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_fabnocii_recursive {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int[] arr = new int[n + 1];
		System.out.println(fabnocii(n, arr));

	}

	public static int fabnocii(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fabnocii(n - 1, strg);
		int fnm2 = fabnocii(n - 2, strg);
		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}

}
