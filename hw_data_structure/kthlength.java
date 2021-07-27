package hw_data_structure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-10-Nov-2018
 */
public class kthlength {
	public static void kLargest(int[] arr, int k) {

		Arrays.sort(arr);

		for (int i = 0; i < k; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Scn.nextInt();
		}
		int k = Scn.nextInt();
		kLargest(arr, k);
	}
}
