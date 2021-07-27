package abhinav;

import java.util.Scanner;

public class star_odd_corrected {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		if (N < 4) {
			System.exit(0);
		} else {
			if ((N % 2) != 0) {
				int add = 1;
				int numOfSpaces = N / 2;
				for (int i = 1; i <= N; i++) {
					for (int j = numOfSpaces; j >= 1; j--) {
						System.out.print(" " + " ");
					}
					for (int j = 1; j <= add; j++) {
						System.out.print("*" + " ");
					}
					System.out.println();
					if (i < (N / 2 + 1)) {
						add = add + 2;
						numOfSpaces = numOfSpaces - 1;
					} else {
						add = add - 2;
						numOfSpaces = numOfSpaces + 1;
					}
				}
			} else {
				int add = 1;
				int numOfSpaces = N / 2;
				for (int i = 0; i <= N + 1; i++) {
					for (int j = numOfSpaces; j >= 1; j--) {
						System.out.print(" ");
					}
					for (int j = 1; j <= add - 2; j++) {
						System.out.print("*" + " ");
					}
					System.out.println();
					if (i < (N / 2 + 1)) {
						add = add + 2;
						numOfSpaces = numOfSpaces - 1;
					} else {
						add = add - 2;
						numOfSpaces = numOfSpaces + 1;
					}
				}
			}
		}
	}

}
