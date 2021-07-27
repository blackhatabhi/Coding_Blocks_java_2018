package lecture_10;

import java.util.ArrayList;

public class dice_que {

	public static void main(String[] args) {

		System.out.println(dice(0, 3));

	}

	public static ArrayList<String> dice(int curr, int end) {
		if (curr == end) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("\n");
			return bres;
		}
		ArrayList<String> myres = new ArrayList<>();

		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {
			ArrayList<String> recres = dice(curr + dice, end);

			for (String val : recres) {

				myres.add(dice + val);

			}

		}
		return myres;

	}

}
