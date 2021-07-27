package lecture6;

import java.util.Scanner;

public class take_input_2d_array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = takeinput();
		display(arr);
	}

	public static int[][] takeinput() {
		System.out.println("row ?");
		int rows = scn.nextInt();
		int[][] arr = new int[rows][];
		for (int row = 0; row < arr.length; row++) {
			System.out.println("cols for" + row + "?");
			int cols = scn.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("[" + row + "-" + col + "]");
				arr[row][col] = scn.nextInt();
			}
			
		}return arr;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}
