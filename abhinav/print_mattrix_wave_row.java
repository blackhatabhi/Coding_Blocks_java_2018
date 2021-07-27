package abhinav;

import java.util.Scanner;

public class print_mattrix_wave_row {
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

		print(arr);
	}

	static void print(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < arr[0].length; j++)
					System.out.print(arr[i][j] + ", ");

			} else {
				for (int j = arr[0].length - 1; j >= 0; j--)
					System.out.print(arr[i][j] + ", ");
			}
		}System.out.println("END");
	}

}
