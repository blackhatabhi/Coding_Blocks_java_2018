package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-11-Nov-2018
 */
public class coin_change {

	public static int count(int S[], int m, int n) {

		int table[] = new int[n + 1];

		table[0] = 1;
		for (int i = 0; i < m; i++)
			for (int j = S[i]; j <= n; j++)
				table[j] += table[j - S[i]];

		return table[n];
	}

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int k = Scn.nextInt();
		int n = Scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Scn.nextInt();
		}
		System.out.println(count(arr, n, k));

	}
}
