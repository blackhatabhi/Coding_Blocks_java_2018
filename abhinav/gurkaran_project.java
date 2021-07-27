package abhinav;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-24-Feb-2019
 */
public class gurkaran_project {
	static void gurkaran(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == n * i || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}

		}
	}

	public static void main(String args[]) {
		Scanner Scn = new Scanner(System.in);
		int rows = Scn.nextInt();
		gurkaran(rows);
	}
}
