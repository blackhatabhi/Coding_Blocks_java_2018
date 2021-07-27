package abhinav;

import java.util.Scanner;

public class mirror_diamond {

	public static void main(String[] args) {
		Scanner Scn=new Scanner(System.in);
		int n=Scn.nextInt();
		for (int i = 0; i <= n/2; i++) {
			for (int y = 0; y <= n/2 - 1; y++) {
				System.out.println("");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n/2; i >= 0; i--) {
			for (int y = 0; y <= n/2 - 1; y++) {
				System.out.println("");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
	}

}
}