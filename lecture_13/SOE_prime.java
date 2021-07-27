package lecture_13;

import java.util.Arrays;

public class SOE_prime {

	public static void main(String[] args) {

		SOEprime(25);
	}

	public static void SOEprime(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = true;
		for (int t = 2; t * t <= n; t++) {
			if (prime[t] == false) {
				continue;
			}
			for (int m = 2; m * t <= n; m++) {
				prime[t * m] = false;
			}
		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i])
				System.out.println(i);
		}
	}
}
