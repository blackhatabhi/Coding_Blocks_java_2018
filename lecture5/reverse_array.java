package lecture5;

import java.util.Scanner;

public class reverse_array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int N=Scn.nextInt();
	    int [] arr = new int[N];

	    for (int i = 0; i < arr.length; i++)
	    {
	        
	        arr[i] = Scn.nextInt();
	    }
		arr = reverse(arr);
		display(arr);
	}

	public static int[] reverse(int[] arr) {
	int left=0;
	int right=arr.length-1;
	while(left<right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		left++;
		right--;
	}
	return arr;
}public static void display(int[] arr) {
	for (int val : arr) {
		System.out.println(val);
	}
}
}