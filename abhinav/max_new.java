package abhinav;

import java.util.Scanner;

public class max_new {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
			 if (num1 > num2)
			    {
			        if (num1 > num3)
			        {
			            System.out.println("num1 is the greatest among three");
			        }
			        else
			        {
			        	System.out.println("num3 is the greatest among three ");
			        }
			    }
			    else if (num2 > num3)
			    	System.out.println("num2 is the greatest among three ");
			    else
			    	System.out.println("num3 is the greatest among three ");

	}

}
