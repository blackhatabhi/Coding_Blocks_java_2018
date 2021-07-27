package question;

import java.util.Stack;
import java.util.Scanner;

public class next_smaller_next_greater {
	static Scanner Scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int T = Scn.nextInt();
		while (T != 0) {
			int N = Scn.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Scn.nextInt();
			}
			nextSmallerOfNextGreater(arr, N);
			T--;
		}
	}

	static void nextGreater(int arr[], int n, int next[], char order) {

		Stack<Integer> S = new Stack<>();

		for (int i = n - 1; i >= 0; i--) {

			while (!S.empty() && ((order == 'G') ? arr[S.peek()] <= arr[i] : arr[S.peek()] >= arr[i])) {
				S.pop();
			}
			if (!S.empty())
				next[i] = S.peek();

			else
				next[i] = -1;

			S.push(i);
		}
	}

	public static void nextSmallerOfNextGreater(int[] arr, int n) {
		int[] NG = new int[n];
		int[] RS = new int[n];

		nextGreater(arr, n, NG, 'G');

		nextGreater(arr, n, RS, 'S');

		for (int i = 0; i < n; i++) {
			if (NG[i] != -1 && RS[NG[i]] != -1)
				System.out.print(arr[RS[NG[i]]] + " ");
			else
				System.out.print("-1" + " ");
		}
	}
}
