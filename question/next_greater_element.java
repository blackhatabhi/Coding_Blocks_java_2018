package question;

import java.util.Scanner;
import java.util.Stack;

public class next_greater_element {
	public static void main(String args[]) throws Exception {
		Scanner Scn = new Scanner(System.in);
		int T = Scn.nextInt();
		while (T != 0) {
			int N = Scn.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Scn.nextInt();
			}
			nextGreaterElement(arr);
			T--;
		}
	}

	public static void nextGreaterElement(int[] arr) throws Exception {
		Stack<Integer> stack = new Stack<>();
		

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && stack.peek() < arr[i]) {

				int temp = stack.pop();
				System.out.println(temp + "," + arr[i]);

			}

			stack.push(arr[i]);

		}

		while (!stack.isEmpty()) {

			int temp = stack.pop();
			System.out.println(temp + ",-1");

		}

	}
}
