package lecture_27;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-05-Nov-2018
 */
public class dp_topdown_editdistance {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String Str1 = Scn.nextLine();
		String Str2 = Scn.nextLine();
		int[][] arr = new int[Str1.length() + 1][Str2.length() + 1];
		System.out.println(editdistance(Str1, Str2, arr));
	}

	public static int editdistance(String str1, String str2, int[][] strg) {

		if (str1.length() == 0) {
			return str2.length();
		}
		if (str2.length() == 0) {
			return str1.length();
		}
		if (strg[str1.length()][str2.length()] != 0) {
			return strg[str1.length()][str2.length()];

		}
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		int ans = 0;
		if (str1.charAt(0) == str2.charAt(0)) {
			ans = editdistance(ros1, ros2, strg);
		} else {
			int f1 = 1 + editdistance(ros1, ros2, strg);
			int f2 = 1 + editdistance(ros1, str2, strg);
			int f3 = 1 + editdistance(str1, ros2, strg);
			ans = Math.min(f1, Math.min(f2, f3));
			strg[str1.length()][str2.length()] = ans;
		}

		return ans;
	}
}
