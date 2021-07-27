package lecture8;

public class recursion {

	public static void main(String[] args) {
		
print(6);
	}
public static void print(int n) {
	if(n==0) {
		return;
		}
	if(n%2==1) {
		System.out.println(n);}
	print(n-1);
	if(n%2==0)
	System.out.println(n);
}
}
