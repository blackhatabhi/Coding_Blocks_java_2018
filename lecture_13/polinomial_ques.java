package lecture_13;

import java.util.Scanner;

public class polinomial_ques {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(polynomial(x, n));
		System.out.println(polynomialrec(x, n, n));
	}
//recursion
	public static int polynomialrec(int x, int n, int y) {
		if (x == 1) {
			return y;
		}

		int ans = polynomialrec(x - 1, n, y * n);
		int sum = y * x + ans;
		return sum;
	}
//normal
	public static int polynomial(int n, int x) {
		int sum = 0;
		int pow = x;
		for (int i = n; i >= 1; i--) {
			sum = sum + i * pow;
			pow = pow * x;

		}
		return sum;
	}

}
