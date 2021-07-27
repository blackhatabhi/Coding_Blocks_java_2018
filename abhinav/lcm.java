package abhinav;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		int lcm;

       
        lcm = (N1 > N2) ? N1 : N2;

        
        while(true)
        {
            if( lcm % N1 == 0 && lcm % N2 == 0 )
            {
                System.out.println(lcm);
                break;
            }
            ++lcm;
        }

	}

}
