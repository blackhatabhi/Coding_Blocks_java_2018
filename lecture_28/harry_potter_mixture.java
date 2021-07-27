package lecture_28;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-10-Nov-2018
 */
public class harry_potter_mixture {

	public static void main(String[] args) {
		int[] arr = { 40, 60, 20 };
		System.out.println(mixture(arr, 0, arr.length - 1));
		System.out.println(mixtureTD(arr, 0, arr.length - 1, new int[arr.length][arr.length]));
		System.out.println(mixtureBU(arr));

	}

	public static int mixture(int[] arr, int si, int ei) {
		if (si >= ei) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = si; k <= ei - 1; k++) {
			int fc = mixture(arr, si, k);
			int sc = mixture(arr, k + 1, ei);
			int sw = colour(arr, si, k) * colour(arr, k + 1, ei);
			int total = fc + sc + sw;
			if (total < min) {
				min = total;
			}

		}
		return min;
	}

	private static int colour(int[] arr, int si, int ei) {
		int sum = 0;
		for (int i = si; i <= ei; i++) {
			sum += arr[i];
		}
		return sum % 100;
	}

	public static int mixtureTD(int[] arr, int si, int ei, int[][] strgs) {
		if (si >= ei) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = si; k <= ei - 1; k++) {
			int fc = mixtureTD(arr, si, k, strgs);
			int sc = mixtureTD(arr, k + 1, ei, strgs);
			int sw = colour(arr, si, k) * colour(arr, k + 1, ei);
			int total = fc + sc + sw;
			if (total < min) {
				min = total;

			}

		}
		strgs[si][ei] = min;
		return min;
	}

	public static int mixtureBU(int[] arr) {
		int n = arr.length;
		int[][] strgs = new int[n][n];
		for (int slide = 1; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = 0;
				ei = si + slide;
				int min = Integer.MAX_VALUE;
				for (int k = si; k <= ei - 1; k++) {
					int fc = strgs[si][k];
					int sc = strgs[k + 1][ei];
					int sw = colour(arr, si, k) * colour(arr, k + 1, ei);
					int total = fc + sc + sw;
					if (total < min) {
						min = total;

					}

				}
				strgs[si][ei] = min;
			}

		}

		return strgs[0][n - 1];
	}
}
