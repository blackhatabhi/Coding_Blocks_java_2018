package lecture9;

import java.util.ArrayList;

public class keypad_combination {

	public static void main(String[] args) {
		System.out.println(gets("145"));
	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";

	}

	public static ArrayList<String> gets(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(" ");
			return bres;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		String code = getCode(ch);
		ArrayList<String> recres = gets(ros);
		ArrayList<String> myres = new ArrayList<>();
		for (int i = 0; i < code.length(); i++) {
			for (String val : recres) {
				myres.add(code.charAt(i) + val);

			}
			
		}
	
		return myres;
	}	
}
