package abhinav;

import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		 Scanner sj = new Scanner(System.in);
	        int N = sj.nextInt();
	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = sj.nextInt();
	        }

	        int[] ans = mergesort(arr, 0, arr.length - 1);
	        for (int val : ans) {
	            System.out.println(val);
	        }

	    }

	    public static int[] mergesort(int[] arr, int lo, int hi) {

	        if (lo == hi) {
	            int[] br = new int[1];
	            br[0] = arr[lo];
	            return br;
	        }
	        int mid = (lo + hi) / 2;
	        int[] fh = mergesort(arr, lo, mid);
	        int[] sh = mergesort(arr, mid + 1, hi);
	        int[] sorted = merge2sortedarrays(fh, sh);
	        return sorted;
	    }

	    public static int[] merge2sortedarrays(int[] one, int[] two) {
	        int[] merged = new int[one.length + two.length];
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        while (i < one.length && j < two.length) {
	            if (one[i] < two[j]) {
	                merged[k] = one[i];
	                k++;
	                i++;
	            } else {
	                merged[k] = two[j];
	                j++;
	                k++;
	            }
	        }
	        if (i == one.length) {
	            while (j < two.length) {
	                merged[k] = two[j];
	                k++;
	                j++;
	            }
	        }
	        if (j == two.length) {
	            while (i < one.length) {
	                merged[k] = one[i];
	                k++;
	                i++;
	            }
	        }
	        return merged;
	    }
	}
	