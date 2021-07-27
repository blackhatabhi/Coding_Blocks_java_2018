package lecture_26;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-04-Nov-2018
 */
public class dp_mazepath_spaceEfiicient {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int M = Scn.nextInt();
		System.out.println(maze(0, 0, N, M));
	}

	public static int maze(int cr, int cc, int er, int ec) {
		int[] strgs = new int[ec+1];
		Arrays.fill(strgs, 1);
		
		for (int i = er-1; i >= 0; i--) {
			for (int j = ec-1; j >= 0; j--) {
				strgs[j]=strgs[j]+strgs[j+1];
			}

		}
		return strgs[0];
	}

}
