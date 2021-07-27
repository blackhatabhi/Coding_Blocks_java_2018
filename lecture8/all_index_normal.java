package lecture8;

import java.util.Scanner;

public class all_index_normal {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}
		int[] brr = findallindex(arr, 0, 20, 0);
		for (int val : brr) {
			System.out.println(val);
		}
	}

	public static int[] findallindex(int[] arr, int vidx, int items, int count) {
		if (vidx == arr.length) {
			int[] bres = new int[count];
			return bres;
		}

		if (arr[vidx] == items) {
			int[] recans = findallindex(arr, vidx + 1, items, count + 1);
			recans[count] = vidx;
			return recans;
		} else {
			return findallindex(arr, vidx + 1, items, count);
		}

	}

}
