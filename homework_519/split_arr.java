package homework_519;

import java.util.Scanner;

public class split_arr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr = new int[n];
		for (int i=0; i <n ; i++) {
			arr[i] = scn.nextInt(); }
		System.out.println(split(arr, 0, 0, 0, 0));
		split(arr, 0, 0, "", 0, "");

	}
	public static void split(int[] arr, int vidx, int sumL, String ansL, int sumR, String ansR) {

		if (vidx == arr.length) {
			if (sumL == sumR) {
				System.out.println(ansL + " and " + ansR);
			}
			return;
		}

		split(arr, vidx + 1, sumL + arr[vidx], ansL + arr[vidx] + " ", sumR, ansR);
		split(arr, vidx + 1, sumL, ansL, sumR + arr[vidx], ansR + arr[vidx] + " ");

	}

	public static int split(int[] a, int vidx, int sum1, int sum2, int c) {
		if (vidx == a.length) {
			if (sum1 == sum2)
				// System.out.println(ans1+ " and "+ ans2);
				c++;
			return c;
		}
		int count = 0;
		count += split(a, vidx + 1, sum1 + a[vidx], sum2, c);
		count += split(a, vidx + 1, sum1, sum2 + a[vidx], c);

		return count;

	}
}
