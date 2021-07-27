package lecture3;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	char ch=scn.nextLine().charAt(0);
	if(ch>='A'&& ch<='Z') {
		System.out.println("uppercase");
	System.out.println("lowercase is :"+ (char)(ch+32));}
	else if (ch>='a'&& ch<='z')
	{
		System.out.println("lowercase");
		System.out.println("uppercase is:"+ (char)(ch-32));
		
	}else {
		System.out.println("invalid");
	}
	}

}
