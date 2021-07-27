package lecture8;

import java.util.Scanner;

public class ending_index {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}
		System.out.println(findendindex(arr, 0, 20));

	}

	public static int findendindex(int[] arr, int vidx, int items) {
		if (vidx == arr.length) {
			return -1;
		}

		int recans = findendindex(arr, vidx + 1, items);
		if (arr[vidx] == items && recans == -1) {

			return vidx;
		}
		return recans;
	}
}
