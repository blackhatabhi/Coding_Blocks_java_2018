package abhinav;

import java.util.Scanner;

public class hollow_diamond {
	 public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);

			int n = scn.nextInt();

			int row = 1;
			int nst = n / 2;
			int nsp = 1;

			while (row <= n) {

				if ((row == 1) || (row == n)) {
					int c = 1;
					while (c <= n) {
						System.out.print("* ");
						c = c + 1;
					}
					System.out.println();
					row = row + 1;
				} else {

					int cst = 1;
					while (cst <= nst) {
						System.out.print("* ");
						cst = cst + 1;
					}

					int csp = 1;
					while (csp <= nsp) {
						System.out.print("  ");
						csp = csp + 1;
					}

					int csta = 1;
					while (csta <= nst) {
						System.out.print("* ");
						csta = csta + 1;
					}

					System.out.print("\n");

					if (row <= (n / 2)) {
						nsp = nsp + 2;
						nst = nst - 1;
					} else {
						nsp = nsp - 2;
						nst = nst + 1;
					}
					row = row + 1;
				}
			}

	    }
	}

