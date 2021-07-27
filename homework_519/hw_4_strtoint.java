package homework_519;

import java.util.Scanner;

public class hw_4_strtoint {

	 static int x = 0;
	    static int counter = 0;

	 public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        String s = scn.nextLine();
	        System.out.println(recursive(s));

	    }

	   
	    public static int recursive(String s) {
	        if (s.length() == 1) {
	            x = (x * 10) + Integer.parseInt(s.substring(0, 1));
	            return x;
	        } else {
	            x = (x * 10) + Integer.parseInt(s.substring(0, 1));
	            counter++;
	            return recursive(s.substring(1, s.length()));

	        }

	    }
}
