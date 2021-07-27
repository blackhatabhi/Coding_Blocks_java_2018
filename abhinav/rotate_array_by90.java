package abhinav;

import java.util.Scanner;

public class rotate_array_by90 {
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
		int N = scanner.nextInt();

		rotateMatrix(N, arr);
		displayMatrix(N, arr);
	}

	public static void rotateMatrix(int N, int arr[][]) {

		for (int x = 0; x < N / 2; x++) {

			for (int y = x; y < N - x - 1; y++) {

				int temp = arr[x][y];

				arr[x][y] = arr[y][N - 1 - x];

				arr[y][N - 1 - x] = arr[N - 1 - x][N - 1 - y];

				arr[N - 1 - x][N - 1 - y] = arr[N - 1 - y][x];

				arr[N - 1 - y][x] = temp;
			}
		}
	}

	public static void displayMatrix(int N, int arr[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + arr[i][j]);

			System.out.print("\n");
		}
		System.out.print("\n");
	}

}
