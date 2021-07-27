package lecture2;

import java.util.Scanner;

public class patern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 2 * n - 1;
		int nsp = 0;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {

				System.out.print(" ");
				csp = csp + 1;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst == 2 * n) {
					System.out.print(" ");
				} else {
					System.out.println("*");
				
				cst = cst + 1;

				System.out.println();
				row = row + 1;
				nsp = nsp + 1;
				nst = nst - 2;
			}

		}

	}}}

