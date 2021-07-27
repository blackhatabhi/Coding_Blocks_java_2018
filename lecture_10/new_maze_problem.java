package lecture_10;

import java.util.ArrayList;

public class new_maze_problem {

	public static void main(String[] args) {

		System.out.println(maze3(0, 0, 2, 2));
	}

	public static ArrayList<String> maze3(int cr, int cc, int er, int ec) {
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
		for (int mult = 1; mult < cc; mult++) {
			ArrayList<String> recres = maze3(cr, cc + mult, er, ec);

			for (String val : recres) {

				myres.add("H" + val);

			}
			ArrayList<String> recres1 = maze3(cr + mult, cc, er, ec);
			for (String val : recres1) {

				myres.add("V" + val);

			}
			ArrayList<String> recres2 = maze3(cr + mult, cc + 1, er, ec);
			for (String val : recres2) {

				myres.add("D" + val);

			}
		}return myres;
		
	}
}
