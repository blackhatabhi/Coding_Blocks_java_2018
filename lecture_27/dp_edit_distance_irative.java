package lecture_27;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_edit_distance_irative {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String Str1 = Scn.nextLine();
		String Str2 = Scn.nextLine();
		System.out.println(editdistance(Str1, Str2));

	}

	public static int editdistance(String str1, String str2) {
		int[][] strg = new int[str1.length() + 1][str2.length() + 1];
		for (int i = str1.length(); i >= 0; i--) {
			for (int j = str2.length(); j >= 0; j--) {
				if (i == str1.length()) {
					strg[i][j] = str2.length() - j;
					continue;
				}
				if (j == str2.length()) {
					strg[i][j] = str1.length() - i;
					continue;
				}
				if (str1.charAt(i) == str2.charAt(i)) {
					strg[i][j] = strg[i + 1][j + 1];
				} else {
					strg[i][j] = 1 + Math.min(strg[i + 1][j + 1], Math.min(strg[i + 1][j], strg[i][j + 1]));
				}
			}
		}
		return strg[0][0];
	}

}
