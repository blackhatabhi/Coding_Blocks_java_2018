package homework_519;

import java.util.*;

public class isarr_sorted {

	public static int Array_Sort_Hai_k_Nahi(int arr[], int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		if (arr[n - 1] < arr[n - 2]) {
			return 0;
		}
		return Array_Sort_Hai_k_Nahi(arr, n - 1);
	}

	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();
		boolean tr = true;
		boolean fl = false;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = a.nextInt();
		}
		if (Array_Sort_Hai_k_Nahi(arr, N) != 0) {
			System.out.println(tr);
		} else {
			System.out.println(fl);
		}
	}
}
