package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-10-Nov-2018
 */
public class longest_increasing_subsequences {
	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Scn.nextInt();
		}
		System.out.println(list(arr));
	}

	public static int list(int[] arr) {
		int stg[] = new int[arr.length];
		stg[0] = 1;
		int ans = 1;
		for (int i = 1; i < stg.length; i++) {
			int max = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					int op = stg[j] + 1;
					if (op > max) {
						max = op;
					}
				}

			}
			stg[i] = max;
			if (max > ans) {
				ans = max;
			}
		}
		return ans;
	}
}
