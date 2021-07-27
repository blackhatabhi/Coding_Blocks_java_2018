package abhinav;

import java.util.*;

public class sum_triplet_corrected {

	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {

		int N = scn.nextInt();
		int[] array = new int[N];

		input(array, N);
		bubbleSort(array);

		int target = scn.nextInt();
		sum_triplet(array, N, target);

	}

	public static void input(int[] array, int size) {

		for (int i = 0; i < size; i++) {
			array[i] = scn.nextInt();
		}
	}

	public static void bubbleSort(int[] arr) {

		int N = arr.length;

		for (int counter = 0; counter < N - 1; counter++) {
			for (int j = 0; j < N - 1 - counter; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void sum_triplet(int[] arr, int size, int target) {

		for (int i = 0; i < size; i++) {
			int temp = arr[i];
			for (int j = i + 1; j < size; j++) {
				int temp1 = arr[j];
				for (int k = j + 1; k < size; k++) {

					if ((temp + temp1 + arr[k]) == target) {
						System.out.println(temp + ", " + temp1 + " and " + arr[k]);
					}
				}
			}
		}
	}

}
