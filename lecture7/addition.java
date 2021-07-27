package lecture7;

import java.util.ArrayList;

public class addition {

	public static void main(String[] args) {
		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 9, 9, 9, 9, 9 };

		System.out.println(add(one, two));

	}

	public static ArrayList<Integer> add(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		int i = one.length - 1;
		int j = two.length - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += one[i];
			}
			if (j >= 0) {
				sum += two[j];
			}
			int rem = sum % 10;
			carry = sum / 10;
			ans.add(0, rem);
			i--;
			j--;
		}
		if (carry != 0) {
			ans.add(0, carry);
		}
		return ans;
	}
}
