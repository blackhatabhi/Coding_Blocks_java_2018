package jordan;

public class ques {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = 2;
		while(m>=n-1){
			m++;
			m=n+1;
			if(n%M){
				System.out.println("no. is prime");
			}else{System.out.println("no. is not prime");}
		}
		}
	}
