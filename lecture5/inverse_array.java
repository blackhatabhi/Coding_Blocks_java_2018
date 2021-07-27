package lecture5;

import java.util.Scanner;

public class inverse_array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N=Scn.nextInt();
	    int [] arr = new int[N];

	    for (int i = 0; i < arr.length; i++)
	    {
	        
	        arr[i] = Scn.nextInt();
	    }
		int[]inv=inverse(arr);
	    display(inv);
	}
public static int[]inverse(int[]arr) {
	int[]inv=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		inv[arr[i]]=i;
	}
 return inv;}
public static void display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}
}
