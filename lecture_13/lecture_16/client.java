package lecture_16;

import java.util.Scanner;

public class client {

	public static void main(String[] args) throws Exception {
		linked_list list = new linked_list();
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
//		int k = Scn.nextInt();
		for (int i = 0; i < n; i++) {
			int j = Scn.nextInt();
			list.addlast(j);
		}
//		list.reverseDI(k);
//		list.reverse(list.head, k);
		list.display();
		list.appendToTail(3);
		list.display();

//		System.out.println(list.getfirst());
//		System.out.println(list.getlast());
//		System.out.println(list.getk(2));
//		list.addAt(60, 2);
//		list.addfirst(50);
//		list.addlast(70);
//		list.display();
//		list.removeFirst();
//		list.removeLast();
//		list.display();
//		list.removek(1);
//		list.display();
//		System.out.println(list.mid());
//		list.reverseDi();
//		list.display();
//		list.reversrPI();
//		list.display();
//		list.reverseRR();
//		list.display();
//		list.reverseDR();
//		list.display();
//		list.reverseDRheap();
//		list.display();
//		list.fold();
//		System.out.println(list.kthfromlast(3));

	}

}
