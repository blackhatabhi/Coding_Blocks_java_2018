package homework_519;

import java.util.Scanner;

public class rain_water {
	public static Scanner Scn = new Scanner(System.in);

	public static void main(String[] args) {

		int T = Scn.nextInt();
		while (T != 0) {
		int N = Scn.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}

		

			int[] left = new int[arr.length];
			left[0] = arr[0];

			for (int i = 1; i < arr.length; i++) {
				left[i] = Math.max(left[i - 1], arr[i]);
			}

			
			int[] right = new int[arr.length];
			right[arr.length - 1] = arr[arr.length - 1];

			for (int i = arr.length - 2; i >= 0; i--) {
				right[i] = Math.max(right[i + 1], arr[i]);
			}

			int sum = 0;

			for (int i = 0; i < arr.length; i++) {
				sum += (Math.min(left[i], right[i]) - arr[i]);
			}
			
			System.out.println(sum);
			T--;
		}

	}
}
