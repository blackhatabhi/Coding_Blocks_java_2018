package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-29-Oct-2018
 */
public class mid_of_ll {
	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println( slow_ptr.data );
		}
	}
	
	public void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		mid_of_ll llist = new mid_of_ll();
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		for (int i = 0; i < n; i++) {
			int j = Scn.nextInt();
			llist.push(j);
		}
		llist.printMiddle();

	}
}
