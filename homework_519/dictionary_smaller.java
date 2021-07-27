package homework_519;

import java.util.Scanner;

public class dictionary_smaller {
	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String Str = Scn.nextLine();
		permut(Str, "", Str);

	}

	public static void permut(String ques, String ans, String org) {
		if (ques.length() == 0) {
			if (ans.compareTo(org) < 0) {
				System.out.println(ans);
			}
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			permut(roq, ans + ch, org);
		}

	}

}
