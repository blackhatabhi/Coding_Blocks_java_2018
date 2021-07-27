package abhinav;

import java.util.Scanner;

public class inverted_hour_glass {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = (2 * n);
		int temp = n;

		while (row <= (2 * n) + 1) {

			int c1 = 1;
			int counter = n;

			while (c1 <= nst) {
				System.out.print(counter + " ");
				counter = counter - 1;

				c1 = c1 + 1;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			int cspa = 2;
			while (cspa < nsp) {
				System.out.print(" ");
				cspa = cspa + 1;
			}

			counter = counter + 1;
			int c2 = 1;
			while (c2 <= nst) {
				if (counter != 0) {
					System.out.print(counter + " ");
				}
				counter = counter + 1;

				c2 = c2 + 1;
			}

			System.out.print("\n");

			if (row <= n) {
				nsp = nsp - 2;
				nst = nst + 1;
			} else {
				nsp = nsp + 2;
				nst = nst - 1;
			}
			row = row + 1;
		}

	}
}
