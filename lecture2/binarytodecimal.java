package lecture2;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int power = 1;
		int binary = 0;
		while (N != 0) {
			int rem = N % 10;
			binary = binary + rem * power;
			power = power * 2;
			N = N / 10;
		}
		System.out.println(binary);
	}

}

