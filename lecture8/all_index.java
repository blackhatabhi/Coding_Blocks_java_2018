package lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class all_index {

	public static void main(String[] args) {
		
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}
		System.out.println(allindexarraylist(arr, 0, 20));
	}

	public static ArrayList<Integer> allindexarraylist(int[] arr, int vidx, int items) {
		if (vidx == arr.length) {
			ArrayList<Integer> bres = new ArrayList<>();
			return bres;

		}
		ArrayList<Integer> recans = allindexarraylist(arr, vidx + 1, items);

		if (arr[vidx] == items) {
			recans.add(0, vidx);
		}
		return recans;
	}
}
