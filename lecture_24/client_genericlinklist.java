package lecture_24;

public class client_genericlinklist {

	public static void main(String[] args) {
		genric_linklist<String> ll = new genric_linklist<>();
		ll.addfirst("abc");
		ll.addfirst("bcd");
		ll.addfirst("abhai");
		ll.display();
	}

}
