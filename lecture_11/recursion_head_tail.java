package lecture_11;

public class recursion_head_tail {

	public static void main(String[] args) {
		coin(3, " ");
	}

	public static void coin(int n, String ans) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}

		coin(n - 1, ans + "H");
		coin(n - 1, ans + "T");

	}
}
