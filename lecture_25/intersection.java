package lecture_25;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-03-Nov-2018
 */
public class intersection {

	public static void main(String[] args) {
		int[] one = { 5, 3, 2, 1, 5, 5, 3, 2 };
		int[] two = { 2, 2, 10, 3, 5, 1, 80 };
		System.out.println(intersection1(one, two));
	}

	public static ArrayList<Integer> intersection1(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < one.length; i++) {
			int element = one[i];
			if (map.containsKey(element)) {
				map.put(element, map.get(element) + 1);
			} else {
				map.put(element, 1);
			}
		}
		for (int i = 0; i < two.length; i++) {
			int element = two[i];
			if (map.containsKey(element) && map.get(element) > 0) {
				ans.add(element);
				map.put(element, map.get(element) - 1);
			}
		}
		return ans;
	}

}
