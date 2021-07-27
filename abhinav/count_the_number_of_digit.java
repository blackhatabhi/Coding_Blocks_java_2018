package abhinav;

import java.util.Scanner;

public class count_the_number_of_digit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int i = s.nextInt();
		int j, count = 0;
		int CharLen = a.length();
		for (j = 0; j < CharLen; j++) {
			int x = Character.getNumericValue((int) a.charAt(j));
			if (i == x) {
				count++;
			}
		}
		System.out.println(count);
	}

}
