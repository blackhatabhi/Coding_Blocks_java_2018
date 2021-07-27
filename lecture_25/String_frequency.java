package lecture_25;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-03-Nov-2018
 */
public class String_frequency {
	public static void main(String args[]) {
		Scanner Scn = new Scanner(System.in);
		String Str = Scn.nextLine();
		System.out.println(maxFrequencychar(Str));
	}

	public static char maxFrequencychar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}

		}
		int maxf = 0;
		char maxcharf = ' ';
		for (Character key : map.keySet()) {
			int val = map.get(key);
			if (val > maxf) {
				maxf = val;
				maxcharf = key;
			}
		}

		return maxcharf;

	}
}
