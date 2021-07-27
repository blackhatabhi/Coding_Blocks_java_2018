package lecture6;

import java.util.Scanner;

public class spiral_array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int M;

		int N;

		M = scanner.nextInt();

		N = scanner.nextInt();

		int[][] arr = new int[M][N];

		for (int i = 0; i < M; i++) {

			for (int j = 0; j < N; j++) {

				arr[i][j] = scanner.nextInt();

			}

		}
		spiraldisplay(arr);
		
	}

	public static void spiraldisplay(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int count = 0;
		int nill = arr.length * arr[0].length;

		while (count < nill) {
			for (int row = minrow; count < nill && row <= maxrow; row++) {
				System.out.print(arr[row][mincol] + ", ");
				count++;
			}
			mincol++;
			for (int col = mincol; count < nill && col <= maxcol; col++) {
				System.out.print(arr[maxrow][col] + ", ");
				count++;
			}
			maxrow--;
			for (int row = maxrow; count < nill && row >= minrow; row--) {
				System.out.print(arr[row][maxcol] + ", ");
				count++;
			}
			maxcol--;
			for (int col = maxcol; count < nill && col >= mincol; col--) {
				System.out.print(arr[minrow][col] + ", ");
				count++;
			}
			minrow++;
		}

		System.out.println("END");
	}
}