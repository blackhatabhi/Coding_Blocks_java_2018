package homework_519;

import java.util.Scanner;

public class hw_7_firstindex {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int M = Scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
		}

		System.out.println(lastIndex(arr,0,M));

	}
	
		public static int lastIndex(int input[], int x, int startIndex) {
		if(startIndex == input.length) {
		return -1;
		}
		int smallAns = lastIndex(input, x, startIndex + 1);
		if(smallAns != -1) {
		return smallAns;
		}
		if(input[startIndex] == x) {
		return startIndex;
		}
		else {
		return -1;
		}
		}
		public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, 0);
		}
		}
