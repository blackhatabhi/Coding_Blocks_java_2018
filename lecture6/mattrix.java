package lecture6;

import java.util.Scanner;

public class mattrix {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] one = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] two = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] res = mattrixmult(one, two);
		display(res);
	}

	public static int[][] mattrixmult(int[][] one, int[][] two) {
		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;
		if (c1 != r2) {
			return null;
		}
		int[][] res = new int[r1][c2];
		for (int row = 0; row < res.length; row++) {
			for (int col = 0; col < res[0].length; col++) {
				int sum = 0;
				for (int k = 0; k < c1; k++) {
					sum = one[row][k] * two[k][col];
				}
				res[row][col] = sum;
			}
		}

		return res;

	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}
