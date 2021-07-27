package abhinav;

import java.util.Scanner;

public class linear_search {
	public static void main(String args[]) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}
		int M = Scn.nextInt();
		System.out.println(search(arr, N, M));
	}

	public static int search(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}

		return -1;
	}
}
