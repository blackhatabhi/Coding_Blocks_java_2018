package homework_519;

import java.util.Scanner;

public class ia_array_contained {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		int M = Scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Scn.nextInt();
			
		}
		countarr(arr, M);
		
	}
		public static void countarr(int[]arr,int M) {
		
	        boolean found = false;

	        for (int n : arr) {
	            if (n == M) {
	                found = true;
	                break;
	            }
	        }

	        if(found)
	            System.out.println(true);
	        else
	            System.out.println(false);
	    }
	}


