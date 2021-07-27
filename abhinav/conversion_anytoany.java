package abhinav;

import java.util.Scanner;

public class conversion_anytoany {

	public static void main(String args[]) {
		int decimal = 0, sn = 0, power = 1, p = 1, r, rem;
		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int N = scn.nextInt();
		while (N != 0) {
			r = N % 10;
			decimal = decimal + r * power;
			N /= 10;
			power = power * sb;
		}
		while (decimal != 0) {
			rem = decimal % db;
			sn = sn + p * rem;
			decimal /= db;
			p = p * 10;
		}
		System.out.println(sn);

	}
}
