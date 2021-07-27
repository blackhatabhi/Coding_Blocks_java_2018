package lecture_24;

public class genric_linklist<T> {
	private class Node {
		T data;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	public T getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		return this.head.data;
	}

	public T getlast() throws Exception {
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
		System.out.println("-----------------------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("-----------------------------------");

	}

	public T getk(int k) throws Exception {
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

	public void addlast(T item) {
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

	public void addfirst(T item) {
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

	public void addAt(T item, int k) throws Exception {
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

	public T removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		T temp = this.head.data;
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

	public T removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		T temp = this.tail.data;
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
}
