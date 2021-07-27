package lecture_26;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_fab_itrative {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		System.out.println(fabI(n));
	}

	public static int fabI(int n) {
		int[] strgs = new int[n + 1];
		strgs[0] = 0;
		strgs[1] = 1;
		for (int i = 2; i <= n; i++) {
			strgs[i] = strgs[i - 1] + strgs[i - 2];
		}
		return strgs[n];
	}
}
