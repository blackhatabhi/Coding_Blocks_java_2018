package lecture5;

import java.util.Scanner;

public class bubble_sort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N=scn.nextInt();
	    int [] arr = new int[N];

	    for (int i = 0; i < arr.length; i++)
	    {
	        
	        arr[i] = Scn.nextInt();
	    }
		bubblesort(arr);
		
	}

	public static void bubblesort(int[] arr) {
		int n = arr.length;
		for (int counter = 0; counter < n - 1; counter++) {
			for (int j = 0; j < n - counter - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}display(arr);
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}
}
