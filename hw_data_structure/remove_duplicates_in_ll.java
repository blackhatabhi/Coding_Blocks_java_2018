package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-29-Oct-2018
 */
public class remove_duplicates_in_ll {
	public static void main(String[] args) {
		remove_duplicates_in_ll llist = new remove_duplicates_in_ll();

		Scanner Scn = new Scanner(System.in);
		int t = Scn.nextInt();
		Scn.nextLine();
		while (t != 0) {
			int n = Scn.nextInt();
			for (int i = 0; i < n; i++) {
				int j = Scn.nextInt();
				llist.push(j);
			}

			llist.removeDuplicates();
			llist.printReverse(head);

			t--;
		}

	}

	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printReverse(Node head) {
		if (head == null)
			return;

		printReverse(head.next);

		System.out.print(head.data + " ");
	}

	public void removeDuplicates() {
		Node current = head;

		Node next_next;

		if (head == null)
			return;

		while (current.next != null) {

			if (current.data == current.next.data) {
				next_next = current.next.next;
				current.next = null;
				current.next = next_next;
			} else
				current = current.next;
		}
	}

	public void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
