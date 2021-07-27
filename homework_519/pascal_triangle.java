package homework_519;


import java.util.Scanner;

public class pascal_triangle {
public static void main(String args[]) 
    { Scanner Scn=new Scanner(System.in);
    int n = Scn.nextInt(); 
    printPascal(n); 
    }

		static void printPascal(int n) {

			for (int line = 0; line < n; line++) {

				for (int i = 0; i <= line; i++)
					System.out.print(binomialCoeff(line, i) + "   ");

				System.out.println();
			}
		}

		static int binomialCoeff(int n, int k) {
			int res = 1;

			if (k > n - k)
				k = n - k;

			for (int i = 0; i < k; ++i) {
				res *= (n - i);
				res /= (i + 1);
			}
			return res;
		}

		
}
