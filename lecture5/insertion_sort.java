package lecture5;

import java.util.Scanner;

public class insertion_sort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N=Scn.nextInt();
	    int [] arr = new int[N];

	    for (int i = 0; i < arr.length; i++)
	    {
	        
	        arr[i] = Scn.nextInt();
	    }
		insertion(arr);

	}

	public static void insertion(int[] arr) {
		int n = arr.length;
		for (int counter = 1; counter < n; counter++) {
			int item = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = item;
			
		}display(arr);
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}
}
