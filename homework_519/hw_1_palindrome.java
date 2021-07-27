package homework_519;

import java.util.Scanner;

public class hw_1_palindrome {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(isStringPalindrome(s));
	}

	public static boolean isStringPalindrome(String input) {
		if (input.length() <= 1) {
			return true;
		}
		if (input.charAt(0) == input.charAt(input.length() - 1)) {
			return isStringPalindrome(input.substring(1, input.length() - 1));
		} else {
			return false;
		}
	}
}
