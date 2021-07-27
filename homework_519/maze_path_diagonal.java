package homework_519;

import java.util.Scanner;

public class maze_path_diagonal {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int M = Scn.nextInt();
		System.out.println(countD(0, 0, N, M));
		mazepathD(0, 0, N, M, "");
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
		mazepathD(cr + 1, cc + 1, er, ec, ans + "D");
	}
}
