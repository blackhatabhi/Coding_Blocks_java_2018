package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-29-Oct-2018
 */
public class reverseK_ll {
	public static void main(String[] args) {
		reverseK_ll llist = new reverseK_ll();
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		int k = Scn.nextInt();
		for (int i = 0; i < n; i++) {
			int j = Scn.nextInt();
			llist.push(j);
		}
		llist.head = llist.reverse(llist.head, k);
		llist.printReverse(llist.head);

	}

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printReverse(Node parent) {
		if (parent == null)
			return;

		printReverse(parent.next);

		System.out.print(parent.data + " ");
	}

	public Node reverse(Node parent, int k) {
		Node curr = parent;
		Node right = null;
		Node left = null;

		int count = 0;

		while (count < k && curr != null) {
			right = curr.next;
			curr.next = left;
			left = curr;
			curr = right;
			count++;
		}

		if (right != null)
			parent.next = reverse(right, k);

		return left;
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
