package abhinav;

import java.util.Scanner;

public class spiral_print_clockwise {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

		int M = Scanner.nextInt();

		int N = Scanner.nextInt();

		int[][] arr = new int[M][N];

		for (int i = 0; i < M; i++) {

			for (int j = 0; j < N; j++) {

				arr[i][j] = Scanner.nextInt();

			}

		}
		spiralPrint(M, N, arr);
	}

	public static void spiralPrint(int m, int n, int a[][]) {
		int i, k = 0, l = 0;

		while (k < m && l < n) {

			for (i = l; i < n; ++i) {
				System.out.print(a[k][i] + ", ");
			}
			k++;

			for (i = k; i < m; ++i) {
				System.out.print(a[i][n - 1] + ", ");
			}
			n--;

			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(a[m - 1][i] + ", ");
				}
				m--;
			}

			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(a[i][l] + ", ");
				}
				l++;
			}
		}System.out.println("END");
	}

}
