package lecture8;

public class recursion_3 {

	public static void main(String[] args) {

		System.out.println(power(3, 5));
	}

	public static int power(int x, int n) {
		if(n==1) {
			return 1;
		}

		int fnm1=x*power(x,n-1);
		int fn=fnm1*x;
		return fn;}
		
	}

