package lecture4;

import java.util.Scanner;

public class Takeinput {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = takeinput();
		System.out.println("------------------------------");
		display(arr);
		System.out.println("------------------------------");
		
	}

	public static int[] takeinput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}


	
	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}
}