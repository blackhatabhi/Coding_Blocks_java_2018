package lecture2;

import java.util.Scanner;

public class pattren9 {

 public static void main(String[] args)
    {
             
	Scanner scn=new Scanner(System.in);
	int N=scn.nextInt();	 
 
	for(int i=1;i<=N;i++)
               {
	        for(int j=1;j<=N-i;j++)
                
                        {
                               System.out.print(" ");
                        }
 
                      for(int j=1;j<=i*2-1;j++)
                
                        {
                               System.out.print("*");
                        }
	 System.out.println();
	    
               }            
               for(int i=N-1;i>0;i--)
               {
	        for(int j=1;j<=N-i;j++)
                
                        {
                               System.out.print(" ");
                        }
                      for(int j=1;j<=i*2-1;j++)
                
                        {
                               System.out.print("*");
                        }
	    System.out.println();
               }  
 
 
                
    }

}
