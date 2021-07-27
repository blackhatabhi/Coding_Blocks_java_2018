package lecture9;

import java.util.ArrayList;

public class string_arraylist_substitient {

	public static void main(String[] args) {
		System.out.println(getsss("abcd"));
	}

	public static ArrayList<String> getsss(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(" ");
			return bres;}
			char ch = str.charAt(0);
			String ros = str.substring(1);
			ArrayList<String> recres = getsss(ros);
			ArrayList<String> myres = new ArrayList<>();
			
			for (String val : recres) {
				
			myres.add(val);
				myres.add(ch + val);
				myres.add(ch + (int)ch +val);
				
				
				
			}
			
			return myres;
			
	}
}
