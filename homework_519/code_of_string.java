package homework_519;

import java.util.ArrayList;
import java.util.Scanner;

public class code_of_string {
static int ans;
	public static void main(String[] args) {
		Scanner Scn=new Scanner(System.in);
		String Str=Scn.nextLine();
		System.out.println(codesofstring(Str));

	}

	public static ArrayList<String> codesofstring(String str) {

		if (str.length() == 0) {

			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		char val = (char) (ch + 48);

		ArrayList<String> rr = codesofstring(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String s : rr) {
			mr.add(val + s);
		}

		if (str.length() > 1) {

			String ch2 = str.substring(0, 2);
			int value = Integer.parseInt(ch2);

			if (value <= 26) {

				char alpha = (char) ('a' + value - 1);

				ros = str.substring(2);

				rr = codesofstring(ros);

				for (String s : rr) {
					 mr.add(alpha + s);
				}

			}
		}

		return mr;
	}

}
