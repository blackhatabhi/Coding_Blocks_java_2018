package abhinav;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-27-Nov-2018
 */
public class demo {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		print(n);

	}

	public static void print(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < i/2; k++) {
				
				System.out.println();

			}

		}

	}

}
