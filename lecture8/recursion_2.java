package lecture8;

public class recursion_2 {

	public static void main(String[] args) {
factorial(5);
	}

	public static int factorial(int n) {
if(n==1) {
	return 1;
}

int fnm1=factorial(n-1);
int fn=fnm1*n;
System.out.println(fn);
return fn;}
}