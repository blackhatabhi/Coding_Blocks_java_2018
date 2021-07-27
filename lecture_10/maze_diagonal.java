package lecture_10;

import java.util.ArrayList;

public class maze_diagonal {

	public static void main(String[] args) {

		System.out.println(maze2(0, 0, 3, 3));

	}

	public static ArrayList<String> maze2(int cr, int cc, int er, int ec) {
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

		ArrayList<String> recres = maze2(cr, cc + 1, er, ec);

		for (String val : recres) {

			myres.add("H" + val);

		}
		ArrayList<String> recres1 = maze2(cr + 1, cc, er, ec);
		for (String val : recres1) {

			myres.add("V" + val);

		}
		ArrayList<String> recres2 = maze2(cr + 1, cc + 1, er, ec);
		for (String val : recres2) {

			myres.add("D" + val);

		}
		return myres;
	}
}
