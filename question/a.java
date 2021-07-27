package question;

import java.util.Scanner;
import java.util.Stack;

public class a {
	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Scn.nextInt();
		}
		System.out.println(largestRectanglularAreaInHistogram(arr));
	}

	public static int largestRectanglularAreaInHistogram(int[] hist) {
		final Stack<Integer> s = new Stack<>();

		int maxArea = 0;
		int tp = 0;
		int areaWithTop;

		int i = 0;
		while (i < hist.length) {
			if (s.empty() || hist[s.peek()] <= hist[i]) {
				s.push(i++);
			} else
				tp = s.pop();
			int w = s.empty() ? i : i - s.peek() - 1;
			areaWithTop = hist[tp] * w;

			if (maxArea < areaWithTop)
				maxArea = areaWithTop;
		}

		while (!s.empty()) {
			tp = s.pop();
			int w = s.empty() ? i : i - s.peek() - 1;
			areaWithTop = hist[tp] * w;

			if (maxArea < areaWithTop)
				maxArea = areaWithTop;
		}

		return maxArea;
	}

}
