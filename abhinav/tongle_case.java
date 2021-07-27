package abhinav;

import java.util.Scanner;

public class tongle_case {
	public static void main(String[] args) {
		StringBuffer Str = new StringBuffer();
		Scanner input = new Scanner(System.in);
		Str.append(input.nextLine());
		convertOpposite(Str);

		System.out.println(Str);
	}

	static void convertOpposite(StringBuffer str) {
		int ln = str.length();

		for (int i = 0; i < ln; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c))
				str.replace(i, i + 1, Character.toUpperCase(c) + "");
			else
				str.replace(i, i + 1, Character.toLowerCase(c) + "");

		}
	}

}
