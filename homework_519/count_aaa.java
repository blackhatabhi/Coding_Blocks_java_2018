package homework_519;

import java.util.Scanner;

public class count_aaa {
	public static void main(String args[]) {
		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		int i = 0;
		int count = 0;
		twins(str, i, count);
		System.out.println(findOccurance(str, "aaa"));

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

	public static int findOccurance(String inputString, String stringToFind) {
		String[] noOfInstances;
		noOfInstances = inputString.split(stringToFind);
		return noOfInstances.length-1;
	}
}
