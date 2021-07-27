package lecture_11;

import java.util.Scanner;

public class lexiographical_counting {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int end = Scn.nextInt();
		lex(0, end);
	}

	public static void lex(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			lex(curr * 10 + i, end);
		}
	}
}