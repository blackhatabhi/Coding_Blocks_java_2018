package lecture_12;

import java.util.Scanner;

public class backtracking_1_nqueens {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		System.out.println(count(new boolean[N][N], 0, ""));
		nqueens(new boolean[N][N], 0, "");
	}

	public static void nqueens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.print(ans + " ");
			return;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (safety(board, row, col)) {
				board[row][col] = true;
				nqueens(board, row + 1, ans + "{" + (row + 1) + "-" + (col + 1) + "}");
				board[row][col] = false;
			}
		}
		return;
	}

	public static int count(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[0].length; col++) {
			if (safety(board, row, col)) {
				board[row][col] = true;
				count += count(board, row + 1, ans + "{" + (row + 1) + "-" + (col + 1) + "}");
				board[row][col] = false;
			}
		}
		return count;
	}

	public static boolean safety(boolean[][] board, int row, int col) {
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
}