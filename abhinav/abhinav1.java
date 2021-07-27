package abhinav;
import java.util.Scanner;
import java.util.Arrays;
public class abhinav1{
 static Scanner Scn=new Scanner(System.in);
	public static void main(String[] args) {
	     
         int N=Scn.nextInt();
         int [] arr = new int[N];

 	    for (int i = 0; i < arr.length; i++)
 	    {
 	        
 	        arr[i] = Scn.nextInt();
 	    }

	}
public static void pair(int[]arr) {
	    

	   
		int Price = Scn.nextInt();

		Arrays.sort(arr);

		int i = 0;
		int j = arr.length - 1;

		int ansl = 0;
		int ansr = 0;

		while (i < j) {

			if (arr[i] + arr[j] > Price) {
				j--;
			} else if (arr[i] + arr[j] < Price) {
				i++;
			} else {
				ansl = arr[i];
				ansr = arr[j];
				i++;
				j--;
			}

		}

		System.out.println("Deepak should buy roses whose prices are"+" "+ ansl  +" "+"and" +" "+ ansr);

	}
}
