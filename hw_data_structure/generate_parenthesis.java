package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-06-Nov-2018
 */
public class generate_parenthesis {
	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		printParentheses(n);
	}

	public static void printParentheses(int n) {
		Validparentheses(n, n, "");
	}

	public static void Validparentheses(int oP, int cP, String str) {
		if (oP == 0 && cP == 0)
			System.out.println(str);
		if (oP > cP)
			return;

		if (cP > 0)
			Validparentheses(oP, cP - 1, str + ")");
		if (oP > 0)
			Validparentheses(oP - 1, cP, str + "(");
	}

}
