package lecture5;

import java.util.Scanner;

public class rotation_array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = { 20, 30, 40, 50 };
		int[] rotated = rotate(arr, 3);
		display(rotated);
	}

	public static int[] rotate(int[] arr, int r) {
		int[] ans = new int[arr.length];
		for (int i = 0; i < ans.length; i++) {
			if (i < r) {
				ans[i] = arr[i + arr.length - r];
			} else {
				ans[i] = arr[i - r];
			}
		}
		return ans;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}
}
