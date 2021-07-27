package lecture8;

import java.util.Scanner;

public class recursion_arr_max {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}
		System.out.println(max(arr, 0));

	}

	public static int max(int[] arr, int vidx) {
		if (vidx == arr.length-1) {
			return arr[vidx];
		}
		int sp = max(arr, vidx + 1);
		if (sp > arr[vidx]) {
			return sp;
		} else {
			return arr[vidx];
		}
	}
}
