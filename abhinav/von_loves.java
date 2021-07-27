package abhinav;
import java.util.*;
public class von_loves {
	static Scanner scn = new Scanner(System.in);
	    public static void main(String args[]) {
	    	int T=scn.nextInt();
while(T!=0) {
			int N = scn.nextInt();
			int power = 1;
			int binary = 0;
			while (N != 0) {
				int rem = N % 10;
				binary = binary + rem * power;
				power = power * 2;
				N = N / 10;
			}
			System.out.println(binary);
			T--; }
	}
}
