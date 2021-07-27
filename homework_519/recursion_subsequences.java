package homework_519;

import java.util.Scanner;

public class recursion_subsequences {
	public static void main(String args[]) {
		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		int count = printsubsequences(str, " ");
		System.out.println();
		System.out.println(" " + count);
		printss(str, " ");

	}

	public static int printsubsequences(String str, String res) {

		if (str.length() == 0) {

			return 1;
		}
		int count = 0;
		char ch = str.charAt(0);
		String ros = str.substring(1);
		count += printsubsequences(ros, res);
		count += printsubsequences(ros, res + ch);
		count += printsubsequences(ros, res + (int) ch);
		return count;

	}

	public static void printss(String str, String ans) {
		if (str.length() == 0) {

			System.out.print(ans);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		printss(ros, ans);
		printss(ros, ans + ch);
		printss(ros, ans + (int) ch);

	}
}
