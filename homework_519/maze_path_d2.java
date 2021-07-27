package homework_519;

import java.util.Scanner;

public class maze_path_d2 {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		System.out.println(countD(0, 0, N, N));
		mazepathD(0, 0, N, N, "");
	}

	public static int countD(int cr, int cc, int er, int ec) {
		if (cr == er - 1 && cc == ec - 1) {
			return 1;
		}
		if (cr >= er || cc >= ec) {
			return 0;
		}
		int count = 0;
		count += countD(cr + 1, cc, er, ec);
		count += countD(cr, cc + 1, er, ec);
		if (cr == cc || cc + cr == er - 1)
			count += countD(cr + 1, cc + 1, er, ec);
		return count;
	}

	public static void mazepathD(int cr, int cc, int er, int ec, String ans) {
		if (cr == er - 1 && cc == ec - 1) {
			System.out.print(ans + " ");
			return;
		}
		if (cr >= er || cc >= ec) {
			return;
		}
		mazepathD(cr + 1, cc, er, ec, ans + "V");
		mazepathD(cr, cc + 1, er, ec, ans + "H");
		if (cr == cc || cc + cr == er - 1)
			mazepathD(cr + 1, cc + 1, er, ec, ans + "D");
	}

}
