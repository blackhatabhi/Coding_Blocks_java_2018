package lecture5;

import java.util.Scanner;

public class linear_search {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N=Scn.nextInt();
		int M=Scn.nextInt();
	    int [] arr = new int[N];

	    for (int i = 0; i < arr.length; i++)
	    {
	        
	        arr[i] = Scn.nextInt();
	    }
		System.out.println(liearsearch(arr,M));
	}

	public static int liearsearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			} 
				
		}	return -1;
		
	}
}
