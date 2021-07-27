package lecture_10;

import java.util.ArrayList;

public class maze {

	public static void main(String[] args) {
		System.out.println(maze1(0, 0, 2, 2));
	}

	public static ArrayList<String> maze1(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(" ");
			return bres;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		ArrayList<String> myres = new ArrayList<>();

		ArrayList<String> recres = maze1(cr, cc + 1, er, ec);

		for (String val : recres) {

			myres.add("H" + val);

		}
		ArrayList<String> recres1 = maze1(cr + 1, cc, er, ec);
		for (String val : recres1) {

			myres.add("V" + val);

		}
		return myres;
	}

}
