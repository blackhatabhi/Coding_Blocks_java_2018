package lecture3;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long rotation = scn.nextInt();
		int i = 1,   count=0,  ans=0;
		while (i <= rotation) {
			int rem = n % 10;
			n = n / 10;
			int flag = n;
			 count = 0;
			while (flag > 0) {
				
				flag = flag / 10;
				count++;
			}if(rotation>0) {
			ans = (rem * (int) (Math.pow(10, count))) + n;
			i++;
			n = ans;
		}else{
			ans = n + (rem * (int) (Math.pow(10, count))) ;
			i++;
			n = ans;
		}
		}
		System.out.println(ans);
	}

}
