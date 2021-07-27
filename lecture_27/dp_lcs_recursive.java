package lecture_27;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_lcs_recursive {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String Str1 = Scn.nextLine();
		String Str2 = Scn.nextLine();
		System.out.println(lcs(Str1, Str2));
	}

	public static int lcs(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}
		int count = 0;
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + lcs(ros1, ros2);

		} else {
			int f1 = lcs(ros1, str2);
			int f2 = lcs(str1, ros2);
			count = Math.max(f1, f2);
		}
		return count;
	}
}
