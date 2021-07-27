package lecture_12;

import java.util.Scanner;

public class backtracking_3_quicksort {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}

		quicksort(arr, 0, arr.length - 1);
		for (int val : arr) {
			System.out.println(val);
		}

	}

	public static void quicksort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int left = lo;
		int right = hi;
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			quicksort(arr, lo + 1, hi);
			quicksort(arr, lo, hi - 1);
		}
	}
}
