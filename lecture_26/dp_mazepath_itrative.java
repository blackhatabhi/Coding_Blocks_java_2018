package lecture_26;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_mazepath_itrative {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int M = Scn.nextInt();
		System.out.println(maze(0, 0, N, M));
	}

	public static int maze(int cr, int cc, int er, int ec) {
		int[][] strgs = new int[er + 2][ec + 2];
		strgs[er][ec] = 1;
		for (int i = er; i >= 0; i--) {
			for(int j=ec;j>=0;j--) {
			if(i==er&&j==ec) {
				strgs[i][j]=1;
			}else {
				strgs[i][j]=strgs[i][j+1]+strgs[i+1][j];
			}
			}
			
		}
		return strgs[0][0];
	}
}
