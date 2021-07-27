package abhinav;

import java.util.Scanner;

public class largest_subarray_with_0_1 {
	static Scanner Scn = new Scanner(System.in);

	public static void main(String[] args) {
		largest_subarray_with_0_1 sub;
		sub = new largest_subarray_with_0_1();
		int T = Scn.nextInt();
		while (T != 0) {
			int N = Scn.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Scn.nextInt();

			}
			int size = N;
			T--;
			sub.findSubArray(arr, size);
			
		}

	}

	int findSubArray(int arr[], int n) {

		int sum = 0;
		int maxsize = -1, startindex = 0;
		int endindex = 0;

		for (int i = 0; i < n - 1; i++) {
			sum = (arr[i] == 0) ? -1 : 1;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] == 0)
					sum += -1;
				else
					sum += 1;

				if (sum == 0 && maxsize < j - i + 1) {
					maxsize = j - i + 1;
					startindex = i;
				}
			}
		}
		endindex = startindex + maxsize - 1;
		if (maxsize == -1)
			System.out.println("None");
		else
			System.out.println(startindex + " " + endindex);

		return maxsize;

	}

}
