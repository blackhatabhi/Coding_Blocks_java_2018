package question;

import java.util.Scanner;
import java.util.Stack;

public class histogram {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		long hist[] = new long[N];
		for (int i = 0; i < N; i++) {
			hist[i] = Scn.nextInt();
		}
		System.out.println(histogram_area(hist));
	}

	public static long histogram_area(long[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}

		Stack<Integer> stack = new Stack<Integer>();

		long max = 0;
		int i = 0;

		while (i < height.length) {
			if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
				stack.push(i);
				i++;
			} else {
				int p = stack.pop();
				long h = height[p];
				int w = stack.isEmpty() ? i : i - stack.peek() - 1;
				max = Math.max(h * w, max);
			}
		}
		while (!stack.isEmpty()) {
			int p = stack.pop();
			long h = height[p];
			int w = stack.isEmpty() ? i : i - stack.peek() - 1;
			max = Math.max(h * w, max);
		}

		return max;
	}
}