package homework_519;

import java.util.Scanner;

public class chess_board {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		 System.out.println(chess_board1(0, 0, n, n));
		 chess_board1(0, 0, n, n, "");
	}

	public static void chess_board1(int cr, int cc, int er, int ec, String ans) {

		if (cr == er - 1 && cc == ec - 1) {

			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			return;
		}

		if (cr >= er || cc >= ec) {
			return;
		}

		chess_board1(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		chess_board1(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {

			for (int moves = 1; moves < ec; moves++)
				chess_board1(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}R");

			for (int moves = 1; moves < er; moves++)
				chess_board1(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");

		}

		if (cr == cc || cr + cc == er - 1) {

			for (int moves = 1; moves < er; moves++) {

				chess_board1(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}B");
			}
		}
	}

	public static int chess_board1(int cr, int cc, int er, int ec) {

		// Positive Base Case

		if (cr == er - 1 && cc == ec - 1) {

			return 1;
		}

		if (cr >= er || cc >= ec) {
			return 0;
		}
		int cnt = 0;

		cnt += chess_board1(cr + 2, cc + 1, er, ec);
		cnt += chess_board1(cr + 1, cc + 2, er, ec);

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {

			for (int moves = 1; moves < ec; moves++)
				cnt += chess_board1(cr, cc + moves, er, ec);

			for (int moves = 1; moves < er; moves++)
				cnt += chess_board1(cr + moves, cc, er, ec);

		}

		if (cr == cc || (cr + cc == er - 1)) {

			for (int moves = 1; moves < er; moves++) {

				cnt += chess_board1(cr + moves, cc + moves, er, ec);
			}

		}
		return cnt;

	}

}
