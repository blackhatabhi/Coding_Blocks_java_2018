package homework_519;

import java.util.Scanner;

public class maze_path1_ans {

	public static void main(String args[]) {
		Scanner sj = new Scanner(System.in);
		int N1 = sj.nextInt();
		int N2 = sj.nextInt();

		int count = mazepath(0, 0, N1 - 1, N2 - 1, "");
		System.out.println(count);
		maze(1, 1, N1, N2, "");

	}

	public static void maze(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {

			System.out.print(ans + " ");
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}

		maze(cr + 1, cc, er, ec, ans + 'V');
		maze(cr, cc + 1, er, ec, ans + 'H');

	}

	public static int mazepath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {

			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count += mazepath(cr + 1, cc, er, ec, ans + 'V');
		count += mazepath(cr, cc + 1, er, ec, ans + 'H');
		return count;

	}

}
