package lecture_13;

import java.util.Scanner;

public class palindrome_time {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		String s = Scn.nextLine();
		System.out.println(countpalindrome(s));
	}

	public static int countpalindrome(String s) {
		int count = 0;
		for (int a = 0; a < s.length(); a++) {
			for (int o = 0; a - o >= 0 && a + o < s.length(); o++) {
				if (s.charAt(a - o) == s.charAt(a + 0)) {
					count++;
				} else {
					break;
				}
			}
		}
			for (double a1 = 0.5; a1 < s.length(); a1++) {
				for (double ox = 0.5; a1 - ox >= 0 && a1 + ox < s.length(); ox++) {
					if (s.charAt((int) (a1 - ox)) == s.charAt((int) (a1 + ox))) {
						count++;
					} else {
						break;
					}

				}
			}
		

		return count;
	}
}
