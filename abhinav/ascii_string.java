package abhinav;

import java.util.Scanner;

public class ascii_string {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		for(int i=1;i<str.length();i=i+1) {
			int ch=str.charAt(i)-str.charAt(i-1);
			if(i==1) {
				System.out.print(str.charAt(i-1));
			}
			System.out.print(ch);
			System.out.print(str.charAt(i));
		}
	}
}