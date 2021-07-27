package lecture7;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		substring_palindrome();
	}

	public static int substring_palindrome() {
		String str, sub = "";
		int i, j, length;

		Scanner scn = new Scanner(System.in);
		str = scn.nextLine();

		length = str.length();

		System.out.println(str);

		for (j = 0; j < length; j++) {
			for (i = 1; i <= length - j; i++) {
				sub = str.substring(j, j + i);
				System.out.println(sub);
			}
		}

		return length;
	}
}
