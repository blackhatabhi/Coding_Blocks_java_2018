package lecture_26;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_mazepath_recursive {

	public static void main(String[] args) {
		Scanner Scn=new Scanner(System.in);
		int N=Scn.nextInt();
		int M=Scn.nextInt();
		int [][]arr=new int[N+1][M+1];
		System.out.println(maze(0, 0, N, M,arr));
	}

	public static int maze(int cr, int cc, int er, int ec, int[][] strgs) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (strgs[cr][cc] != 0) {
			return strgs[cr][cc];
		}
		int ch = maze(cr, cc + 1, er, ec, strgs);
		int cv = maze(cr + 1, cc, er, ec, strgs);
		strgs[cr][cc] = ch + cv;
		return ch + cv;
	}
}
