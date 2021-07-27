package lecture_13;

import java.util.Scanner;

public class power_time {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int x = Scn.nextInt();
		int n = Scn.nextInt();

		System.out.println(power(x, n));

	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;

		}
		int ans = 0;
		int rr = power(x, n / 2);
		if (n % 2 == 0) {
			ans = rr * rr;
		} else

		{
			ans = rr * rr * x;
		}
		return ans;
	}
}
