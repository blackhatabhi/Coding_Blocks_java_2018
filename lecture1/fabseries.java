import java.util.Scanner;

public class fabseries {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
	     int N = scn.nextInt();
	     int a=0;
	     int b=1;
	     int i=0;
	     while(i<N){
	          System.out.println(a+" ");
	            int h = a + b;
	            a = b;
	            b = h;
	            i++;
	     
	     }
    }
}