package abhinav;

import java.util.Scanner;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int nst = 1;
		int nsp1 = n - 1;
		int nsp2 = -1;

		for (int i = 0; i < n; i++) {
			// spaces
			int val;
			if (i < n / 2) {
				val = i + 1;
			} else {
				val = n - i;
			}

			for (int csp = 1; csp <= nsp1; csp++) {
				System.out.print(" "+" ");
			}

			// stars

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val+" ");
				val--;
			}

			// spaces

			for (int csp = 1; csp <= nsp2; csp++) {
				System.out.print(" "+" ");
			}

			// stars
			int v = 1;
			int cst;
			if (i == 0 || i == n - 1) {
				cst = 2;
			} else {
				cst = 1;
			}
			for (; cst <= nst; cst++) {
				System.out.print(v+" ");
				v++;
			}

			System.out.println();
			if (i < n / 2) {
				nsp1 -= 2;
				nst += 1;
				nsp2 += 2;

			} else {
				nsp1 += 2;
				nst -= 1;
				nsp2 -= 2;
			}

		}

	}

}
