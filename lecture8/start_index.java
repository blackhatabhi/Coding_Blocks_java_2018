package lecture8;

import java.util.Scanner;

public class start_index {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int M = Scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}
System.out.println(findstartindex(arr, 0,M));
	}

	public static int findstartindex(int[] arr, int vidx, int items) {
		if (vidx == arr.length) {
			return -1;
		}
		if (arr[vidx] == items) {
			return vidx;
		}
		int recans = findstartindex(arr, vidx + 1, items);
		return recans;
	}
}
