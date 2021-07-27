package lecture_11;

public class recursion_print_1 {

	public static void main(String[] args) {
printss("abc"," " );
	}

	public static void printss(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		printss(roq, ans);
		printss(roq, ans + ch);
	}
}
