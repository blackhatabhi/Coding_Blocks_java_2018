package abhinav;

import java.util.Scanner;

public class hwpattern_withzero {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 0;

		while (row <= n) {
			int val = row;
			int csp = 1;
			while (csp <= nsp) {

				System.out.print(" ");
				csp = csp + 1;
			}
			int cst = 1;
			while (cst <= nst) {

				System.out.print(val);

				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 1;
		}

	}

}
