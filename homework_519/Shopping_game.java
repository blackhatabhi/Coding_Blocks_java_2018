package homework_519;

import java.util.Scanner;

public class Shopping_game {
	public static Scanner Scn = new Scanner(System.in);

	public static void main(String[] args) {
		int T = Scn.nextInt();
		while (T != 0) {

			int ayushLimit = Scn.nextInt();
			int harshitLimit = Scn.nextInt();

			int ayushCount = 0;
			int harshitCount = 0;

			int i = 1;

			while (true) {

				if (i % 2 != 0) {
					if (ayushCount + i <= ayushLimit) {
						ayushCount += i;
					} else {
						System.out.println("Harshit");
						break;
					}
				} else {
					if (harshitCount + i <= harshitLimit) {
						harshitCount += i;
					} else {
						System.out.println("Aayush");
						break;
					}
				}
				i++;
			}
			T--;
		}

	}
}
