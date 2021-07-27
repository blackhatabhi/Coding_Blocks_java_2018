package abhinav;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uppercase_lowercase {
	public static void main(String args[]) throws IOException {
		char m;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		m = (char) bf.read();
		if (m >= 97 && m <= 123) {
			System.out.println("lowercase");
		} else if (m >= 65 && m <= 96) {
			System.out.println("UPPERCASE");
		} else {
			System.out.println("Invalid");
		}
	}
}
