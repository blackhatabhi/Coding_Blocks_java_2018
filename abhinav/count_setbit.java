package abhinav;

import java.util.Scanner;

public class count_setbit {
	static int countSetBits(int n) 
	{ 
		int count = 0; 
		while (n > 0) 
		{ 
			count += n & 1; 
			n >>= 1; 
		} 
		return count; 
	} 

	public static void main(String args[]) 
	{ Scanner Scn=new Scanner(System.in);
	int N=Scn.nextInt();
	while(N!=0) {
		int i = Scn.nextInt(); 
		System.out.println(countSetBits(i));
		N--;} 
	} 
}
