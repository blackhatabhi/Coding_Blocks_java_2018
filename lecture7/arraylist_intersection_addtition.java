package lecture7;

import java.util.ArrayList;

public class arraylist_intersection_addtition {

	public static void main(String[] args) {
		int[] one = { 10, 20, 30, 30, 40, 40, 50, 50, 50 };
		int[] two = { 10, 10, 10, 20, 30, 30, 30, 40, 60 };

		System.out.println(intersection(one, two));
	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				i++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				list.add(one[i]);
				i++;
				j++;
			}
		}
		return list;

	}
}
