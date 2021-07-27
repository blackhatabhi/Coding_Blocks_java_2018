package homework_519;

import java.util.Scanner;

public class valid_invalid {


		public static void main(String[] args) {
			System.out.println(validinvalid());
		}

		public static boolean validinvalid() {

			Scanner scn = new Scanner(System.in);

			int n = scn.nextInt();
			boolean gd = true;

			int prev = scn.nextInt();

			for (int i = 1; i <= n - 1; i++) {

				int curr = scn.nextInt();

				if (gd) {
					if (prev > curr) {
					} else {
						gd = false;
					}

				} else {
					if (prev < curr) {
					} else {
						return false;
					}
				}

				prev = curr;
			}

			return true;

		}

	}



