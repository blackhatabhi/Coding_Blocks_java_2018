package homework_519;

import java.util.Scanner;

public class hw_2_reverse {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N=Scn.nextInt();
	    int [] arr = new int[N];

	    for (int i = 0; i < arr.length; i++)
	    {
	        
	        arr[i] = Scn.nextInt();
	    }
		int length=arr.length;
		int[] revArray=reverseArray(arr,0,length-1);
		for(int i:revArray)
			System.out.print(i+" ");
 
	}
	
	public static int[] reverseArray(int[] a,int i,int j){
		
		if(i<j){
		int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			reverseArray(a, i+1, j-1);
		}
		return a;
	}
}

