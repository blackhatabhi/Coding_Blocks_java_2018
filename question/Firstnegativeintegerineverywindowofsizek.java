package question;

import java.util.Scanner;

public class Firstnegativeintegerineverywindowofsizek {
	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int T=Scn.nextInt();
		while(T!=0) {
		int N = Scn.nextInt();
		int K = Scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Scn.nextInt();
		}
		print(arr, N, K);
		T--;}
	}

	public static void print(int[] arr, int n, int k) {
		boolean flag;

		for (int i = 0; i < (n - k + 1); i++) {
			flag = false;

			for (int j = 0; j < k; j++) {

				if (arr[i + j] < 0) {
					System.out.print(arr[i + j] + " ");
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.print("0" + " ");
		}
	}
}
