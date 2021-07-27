package question;

import java.util.Scanner;

public class SUMOFMINIMUMANDMAXIMUMELEMENTSOFALLSUBARRAYSOFSIZEK {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int T = Scn.nextInt();

		while (T != 0) {
			int N = Scn.nextInt();
			int k = Scn.nextInt();
			int price[] = new int[N];
			for (int i = 0; i < N; i++) {
				price[i] = Scn.nextInt();
			}
			System.out.println(maxSubarraySum(price, N, k));
			T--;
		}

	}

	static int maxSubarraySum(int[] arr, int n, int k) {
		int i = 0;
		int j = i;
		int sum = 0;
		int total = 0;
		while (i < arr.length && j < arr.length) {
			j = i;
			int length = i + k;
			int max = arr[i];
			int min = arr[j];
			while (j < length && length < arr.length + 1) {
				if (arr[j] > max) {
					max = arr[j];
				} else if (arr[j] < min) {
					min = arr[j];
				}

				else
					j += 1;
			}
			sum = min + max;
			total += sum;
			i++;
		}

		return total;

	}
}
