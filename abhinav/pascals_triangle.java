package abhinav;

import java.util.Scanner;

public class pascals_triangle {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int row = Scn.nextInt();
		int i, j, k = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < k; j++) {
				System.out.println("*");
			}
		}

	}

}
