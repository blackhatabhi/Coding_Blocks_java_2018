package lecture6;

import java.util.Scanner;

public class verticle_display {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int[][]arr= {{10,20,30},
					{40,50,60},
					{45,56,67}};
			verticledisplay(arr);
		}

		public static void verticledisplay(int[][] arr) {
			
			for (int col = 0; col< arr[0].length; col++) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			}
		}
	}