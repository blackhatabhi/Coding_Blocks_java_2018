package homework_519;

import java.util.Scanner;

public class hw_11_countaaa {

	 
		public static void main (String[] args)  
	    { Scanner Scn=new Scanner(System.in);
	        String a = Scn.nextLine(); 
	        String b = Scn.nextLine(); 
	        System.out.println( count(a, b, a.length(), b.length())) ; 
	      
	    } 
	    
	   public static int count(String a, String b, int m, int n) 
	    { 
	        
	        if ((m == 0 && n == 0) || n == 0) 
	            return 1; 
	      
	        
	        if (m == 0) 
	            return 0; 
	      
	        
	        if (a.charAt(m - 1) == b.charAt(n - 1)) 
	            return (count(a, b, m - 1, n - 1) +
	                   count(a, b, m - 1, n)) ; 
	        else
	            
	            return count(a, b, m - 1, n); 
	    } 

	    
	} 

