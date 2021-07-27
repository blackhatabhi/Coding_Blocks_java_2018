package abhinav;

import java.util.Scanner;

public class maximum_sum_part_in_twoarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] one = new int[n];
			int[] two = new int[m];
			for (int i = 0; i < n; i++) {
				one[i] = sc.nextInt();
			}
			for (int j = 0; j < m; j++) {
				two[j] = sc.nextInt();
			}
			int sum1 = 0;
			int sum2 = 0;
			int ans = 0;
			int i = 0, j = 0;
			while (i < one.length && j < two.length) {
				if (one[i] < two[j]) {
					sum1 += one[i];
					i++;
				} else if (one[i] > two[j]) {
					sum2 += two[j];
					j++;
				} else {
					ans += Math.max(sum1, sum2) + one[i];
					i++;
					j++;
					sum1 = 0;
					sum2 = 0;
				}
			}
			if (i == one.length) {
				while (j < two.length) {
					sum2 += two[j];
					j++;
				}
			}
			if (j == two.length) {
				while (i < one.length) {
					sum1 += one[i];
					i++;
				}
			}
			ans += Math.max(sum1, sum2);
			System.out.println(ans);

		}
	}
}
