package lecture4;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		printallarmstrong(0, 10);
	}

	public static void printallarmstrong(int ll, int ul) {
		for (int i = ll; i <= ul; i++) {
			int digit = nod(i);
			if (armstrong(i, digit)) {
				System.out.println(i);
			}
		}

	}

	public static int nod(int num) {
		int count = 0;
		while (num !=0) {
			num = num / 10;
			count++;

		}
		return count;
	}

	public static boolean armstrong (int num, int a) {
		int ans = 0;
		int temp = num;
		while (num != 0) {
		
		int rem = num % 10;
		ans = ans + (int) Math.pow(rem, a);
		num = num / 10;
		}
		if (ans == temp) {
			return true;

		} else {
			return false;

		}

	}
}
