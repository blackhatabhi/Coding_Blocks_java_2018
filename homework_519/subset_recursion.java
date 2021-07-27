package homework_519;

import java.util.Scanner;

public class subset_recursion {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Scn.nextInt();
		}
		int target = Scn.nextInt();
		System.out.println(count(arr, 0, 0, "", target));
		subset(arr, 0, 0, "", target);

	}

	public static void subset(int[] arr, int vidx, int sum, String ans, int target) {
		if (vidx == arr.length) {
			if (sum == target) {
				System.out.print(ans);
			}
			return;
		}
		subset(arr, vidx + 1, sum + arr[vidx], ans + " " + arr[vidx], target);
		subset(arr, vidx + 1, sum, ans, target);

	}

	public static int count(int[] arr, int vidx, int sum, String ans, int target) {
		if (vidx == arr.length) {
			if (sum == target) {
				return 1;
			}
			return 0;
		}
		int count = 0;
		count += count(arr, vidx + 1, sum + arr[vidx], ans + " " + arr[vidx], target);
		count += count(arr, vidx + 1, sum, ans, target);
		return count;
	}
}