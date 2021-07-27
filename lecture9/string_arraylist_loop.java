package lecture9;

import java.util.ArrayList;

public class string_arraylist_loop {

	public static void main(String[] args) {

		System.out.println(getss("abcd"));

	}

	public static ArrayList<String> getss(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(" ");
			return bres;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recres = getss(ros);
		ArrayList<String> myres = new ArrayList<>();
		for (String val : recres) {
			myres.add(val);
			myres.add(ch + val);
		}
		return myres;
	}
}
