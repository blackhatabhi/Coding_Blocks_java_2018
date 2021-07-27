
package abhinav;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int nsp = N - 1;
		int nst = 1;
		int val = 1;
		int row = 1;
		if (N > 0 && N < 10) {
			while (row <= N) {
				int csp = 1;
				while (csp <= nsp) {
					System.out.print("\t");
					csp++;
				}
				val = row;
				int cst = 1;
				while (cst <= nst) {
					if (cst < ((nst + 1) / 2)) {
						System.out.print(val + "\t");
						val++;
					} else {
						System.out.print(val + "\t");
						val--;
					}
					cst++;
				}
				
				System.out.println();
				nst += 2;
				nsp--;
				row++;

			}

		}

	}
}
