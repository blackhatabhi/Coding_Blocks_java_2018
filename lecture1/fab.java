package lecture1;
import java.util.*;
public class fab {
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int inp = s.nextInt();
	    int i,h=0,a=1,b=0;
	    while(h<=inp){
	      System.out.println(h);
	      b=a;
	      a=h;
	      h=a+b;
	    }
	  }
	}


