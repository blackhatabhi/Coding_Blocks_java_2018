package lecture2;

import java.util.Scanner;

public class pattern10 {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int i, j, k, k_flag = 0;
		for (i = 1; i <= N; i++) {
			for (j = 1; j <= i; j++) {
				if (i >= 3) {
					for (k = 1; k <= i; k++) {
						if (k == 1 || k == i) {
							System.out.print(i+" ");
						} else {
							System.out.print('0'+" ");
						}
						if (k == i) {
							k_flag = 1;
						}
					}
				} else {
					System.out.print(i+" ");
				}
				if (k_flag == 1) {
					break;
				}
			}
			System.out.println();
		}
	}
}
