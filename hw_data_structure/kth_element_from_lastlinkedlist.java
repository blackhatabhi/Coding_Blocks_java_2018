package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-06-Nov-2018
 */
public class kth_element_from_lastlinkedlist {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		kth_element_from_lastlinkedlist list = new kth_element_from_lastlinkedlist();
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		for (int i = 0; i < n; i++) {
			int j = Scn.nextInt();
			list.push(j);

		}
		int k = Scn.nextInt();

		list.printNthFromLast(k);
	}

	public void printNthFromLast(int n) {
		int len = 0;
		Node temp = head;

		while (temp != null) {
			temp = temp.next;
			len++;
		}

		if (len < n)
			return;

		temp = head;

		for (int i = 2; i < len - n + 1; i++)
			temp = temp.next;

		System.out.println(temp.data);
	}

	public void push(int data) {

		Node node = new Node(data);

		node.next = head;

		head = node;
	}

	public boolean isPalindrome(Node node) {
		if (node == null)
			return true;

		Node ak = node;
		Node left = new Node(node.data);

		while (ak.next != null) {
			Node temp = new Node(ak.next.data);
			temp.next = left;
			left = temp;
			ak = ak.next;
		}

		Node ak1 = node;
		Node ak2 = left;

		while (ak1 != null) {
			if (ak1.data != ak2.data)
				return false;

			ak1 = ak1.next;
			ak2 = ak2.next;
		}

		return true;
	}

}
