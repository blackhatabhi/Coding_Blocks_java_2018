package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-11-Nov-2018
 */
public class count_the_binary_no {
	public static int countStrings(int n) {
		int a[] = new int[n];
		int b[] = new int[n];
		a[0] = b[0] = 1;
		for (int i = 1; i < n; i++) {
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
		}
		return a[n - 1] + b[n - 1];
	}

	/* Driver program to test above function */
	public static void main(String args[]) {
		Scanner Scn = new Scanner(System.in);
		int t = Scn.nextInt();
		while (t != 0) {
			int n = Scn.nextInt();
			System.out.println(countStrings(n));
			t--;
		}
	}
}
