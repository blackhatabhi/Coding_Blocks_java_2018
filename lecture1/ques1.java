package jordan;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a=0;
		int m = 2;
		while(m>=n-1)
		{
			m++;
			m = a;
		}

		if(n%a==0)
		{
			System.out.println("no. is prime");
		}else
		{
			System.out.println("no. is not prime");
		}
	}

}
