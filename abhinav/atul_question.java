package abhinav;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-01-Feb-2019
 */
public class atul_question {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Scn.nextInt();

		}
		int m = Scn.nextInt();
		abhinav(arr, n, m);

	}

	public static void abhinav(int arr[], int n, int m) {
		int j = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == m) {
				j = i;
				break;
			}
		}

		if (j == -1) {
			System.out.println("-1");
			return;
		}

		int v = j;
		for (int h = n-1 ; h >= j; h--) {
			if (arr[h] == m) {
				v = h;
				break;
			}
		}
		System.out.print(j);
		System.out.print(" , ");
		System.out.print(v);
	}
}
