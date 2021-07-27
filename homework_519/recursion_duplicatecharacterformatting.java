package homework_519;

import java.util.Scanner;

public class recursion_duplicatecharacterformatting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		System.out.println(addStars(s));

	}
		public static String addStars(String s) {
		if(s.length() <= 1) {
		return s;
		}
		String out = addStars(s.substring(1));
		if(s.charAt(0) == s.charAt(1)) {
		out = s.charAt(0) + "*" + s.charAt(1) + out.substring(1);
		}
		else {
		out = s.charAt(0) + out;
		}
		return out;
}
}