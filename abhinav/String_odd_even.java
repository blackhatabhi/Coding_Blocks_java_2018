package abhinav;

import java.util.Scanner;

public class String_odd_even {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String Str = Scn.nextLine();
		string1(Str);
	}

	public static void string1(String str) {
		String k = "";
		for (int i = 0; i < str.length(); i++) {

			int j = str.charAt(i);
			if ((i+1) % 2 == 0) {
				j--;
			} else {
				j++;

			}

			k += (char) j;

		}
		System.out.print(k + " ");
	}
}
