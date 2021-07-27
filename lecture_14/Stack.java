package lecture_14;

public class Stack {
	protected int[] data;
	protected int tos;

	public Stack() {
		this.data = new int[5];
		this.tos = -1;

	}

	public Stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;

	}

	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("stack is full");
		}
		this.tos++;
		this.data[this.tos] = item;

	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is Empty");
		}
		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return rv;
	}

	public int peak() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is Empty");
		}
		int rv = this.data[this.tos];
		return rv;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public boolean isfull() {
		return this.size() == this.data.length;
	}

	public void display() {
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i] + " ");

		}
		System.out.println(".");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	}
}
