package lecture_12;

import java.util.Scanner;

public class backtracking_2_merzesort {
	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}
		int[] ans = merzsort(arr, 0, arr.length - 1);
		for (int val : ans) {
			System.out.println(val);
		}

	}

	public static int[] mergetwo(int[] one, int[] two) {
		int[] merge = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				merge[k] = one[i];
				k++;
				i++;
			} else {
				merge[k] = two[j];
				k++;
				j++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				merge[k] = two[j];
				k++;
				j++;
			}
		}
		if (j == two.length) {
			while (i < one.length) {
				merge[k] = one[i];
				k++;
				i++;
			}

		}
		return merge;
	}

	public static int[] merzsort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;
		int[] fh = merzsort(arr, lo, mid);
		int[] sh = merzsort(arr, mid + 1, hi);
		
		int[] sorted = mergetwo(fh, sh);
		return sorted;
	}
}
