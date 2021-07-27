package question;

import java.util.Scanner;
import java.util.Stack;

public class evlution_of_postfix {
	static Scanner Scn = new Scanner(System.in);

	public static void main(String[] args) {
		int T = Scn.nextInt();
		Scn.nextLine();
		while(T!=0) {
			String Str = Scn.nextLine();
			System.out.println(evaluatePostfix(Str));
			T--;
		}
			
		
	}

	static int evaluatePostfix(String exp) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			if (Character.isDigit(c))
				stack.push(c - '0');

			else {
				int val1 = stack.pop();
				int val2 = stack.pop();

				switch (c) {
				case '+':
					stack.push(val2 + val1);
					break;

				case '-':
					stack.push(val2 - val1);
					break;

				case '/':
					stack.push(val2 / val1);
					break;

				case '*':
					stack.push(val2 * val1);
					break;
				}
			}
		}
		
	
		return stack.pop();
	}

}
