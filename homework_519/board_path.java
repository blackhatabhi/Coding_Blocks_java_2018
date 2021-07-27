package homework_519;

import java.util.Scanner;

public class board_path {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int M = Scn.nextInt();
		int count = countboardpath(0, N, "", M);
		System.out.println(count);
		boardpath(0, N, "", M);

	}

	public static int countboardpath(int curr, int end, String str, int M) {
		if (curr == end) {
			return 1;
		}
		int count = 0;
		if (curr > end) {
			return 0;
		}
		for (int dice = 1; dice <= M; dice++) {
			count += countboardpath(curr + dice, end, str + dice, M);
		}
		return count;
	}

	public static void boardpath(int curr, int end, String Str, int M) {
		if (curr == end) {
			System.out.println(Str);
		}
		if (curr > end) {
			return;
		}
		for (int dice = 1; dice <= M; dice++) {
			boardpath(curr + dice, end, Str + dice, M);
		}
	}
}
