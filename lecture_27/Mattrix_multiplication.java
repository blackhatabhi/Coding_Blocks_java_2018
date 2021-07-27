package lecture_27;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-05-Nov-2018
 */
public class Mattrix_multiplication {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Scn.nextInt();
		}
		int[][] strg = new int[arr.length][arr.length];
		System.out.println(MCM(arr, 0, arr.length - 1));
		System.out.println(MCMTD(arr, 0, arr.length - 1, strg));
		System.out.println(MCMBD(arr));

	}

	public static int MCM(int[] arr, int si, int ei) {
		if (si + 1 == ei) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fc = MCM(arr, si, k);
			int sc = MCM(arr, k, ei);
			int sw = arr[si] * arr[k] * arr[ei];
			int total = fc + sc + sw;
			if (total < min) {
				min = total;
			}
		}
		return min;
	}

	public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {
		if (si + 1 == ei) {
			return 0;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fc = MCMTD(arr, si, k, strg);
			int sc = MCMTD(arr, k, ei, strg);
			int sw = arr[si] * arr[k] * arr[ei];
			int total = fc + sc + sw;
			if (strg[si][ei] < min) {
				min = total;
			}
		}
		strg[si][ei] = min;
		return min;
	}

	public static int MCMBD(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[arr.length][arr.length];
		for (int slide = 1; slide <= n - 2; slide++) {
			for (int si = 0; si <= n - slide - 2; si++) {
				int ei = si + slide + 1;
				int min = Integer.MAX_VALUE;
				for (int k = si + 1; k <= ei - 1; k++) {
					int fc = MCMTD(arr, si, k, strg);
					int sc = MCMTD(arr, k, ei, strg);
					int sw = arr[si] * arr[k] * arr[ei];
					int total = fc + sc + sw;
					if (strg[si][ei] < min) {
						min = total;
					}
				}
				strg[si][ei] = min;
				
			}
		}
		return strg[0][n-1];
	}
}
