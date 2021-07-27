package question;

import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {
	public static void main(String[] args) throws Exception {
		Scanner Scn = new Scanner(System.in);
		int T = Scn.nextInt();

		while (T != 0) {
			int N = Scn.nextInt();
			int price[] = new int[N];
			for (int i = 0; i < N; i++) {
				price[i] = Scn.nextInt();
			}
			int[] span = stockSpan(price);
			for (int val : span) {
				System.out.print(val + " ");

			}
			T--;

		}
	}

	public static int[] stockSpan(int[] prices) throws Exception {
		Stack<Integer> stack = new Stack<>();

		int[] span = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {

			while (!stack.isEmpty() && prices[stack.peek()] < prices[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - stack.peek();
			}

			stack.push(i);
		}

		return span;

	}
}