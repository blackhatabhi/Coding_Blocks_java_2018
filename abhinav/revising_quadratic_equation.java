package abhinav;

import java.util.Scanner;

public class revising_quadratic_equation {
	public static void main(String args[]) {

		Scanner gg = new Scanner(System.in);
		int a, b, c;
		float discriminant;
		a = gg.nextInt();
		b = gg.nextInt();
		c = gg.nextInt();
		discriminant = (b * b) - (4 * a * c);

		int flag = 0;

		if (discriminant > 0) {
			System.out.println("real and distinct");
			flag = 1;
		}
		if (discriminant == 0) {
			System.out.println("real and equal");
			flag = 1;
		}
		if (discriminant < 0) {
			System.out.println("imaginary");
		}

		if (flag == 1) {
			float sqroot = (float) Math.pow(discriminant, 0.5);

			float d = -(b) + sqroot;
			float e = 2 * a;
			float f = d / e;

			float g = -(b) - sqroot;
			float h = g / e;
			System.out.print((int) h + " " + (int) f);
		}

	}
}
