package lecture7;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		String original, reverse = "";
		Scanner scn = new Scanner(System.in);

		original = scn.nextLine();
		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}
}