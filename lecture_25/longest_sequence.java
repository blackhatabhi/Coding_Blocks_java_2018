package lecture_25;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-03-Nov-2018
 */
public class longest_sequence {

	public static void main(String[] args) {
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6, 13 };
		System.out.println(longestSequence(arr));
	}

	public static ArrayList<Integer> longestSequence(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (map.containsKey(element - 1)) {
				map.put(element, false);
			} else {
				map.put(element, true);
			}
			if (map.containsKey(element + 1)) {
				map.put(element + 1, false);
			}
		}
		int maxcount = 0;
		int sp = 0;
		for (Integer key : map.keySet()) {
			if (map.get(key)) {
				int count = 0;
				while (map.containsKey(key + count)) {
					count++;
				}
				if (count > maxcount) {
					maxcount = count;
					sp = key;
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < maxcount; i++) {
			ans.add(sp + i);
		}
		return ans;
	}
}
