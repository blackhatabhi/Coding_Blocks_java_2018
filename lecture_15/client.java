package lecture_15;

import java.util.Scanner;

public class client {

	public static void main(String[] args) throws Exception {
		Scanner Scn=new Scanner(System.in);
		int cap=Scn.nextInt();
		Que q = new Que(cap);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		q.enque(90);
	    System.out.println(q.deque());
	    System.out.println(q.deque());
	    q.enque(40);
	    q.display();

	}

}
