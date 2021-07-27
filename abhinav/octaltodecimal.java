package abhinav;

import java.util.Scanner;

public class octaltobinary {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
	    int N =input.nextInt();
	    int rem;
	    String str=""; 
	    char dig[]={'0','1','2','3','4','5','6','7'};
	 
	    while(N>0)
	    {
	       rem=N%8; 
	       str=dig[rem]+str; 
	       N=N/8;
	    }
	    System.out.println(str);

	}

}
