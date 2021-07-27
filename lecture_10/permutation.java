package lecture_10;

import java.util.ArrayList;

public class permutation {

	public static void main(String[] args) {
		System.out.println(permut("abcd"));
	}

	public static ArrayList<String> permut(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(" ");
			return bres;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recres = permut(ros);
		ArrayList<String> myres = new ArrayList<>();
		
			for (String val : recres) {
				for (int i = 0; i < val.length(); i++) {
			String ans=val.substring(0, i)+ch+val.substring(i);
			myres.add(ans);

			}
			
		}
	
		return myres;
	}	
}
