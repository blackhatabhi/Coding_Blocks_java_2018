package lecture6;

import java.util.Scanner;

public class waves {
	static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int[][]arr= {{10,20,30},
					{40,50,60},
					{45,56,67}};
			wavedisplay(arr);
		}


		public static void wavedisplay(int[][] arr) {
			for (int col = 0; col< arr[0].length; col++) {
				if(col%2==0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}}else {
					for(int row=arr.length-1;row>=0;row--) {
						System.out.print(arr[row][col] + " ");
					}
				}
				System.out.println();
			}
		}
}
