package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-03-Nov-2018
 */
public class count_total_noOfleafnode {
	static Scanner Scn = new Scanner(System.in);
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void printNthFromLast(int n) {
		int len = 0;
		Node temp = head;
		int t = Scn.nextInt();
		while (t != -1) {
			while (temp != null) {
				temp = temp.next;
				len++;
			}

			if (len < n)
				return;

			temp = head;

			for (int i = 1; i < len - n + 1; i++)
				temp = temp.next;

			System.out.println(temp.data);
		}
	}

	public void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	public static void main(String[] args) {
		count_total_noOfleafnode llist = new count_total_noOfleafnode();

		int n = Scn.nextInt();
		for (int i = 0; i < n; i++) {
			int j = Scn.nextInt();
			llist.push(j);
		}
		int k = Scn.nextInt();
		llist.printNthFromLast(k);

	}

}