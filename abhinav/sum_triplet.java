package abhinav;

import java.util.Arrays;
import java.util.Scanner;

public class sum_triplet {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		Arrays.sort(input);
		tripletSum(input, x);
	}

	public static void tripletSum(int[] input, int x) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				for (int k = j + 1; k < input.length; k++) {
					if (input[i] + input[j] + input[k] == x) {
						if (input[i] <= input[j] && input[i] <= input[k]) {
							System.out.print(input[i] + "," + " ");
							if (input[j] < input[k])
								System.out.print(input[j] + "," + " and  " + input[k]);
							else
								System.out.print(input[k] + "," + " and " + input[j]);
						} else if (input[j] <= input[i] && input[j] <= input[k]) {
							System.out.print(input[j] + "," + " ");
							if (input[i] < input[k])
								System.out.print(input[i] + "," + " and " + input[k]);
							else
								System.out.print(input[k] + "," + " and " + input[i]);
						} else {
							System.out.print(input[k] + "," + " ");
							if (input[i] < input[j])
								System.out.print(input[i] + "," + " and " + input[j]);
							else
								System.out.print(input[j] + " " + input[i]);
						}
						System.out.println();
					}
				}
			}
		}
	}
}
