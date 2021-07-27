package homework_519;

import java.util.Scanner;

public class isbalance {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String Str = Scn.nextLine();
		 System.out.println(balanced(Str, ""));

	}
	public static boolean balanced(String str, String ans) {

		if (str.length() == 0) {

			if (ans.length() == 0)
				return true;
			else
				return false;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		if (ch == '(' || ch == '{' || ch == '[') {

			ans += ch;

		} else if (ch == ')' || ch == '}' || ch == ']') {

			if (ans.length() != 0) {

				char last = ans.charAt(ans.length() - 1);

				if (last == '{' && ch != '}') {
					return false;
				} else if (last == '(' && ch != ')') {
					return false;
				} else if (last == '[' && ch != ']') {

					return false;
				}

				ans = ans.substring(0, ans.length() - 1);

			} else {
				return false;
			}

		}

		return balanced(ros, ans);

	}
}
