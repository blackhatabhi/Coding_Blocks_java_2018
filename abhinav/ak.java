package abhinav;

import java.util.Scanner;

public class ak {
	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int T = Scn.nextInt();
		Scn.nextLine();
		for (int k = 0; k < T; k++) {
			String Str = Scn.nextLine();
			System.out.println(printCodes(Str, ""));

		}

	}

	public static int printCodes(String str, String ans) {
		int count1 = 0;
		int count = 0;
		int count3 = 0;
		if (str.length() == 0) {
//	        System.out.println(ans);
			return 1;
		}

		String ch1 = str.substring(0, 1);
		String restOfTheString1 = str.substring(1);

		if (Integer.parseInt(ch1, 10) > 0) {
			char code = (char) (Integer.parseInt(ch1, 10) + 'a' - 1);
			count3 += printCodes(restOfTheString1, ans + code);
		}

		if (str.length() >= 2) {
			String ch12 = str.substring(0, 2);
			String ros2 = str.substring(2);

			if (Integer.parseInt(ch12, 10) > 0 && Integer.parseInt(ch12) <= 26) {
				char code = (char) (Integer.parseInt(ch12, 10) + 'a' - 1);

				count1 += printCodes(ros2, ans + code);
			}
			if (Integer.parseInt(ch12, 10) == 0) {

				count += printCodes(ros2, ans);
			}

		}
		return count + count1 + count3;
	}
}
