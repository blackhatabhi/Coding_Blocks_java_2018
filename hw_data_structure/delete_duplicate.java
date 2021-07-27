package hw_data_structure;

import java.util.Scanner;


/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-31-Oct-2018
 */
@SuppressWarnings("static-access")
public class delete_duplicate {

	private class Node {
		int data;
		Node next;

	}

	private static Node head;
	private Node tail;
	private int size;

	public int getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		return delete_duplicate.head.data;
	}

	public int getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		return this.tail.data;
	}

	public static void removeDuplicates() {
		Node current = head;
		while (current != null) {
			Node prev = current;
			Node next = current.next;
			while (next != null) {
				if (current.equals(next)) {
					prev.next = next.next;
				} else {
					prev = next;
				}
				next = next.next;
			}
			current = current.next;
		}
	}

	public void addlast(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (this.size > 0) {
			this.tail.next = nn;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}

	public static void main(String[] args) throws Exception {
		delete_duplicate list = new delete_duplicate();
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		for (int i = 0; i < n; i++) {
			int j = Scn.nextInt();
			list.addlast(j);
		}
		list.removeDuplicates();
	}

}
