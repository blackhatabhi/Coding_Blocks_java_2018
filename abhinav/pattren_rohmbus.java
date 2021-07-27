package abhinav;

import java.util.Scanner;

public class pattren_rohmbus {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = 2 * n;

		while (row <= (2 * n - 1)) {

			int temp = row;
			if (row > n) {
				temp = (2 * n) - row;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= nst) {
				if (cst <= (nst / 2)) {
					System.out.print(temp + " ");
					temp = temp + 1;
				} else {
					System.out.print(temp + " ");
					temp = temp - 1;
				}
				cst = cst + 1;
			}

			System.out.print("\n");

			if (row <= (n - 1)) {
				nsp = nsp - 2;
				nst = nst + 2;
			} else {
				nsp = nsp + 2;
				nst = nst - 2;
			}
			row = row + 1;
		}

	}
}
