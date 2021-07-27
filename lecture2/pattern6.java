package lecture2;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= (2 * n) + 1; j++) {
					if (j == n) {
						System.out.print("0");
					} else if (j <= n - i) {
						System.out.print(" ");
					} else if (j >= n - i + 1 && j < n) {
						System.out.print(11 - n + j - 1);
					} else if (j >= n + 1 && j < n + i) {

						System.out.print(10 - j + n);
					}
				}

				System.out.println();
			}

		}
	}
