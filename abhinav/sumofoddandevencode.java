package abhinav;

public class sumofoddandevencode {

	public static int main(String[] args) {
		int maxDigitLength = 16;
        int sum = 0;
   	   int number;
        for (int i = 0; i < maxDigitLength; i++)
        {
            if (i % 2 != 0)
            {
            	   int number=0;
               sum =  (sum + (int)(number % 10));
                number =  number/10;

            }else {
                number =  number/10;
           }

        }
        display(sum);
       	}

       	public static void display(int[] a) {
       		for (int val : a) {
       			System.out.println(val);
       		}
}
}