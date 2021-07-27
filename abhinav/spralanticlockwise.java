package abhinav;

import java.util.Scanner;

public class spralanticlockwise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rows;

		int columns;

		rows = scanner.nextInt();

		columns = scanner.nextInt();

		int[][] arr = new int[rows][columns];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				arr[i][j] = scanner.nextInt();

			}

		}

		counterClockspiralPrint(R, C, arr);
		System.out.println(" " + "END");
	}

	static int R = 4;
	static int C = 4;

	public static void counterClockspiralPrint(int m, int n, int arr[][]) {
		int i, k = 0, l = 0;

		int cnt = 0;

		int total = m * n;

		while (k < m && l < n) {
			if (cnt == total)
				break;

			for (i = k; i < m && cnt < total; ++i) {
				System.out.print(arr[i][l] + ", ");
				cnt++;
			}
			l++;

			if (cnt == total)
				break;

			for (i = l; i < n && cnt < total; ++i) {
				System.out.print(arr[m - 1][i] + ", ");
				cnt++;
			}
			m--;

			if (cnt == total)
				break;

			if (k < m) {
				for (i = m - 1; i >= k && cnt < total; --i) {
					System.out.print(arr[i][n - 1] + ", ");
					cnt++;
				}
				n--;
			}

			if (cnt == total)
				break;

			if (l < n) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(arr[k][i] + ", ");
					cnt++;
				}
				k++;
			}
		}
	}

}
