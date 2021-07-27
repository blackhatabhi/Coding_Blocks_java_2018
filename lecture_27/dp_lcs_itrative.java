package lecture_27;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_lcs_itrative {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String Str1 = Scn.nextLine();
		String Str2 = Scn.nextLine();
		System.out.println(lcs(Str1, Str2));
	}

	public static int lcs(String str1, String str2) {
		int[][] strg = new int[str1.length() + 1][str2.length() + 1];

		for (int i = str1.length() - 1; i >= 0; i--) {
			for (int j = str2.length() - 1; j >= 0; j--) {
				if (str1.charAt(i) == str2.charAt(j)) {
					strg[i][j] = 1 + strg[i + 1][j + 1];
				} else {
					strg[i][j] = Math.max(strg[i + 1][j], strg[i][j + 1]);
				}
			}
		}
		return strg[0][0];
	}

}
