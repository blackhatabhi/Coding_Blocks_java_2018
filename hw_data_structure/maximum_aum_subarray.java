package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-11-Nov-2018
 */
public class maximum_aum_subarray {
	public static int kadane(int[] A) {

		int maxSoFar = 0;

		int maxEndingHere = 0;

		for (int i : A) {

			maxEndingHere = maxEndingHere + i;

			maxEndingHere = Integer.max(maxEndingHere, 0);

			maxSoFar = Integer.max(maxSoFar, maxEndingHere);
		}

		return maxSoFar;
	}

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Scn.nextInt();

		}
		System.out.println(kadane(arr));
	}
}
