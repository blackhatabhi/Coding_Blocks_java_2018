package homework_519;

import java.util.Scanner;

public class hw_3_sumofdigit {

	
	    int sum = 0;
	    public static void main(String[] args) 
	    {
	        int n;
	        Scanner scn = new Scanner(System.in);
	        n = scn.nextInt();
	        hw_3_sumofdigit obj = new hw_3_sumofdigit();
	        int a = obj.add(n);
	        System.out.println(a);
	    }
	    int add(int n)
	    {
	        sum = n % 10;
	        if(n == 0)
	        {
	            return 0;
	        }
	        else
	        {
	             return sum + add(n / 10);
	        }
	 
	    }
	}


