package abhinav;

import java.util.Scanner;

public class maximum_sum_array {
	static Scanner scn = new Scanner(System.in);
	

	public static void main(String[] args) {
		int T=scn.nextInt();
	
		while(T!=0) {
		int N = scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = scn.nextInt();
		}
		int n = arr.length;
		int max_sum = maxSubArraySum(arr, 0, n - 1);

		System.out.println(max_sum);
	
	T--;}}
	public static int maxCrossingSum(int arr[], int l, int m, int h) {

		int sum = 0;
		int left_sum = Integer.MIN_VALUE;
		for (int i = m; i >= l; i--) {
			sum = sum + arr[i];
			if (sum > left_sum)
				left_sum = sum;
		}

		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for (int i = m + 1; i <= h; i++) {
			sum = sum + arr[i];
			if (sum > right_sum)
				right_sum = sum;
		}

		return left_sum + right_sum;
	}

	public static int maxSubArraySum(int arr[], int l, int h) {

		if (l == h)
			return arr[l];

		int m = (l + h) / 2;

		return Math.max(Math.max(maxSubArraySum(arr, l, m), maxSubArraySum(arr, m + 1, h)),
				maxCrossingSum(arr, l, m, h));
		}
	}
