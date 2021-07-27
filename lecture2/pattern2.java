package lecture2;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 2*n-1;
		int nsp = 0;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {

				System.out.print(" ");
				csp = csp + 1;
			}
			
			
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;

			}
			System.out.println();
			row = row + 1;
			nsp = nsp + 1;
			nst = nst - 2;
		}
	}

	}


