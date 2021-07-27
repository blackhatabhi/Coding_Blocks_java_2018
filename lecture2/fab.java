package lecture2;
import java.util.*;
public class fab {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	     int N = scn.nextInt();
	     int a=0,b=0,h,i=0;
	     while(i<N){
	          System.out.println(a);
	            h = a+b;
	            a = b;
	            b = h;
	            i++;
	     }

	}

}
