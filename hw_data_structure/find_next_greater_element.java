package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-06-Nov-2018
 */
public class find_next_greater_element {
	 static class stack  
	    { 
	        int top; 
	        int items[] = new int[100]; 
	  
	        void push(int x)  
	        { 
	            if (top == 10000000)  
	            { 
	                System.out.println("Stack full"); 
	            }  
	            else 
	            { 
	                items[++top] = x; 
	            } 
	        } 
	  
	        int pop()  
	        { 
	            if (top == -1)  
	            { 
	                System.out.println("Underflow error"); 
	                return -1; 
	            }  
	            else 
	            { 
	                int element = items[top]; 
	                top--; 
	                return element; 
	            } 
	        } 
	  
	        boolean isEmpty()  
	        { 
	            return (top == -1) ? true : false; 
	        } 
	    } 
	  
	   
	    static void printNGE(int arr[], int n)  
	    { 
	        int i = 0; 
	        stack s = new stack(); 
	        s.top = -1; 
	        int element, next; 
	  
	        s.push(arr[0]); 
	  
	        for (i = 1; i < n; i++)  
	        { 
	            next = arr[i]; 
	  
	            if (s.isEmpty() == false)  
	            { 
	                  
	               
	                element = s.pop(); 
	  
	                
	                while (element < next)  
	                { 
	                    System.out.print(next+" "); 
	                    if (s.isEmpty() == true) 
	                        break; 
	                    element = s.pop(); 
	                } 
	  
	                
	                if (element > next) 
	                    s.push(element); 
	            } 
	  
	           
	            s.push(next); 
	        } 
	  
	        
	        while (s.isEmpty() == false)  
	        { 
	            element = s.pop(); 
	            next = -1; 
	            System.out.print(next); 
	        } 
	    } 
	    public static void main(String[] args)  
	    { Scanner Scn=new Scanner(System.in);
        int n = Scn.nextInt(); 
        int []arr = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=Scn.nextInt();
        }
        printNGE(arr, n); 

	    } 
}
