package homework_519;

import java.util.Scanner;

public class max_circular {
	public static Scanner Scn = new Scanner(System.in);

	public static void main(String[] args) {

		int T = Scn.nextInt();
		while (T != 0) {
		int N = Scn.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}

			int[] na = new int[arr.length * 2];

			for (int i = 0; i < arr.length; i++) {
				na[i] = arr[i];
				na[i + arr.length] = arr[i];
			}

			int maxSum = 0;

			for (int si = 0; si <= arr.length - 1; si++) {

				for (int ei = si; ei <= si + arr.length - 1; ei++) {

					int subarraySum = 0;

					for (int k = si; k <= ei; k++) {
						subarraySum += na[k];
					}

					if (subarraySum > maxSum) {
						maxSum = subarraySum;
					}
				}
			}

			System.out.println(maxSum);
			T--;

		}

	}
}
