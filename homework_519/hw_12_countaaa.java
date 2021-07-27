package homework_519;

public class hw_12_countaaa {


	public static void main(String[] args) {
System.out.println(count1("aaaaa", "aa "));
	}

	public static boolean count1(String s, String pair) {
		int count = 0;
		int index;
		while (true) {
			index = (int)s.indexOf(pair);
			if (index == s.length())
				break;
			s = s.substring(index + pair.length());
			count++;
			count1(s, pair+1);
			

		}return true;
	}
}
