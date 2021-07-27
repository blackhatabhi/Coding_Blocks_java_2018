package homework_519;

import java.util.Scanner;

public class hw_6_removeduplicates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(removeConsecutiveDuplicates(s));

	}

	public static String removeConsecutiveDuplicates(String s) {
		if (s.length() <= 1) {
			return s;
		}
		if (s.charAt(0) == s.charAt(1)) {
			return removeConsecutiveDuplicates(s.substring(1));
		} else {
			String small = removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0) + small;
		}
	}
}
