package hw_data_structure;

import java.util.Scanner;
/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-29-Oct-2018
 */
public class ispalindrome {
	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}


	public boolean isPalindrome(Node head) {
		if (head == null)
			return true;

		Node p = head;
		Node prev = new Node(head.data);

		while (p.next != null) {
			Node temp = new Node(p.next.data);
			temp.next = prev;
			prev = temp;
			p = p.next;
		}

		Node p1 = head;
		Node p2 = prev;

		while (p1 != null) {
			if (p1.data != p2.data)
				return false;

			p1 = p1.next;
			p2 = p2.next;
		}

		return true;
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
		ispalindrome llist = new ispalindrome();
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		for (int i = 0; i < n; i++) {
			int j = Scn.nextInt();
			llist.push(j);
		}
		System.out.println(llist.isPalindrome(head));

	}
}
