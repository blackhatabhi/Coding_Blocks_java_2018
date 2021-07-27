package lecture5;

import java.util.Scanner;

public class selection_sort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N=Scn.nextInt();
	    int [] arr = new int[N];

	    for (int i = 0; i < arr.length; i++)
	    {
	        
	        arr[i] = Scn.nextInt();
	    }
		selectionsort(arr);
	}

	public static void selectionsort(int[] arr) {
		// int counter = 0;

		int n = arr.length;
		for (int counter = 0; counter < n; counter++) {
			int min = counter;
			for (int j = counter + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;
		}
		display(arr);
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}
}
