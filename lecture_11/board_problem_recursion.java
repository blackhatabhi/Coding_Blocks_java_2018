package lecture_11;

import java.util.Scanner;

public class board_problem_recursion {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int M = Scn.nextInt();

		System.out.print(maze1(0, N, "", M));

	}

	public static int maze1(int curr, int end, String ans, int M) {
		
		if (curr == end) {
			System.out.println(ans);
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += maze1(curr + dice, end, ans + dice, M);
			
		}
	
		return count;
	}
}
