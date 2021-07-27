package lecture8;

public class recursion_4 {

	public static void main(String[] args) {

		System.out.println(fabbonacii(1));
	}

	public static int fabbonacii(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fnm1 = fabbonacii(n - 1);
		int fnm2 = fabbonacii(n - 2);
		int fn = fnm1 + fnm2;

		return fn;

	}
}
