package lecture_27;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-05-Nov-2018
 */
public class dp_topdown_lcs {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String Str1 = Scn.nextLine();
		String Str2 = Scn.nextLine();
		int[][] arr = new int[Str1.length() + 1][Str2.length() + 1];
		System.out.println(lcs(Str1, Str2, arr));
	}

	public static int lcs(String str1, String str2, int[][] strgs) {
		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}
		if (strgs[str1.length()][str2.length()] != 0) {
			return strgs[str1.length()][str2.length()];

		}
		int count = 0;
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + lcs(ros1, ros2, strgs);

		} else {
			int f1 = lcs(ros1, str2, strgs);
			int f2 = lcs(str1, ros2, strgs);
			count = Math.max(f1, f2);
			strgs[str1.length()][str2.length()] = count;
		}
		return count;
	}
}
