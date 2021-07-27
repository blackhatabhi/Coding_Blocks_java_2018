package lecture_18;

import java.util.Scanner;

public class linkedlist_ques {

	private class Node {
		int data;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	public static void main(String[] args) throws Exception {
		linkedlist_ques list = new linkedlist_ques();
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
		for (int i = 0; i < n; i++) {
			int j = Scn.nextInt();
			list.addlast(j);
		}
		int k = Scn.nextInt();
		list.kappend(k);
		list.display();
	}

	public int getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		return this.head.data;
	}

	public int getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		return this.tail.data;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
//		System.out.println("-----------------------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
//		System.out.println(".");
//		System.out.println("-----------------------------------");

	}

	public int getk(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("invalid index");
		}
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		Node temp = this.head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public Node getnodek(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("invalid index");
		}
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		Node temp = this.head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
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

	public void addfirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (this.size > 0) {

			nn.next = this.head;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public void addAt(int item, int k) throws Exception {
		if (k < 0 || k > this.size) {
			throw new Exception("invalid index");
		}

		if (k == 0) {
			addfirst(item);
		} else if (k == this.size()) {
			addlast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			Node prev = getnodek(k - 1);
			Node ahead = prev.next;
			prev.next = nn;
			nn.next = ahead;
			this.size++;
		}

	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		int temp = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return temp;

	}

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		int temp = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sm2 = getnodek(this.size - 2);
			sm2.next = null;
			this.tail = sm2;
			this.size--;
		}
		return temp;

	}

	public int removek(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}

		if (k < 0 || k >= this.size) {
			throw new Exception("invalid index");
		}
		if (k == 0) {
			return removeFirst();
		} else if (k == this.size - 1) {
			return removeLast();
		} else {
			Node prev = getnodek(k - 1);
			Node self = prev.next;
			Node ahead = self.next;
			prev.next = ahead;
			this.size--;
			return self.data;
		}

	}

	public int mid() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		return slow.data;
	}

	// reverse question lecture_18 class code;
	public void reverseDi() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node ln = getnodek(left);
			Node rn = getnodek(right);
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;

		}

	}

	public void reversrPI() {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;

	}

	public void reverseRR() {
		reversionRR(this.head, this.head.next);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversionRR(Node prev, Node curr) {
		if (curr == null) {
			return;
		}
		Node ahead = curr.next;
		reversionRR(curr, ahead);

		curr.next = prev;

	}

	public void reverseDR() {
		reversionDR(this.head, this.head, 0);
	}

	private Node reversionDR(Node left, Node right, int count) {
		if (right == null) {
			return left;
		}

		left = reversionDR(left, right.next, count + 1);
		if (count >= size / 2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;

		}
		return left.next;
	}

	private class heapmover {
		Node left;
	}

	public void reverseDRheap() {
		heapmover mover = new heapmover();
		mover.left = this.head;
		reverseDRheap(mover, this.head, 0);
	}

	private void reverseDRheap(heapmover mover, Node right, int count) {
		if (right == null) {
			return;
		}
		reverseDRheap(mover, right.next, count + 1);
		if (count >= size / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;
			mover.left = mover.left.next;
		}
	}

	public void fold() {
		heapmover mover = new heapmover();
		mover.left = this.head;
		fold(mover, this.head, 0);
	}

	private void fold(heapmover mover, Node right, int count) {
		if (right == null) {
			return;
		}
		fold(mover, right.next, count + 1);
		if (count >= size / 2) {
			Node ahead = mover.left.next;
			mover.left.next = right;
			right.next = ahead;
			mover.left = ahead;
		}
		if (count == this.size / 2) {
			this.tail = right;
			this.tail.next = null;
		}
	}

	public int kthfromlast(int k) {
		Node slow = this.head;
		Node fast = this.head;
		for (int i = 1; i <= k; i++) {
			fast = fast.next;

		}
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}

	public void kappend(int k) throws Exception {
		if (k > this.size) {
			k = k % this.size;
			Node p = getnodek(this.size - k);
			Node q = getnodek(this.size - k - 1);
			Node last = getnodek(this.size - 1);
			last.next = head;
			this.head = p;
			q.next = null;
		}
		if (k < this.size) {
			Node p = getnodek(this.size - k);
			Node q = getnodek(this.size - k - 1);
			Node last = getnodek(this.size - 1);
			last.next = head;
			this.head = p;
			q.next = null;
		}
	}
}
