package homework_519;

import java.util.Scanner;

public class hw_8_recursiontwins {
	public static void main(String args[]) {
		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		int i = 0;
		int count = 0;
		twins(str, i, count);

	}

	public static void twins(String str, int i, int count) {
		if (i == str.length() - 2) {
			System.out.println(count);
			return;
		}
		if (str.charAt(i) == str.charAt(i + 2)) {

			twins(str, i + 1, count + 1);

		} else {
			twins(str, i + 1, count);
		}
	}

}
