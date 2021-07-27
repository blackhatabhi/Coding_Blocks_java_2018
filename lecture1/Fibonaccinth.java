package lecture1;

import java.util.Scanner;

public class Fibonaccinth {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();

		int a = 0;
		int b = 1;
		int sum = 0;
//		System.out.println(a);
//		System.out.println(b);

		int count = 1;

		while (count <= N - 1) {

			sum = a + b;
			a = b;
			b = sum;

			count = count + 1;

		}
		System.out.println(sum);
	}

}
