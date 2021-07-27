package lecture8;

import java.util.Scanner;

public class recursion_arr {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n=Scn.nextInt();
		int [] arr = new int[n];

	    for (int i = 0; i < arr.length; i++)
	    {
	        
	        arr[i] = Scn.nextInt();
	    }
	    diaplay(arr,0);
	}

	public static void diaplay(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}
		System.out.println(arr[vidx]);
		diaplay(arr, vidx + 1);
	}
}
