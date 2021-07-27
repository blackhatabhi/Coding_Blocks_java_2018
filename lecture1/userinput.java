package lecture1;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		System.out.println("enter the no. \n");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if (n == 0) {
			System.out.println("0 is neither odd nor prime");
		} else {
			if (n % 2 == 1) {

				System.out.println("no. is odd");
			} else {
				System.out.println("no. is even");
			}
		}
	}
}