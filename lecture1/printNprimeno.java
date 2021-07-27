package lecture1;

import java.util.Scanner;

public class printNprimeno {

	Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
	int p;
	{
		for (int i = 2; i <= N; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					p = 1;
			}
			if (p == 0) {
				System.out.println(i);
			}
		}
	}
}