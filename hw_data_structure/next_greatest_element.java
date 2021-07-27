package hw_data_structure;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-07-Nov-2018
 */
public class next_greatest_element {
	public static void main(String[] args) {
		next_greatest_element list = new next_greatest_element();
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Scn.nextInt();
		}
		list.nextgreatestelement(arr);
	}

	private void nextgreatestelement(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int arr1[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {

			if (!s.empty()) {
				while (!s.empty() && s.peek() <= arr[i]) {
					s.pop();
				}
			}
			if (s.empty() == true) {
				arr1[i] = -1;
			} else {
				arr1[i] = s.peek();
			}
			s.push(arr[i]);

		}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr1[i] + " ");
	}
}