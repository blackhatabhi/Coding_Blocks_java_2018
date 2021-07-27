package lecture_27;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_edit_distance_recursive {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String Str1 = Scn.nextLine();
		String Str2 = Scn.nextLine();
		System.out.println(editdistance(Str1, Str2));

	}

	public static int editdistance(String str1, String str2) {
		if (str1.length() == 0) {
			return str2.length();
		}
		if (str2.length() == 0) {
			return str1.length();
		}

		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		int ans = 0;
		if (str1.charAt(0) == str2.charAt(0)) {
			ans = editdistance(ros1, ros2);
		} else {
			int f1 = 1 + editdistance(ros1, ros2);
			int f2 = 1 + editdistance(ros1, str2);
			int f3 = 1 + editdistance(str1, ros2);
			ans = Math.min(f1, Math.min(f2, f3));
		}
		return ans;
	}
}
