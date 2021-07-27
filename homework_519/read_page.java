package homework_519;

import java.util.Scanner;

public class read_page {
	public static void main(String[] args) {

		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int M = Scn.nextInt();
		long[] nop = new long[N];
		for (int i = 0; i < nop.length; i++) {
			nop[i] = Scn.nextLong();
		}
		System.out.println(ac(M, nop, N));

	}

	public static long ac(int M, long[] nop, int N) {
		long lo = 0;
		long hi = 0;
		for (long val : nop) {
			hi += val;
		}
		long finalAns = 0;
		while (lo <= hi) {
			long mid = (lo + hi) / 2;
			if (isitpossible(mid, M, nop, N)) {
				hi = mid - 1;
				finalAns = mid;
			} else {
				lo = mid + 1;

			}

		}

		return finalAns;
	}

	public static boolean isitpossible(long mid, int M, long[] nop, int N) {
		int nos = 1;
		long pagesRead = 0;
		for (int i = 0; i < nop.length; i++) {
			if (nop[i] > mid) {
				return false;
			}
			if (pagesRead + nop[i] <= mid) {
				pagesRead += nop[i];

			} else {
				nos++;
				pagesRead = nop[i];
			}
			if (nos > M) {
				return false;
			}

		}

		return true;
	}
}
