package abhinav;

import java.util.Scanner;
public class sample
{
    public static void main(String[] args) 
    {
     int even = 0, odd = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                even = even + a[i];
            }
            else
            {
               odd = odd + a[i];
            }
        }
        display(a);
	}

	public static void display(int[] a) {
		for (int val : a) {
			System.out.println(val);
		}
    }
}

