package abhinav;

import java.util.Scanner;

public class pattren_mountain {
	    public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);

			int n = scn.nextInt();

			int row = 1;
			int nst = 1;
			int nsp = n - 1;

			while (row <= n) {

				int cst = 1;
				int counter = 1;
				while (cst <= nst) {
					System.out.print(counter + " ");
					cst = cst + 1;
					counter = counter + 1;
				}

				int csp = 1;
				while (csp <= nsp) {
					System.out.print("  ");
					csp = csp + 1;
				}

				 int cspa = 1;
				 while (cspa < nsp) {
				 System.out.print("  ");
				 cspa = cspa + 1;
				 }

				int csta = 1;
				if (row == n) {
					csta = 2;
					counter = counter - 1;
				}
				while (csta <= nst) {
					counter = counter - 1;
					System.out.print(counter + " ");
					csta = csta + 1;
				}

				System.out.print("\n");

				nsp = nsp - 1;
				nst = nst + 1;
				row = row + 1;
			}

	    }
	}
