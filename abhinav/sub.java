package abhinav;

import java.util.Arrays;
import java.util.Scanner;

public class sub {
	public static Scanner Scn = new Scanner(System.in);

	public static void main(String[] args) {
		int T = Scn.nextInt();
		while (T != 0) {

			int N = Scn.nextInt();
			
			int[] arr = new int[N];

			for (int i = 0; i < arr.length; i++) {

				arr[i] = Scn.nextInt();
			}
			int M = Scn.nextInt();
			Arrays.sort(arr);

			int i = 0;
			int j = arr.length - 1;

			int ansl = 0;
			int ansr = 0;

			while (i < j) {

				if (arr[i] + arr[j] > M) {
					j--;
				} else if (arr[i] + arr[j] < M) {
					i++;
				} else {
					ansl = arr[i];
					ansr = arr[j];
					i++;
					j--;
				}

				}T--;

			System.out.println("Deepak should buy roses whose prices are"+" "+ ansl  +" "+"and" +" "+ ansr);
			
		}

	}
}