package homework_519;

import java.util.Scanner;

public class vivek_loves_game {

	public static void main(String[] args) {

		Scanner Scn = new Scanner(System.in);
		int T = Scn.nextInt();
		while (T != 0) {
			int N = Scn.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Scn.nextInt();
			}
			System.out.println(maxScore(arr, 0, arr.length - 1));
			T--;
		}

	}

	public static int maxScore(int[] arr, int si, int ei) {

		int fh = 0;
		int sh = 0;

		for (int i = si; i < ei; i++) {

			int sum1 = sum(arr, si, i);
			int sum2 = sum(arr, i + 1, ei);

			if (sum1 == sum2) {

				fh = maxScore(arr, si, i);
				sh = maxScore(arr, i + 1, ei);

				return Math.max(fh, sh) + 1;

			}

		}

		return 0;

	}

	public static int sum(int[] arr, int si, int ei) {

		int sum = 0;
		for (int i = si; i <= ei; i++) {

			sum += arr[i];
		}
		return sum;

	}
}
