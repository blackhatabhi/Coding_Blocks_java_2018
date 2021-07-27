package homework_519;

import java.util.Scanner;

public class TOWER_OF_HANOI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		towerOfHanoi(n, "T1", "T2", "T3");
		int x = (int) Math.pow(2, n);
		System.out.println(x - 1);
	}

	public static void towerOfHanoi(int n, String from_rod, String to_rod, String aux_rod) {

		if (n == 1) {
			System.out.println("Move 1th disc from " + from_rod + " to " + to_rod);

			return;
		}
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move " + n + "th" + " " + "disc" + " from " + from_rod + " to " + to_rod);
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
	}
}
