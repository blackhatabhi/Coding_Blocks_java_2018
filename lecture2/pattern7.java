package lecture2;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int nst = N / 2;
		int nsp = 1;
		int row = 1;
		while (row <= N ) {
			for (int cst = 0; cst <= nst; cst++) {
				System.out.print("*");
			}
			for (int csp = 0; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			for (int cst = 0; cst <= nst; cst++) {
				System.out.print("*");
			}
			System.out.println();
			if (row <= N / 2) {
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
