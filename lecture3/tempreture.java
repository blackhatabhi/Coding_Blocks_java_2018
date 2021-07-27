package lecture3;

import java.util.Scanner;

public class tempreture {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int Min=scn.nextInt();
		int Max=scn.nextInt();
		int step=scn.nextInt();
		for(int i=Min;i<=Max;i=i+step) {
			int c=(int)((5.0/9)*(i-32));
			System.out.println(i + "\t" + c);
		}

	}

}
