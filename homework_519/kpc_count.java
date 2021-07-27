package homework_519;
import java.util.Scanner;

public class kpc_count {

	


	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        String str = scn.next();

	        System.out.println(printKeypadcount(str, ""));
	        printKeypadans(str, "");
	    }

	    public static int printKeypadcount(String keypad, String ans) {
	        if (keypad.length() == 0) {

	            return 1;

	        }
	        int c = 0;
	        char ch = keypad.charAt(0);
	        String roq = keypad.substring(1);
	        String code = printCode(ch);
	        for (int i = 0; i < code.length(); i++) {
	            c += printKeypadcount(roq, ans + code.charAt(i));
	        }
	        return c;

	    }

	    public static void printKeypadans(String keypad, String ans) {
	        if (keypad.length() == 0) {

	            System.out.print(ans + " ");
	            return;

	        }
	     
	        char ch = keypad.charAt(0);
	        String roq = keypad.substring(1);
	        String code = printCode(ch);
	        for (int i = 0; i < code.length(); i++) {
	            printKeypadans(roq, ans + code.charAt(i));
	        }
	        return;

	    }

	    public static String printCode(char ch) {
	        if (ch == '1')
	            return "abc";
	        else if (ch == '2')
	            return "def";
	        else if (ch == '3')
	            return "ghi";
	        else if (ch == '4')
	            return "jkl";
	        else if (ch == '5')
	            return "mno";
	        else if (ch == '6')
	            return "pqrs";
	        else if (ch == '7')
	            return "tuv";
	        else if (ch == '8')
	            return "wx";
	        else if (ch == '9')
	            return "yz";

	        else
	            return "";
	    }

	}


