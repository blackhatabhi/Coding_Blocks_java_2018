package lecture_10;

import java.util.ArrayList;

public class coin_toss {

	public static void main(String[] args) {
		System.out.println(coin(3));
	}

	public static ArrayList<String> coin(int n) {
		if (n == 0) {
			ArrayList<String> baseres = new ArrayList<>();
			baseres.add(" ");
			return baseres;
		}
		ArrayList<String> recres = coin(n - 1);
		ArrayList<String> myres = new ArrayList<>();
		for (String val : recres) {

			myres.add("H" + val);
			myres.add("T" + val);

		}
		return myres;
	}
}