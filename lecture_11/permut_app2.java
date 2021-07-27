package lecture_11;

public class permut_app2 {

	public static void main(String[] args) {
		permut("abcd", "");

	}

	public static void permut(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		for(int i=0;i<=ans.length();i++) {
			String nw=ans.substring(0, i)+ ch + ans.substring(i);
			permut(roq,nw);
		}
}
}