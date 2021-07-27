package lecture_11;

import java.util.Scanner;

public class maze_prob {

	public static void main(String[] args) {
		Scanner Scn=new Scanner(System.in);
		int N=Scn.nextInt();
		int M=Scn.nextInt();
		System.out.println(maze(0, 0, N, M, ""));

	}

	public static int maze(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return 1;
		}
		if (cr > er || cc > ec) {
			System.out.println(ans);
			return 0;
		}
		int ch = maze(cr, cc + 1, er, ec, ans + "H");
		int cv = maze(cr + 1, cc, er, ec, ans + "V");
		return ch + cv;
	}
}
