package homework_519;
import java.util.*;

public class biggest_number {



	    static Scanner scn = new Scanner(System.in);

	    public static void main(String[] args) {

	        int testcases = scn.nextInt();
	        for (int i = 1; i <= testcases; i++) {

	            int size = scn.nextInt();
	            int[] arr = takeInput(size);
	            sort(arr);
	            for (int val : arr) {
	                System.out.print(val);
	            }
	            System.out.println();
	        }
	        
	       // testcases = testcases + 1;

	    }

	    public static int[] takeInput(int size) {
	        int[] arr = new int[size];

	        for (int i = 0; i <= arr.length - 1; i++) {
	            arr[i] = scn.nextInt();
	        }
	        return arr;

	    }

	    public static void sort(int[] arr) {
	        for (int counter = 0; counter < arr.length - 1; counter++) {
	            for (int j = 0; j < arr.length - counter - 1; j++) {
	                if (compare(arr[j], arr[j + 1]) > 0) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    // +1 -> swap
	    // -1 -> no swap
	    public static int compare(int num1, int num2) {
	        String val1s = num1 + "" + num2;
	        String val2s = num2 + "" + num1;
	        int val1int = Integer.valueOf(val1s);
	        int val2int = Integer.valueOf(val2s);
	        if (val1int > val2int) {
	            return -1;
	        } else {
	            return 1;
	        }
	    }
	}


