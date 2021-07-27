package lecture_15;

import java.util.Scanner;

public class Que {
	public static void main(String[] args) throws Exception {
		Scanner Scn = new Scanner(System.in);
		int N = Scn.nextInt();
		Que q = new Que(N);
		for (int i = 0; i < N; i++) {
			int num = Scn.nextInt();
			q.enque(num);
		}
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Scn.nextInt();
		}
		int count1 = 0;
		int count2 = 0;
		while (!q.isEmpty()) {

			int job = q.getfront();
			if (job == arr[count2]) {
				q.deque();
				count1++;
				count2++;
			} else {
				q.deque();
				q.enque(job);
				count1++;
			}
		}
		System.out.println(count1);

	}

	protected int[] data;
	protected int front;

	public Que() {
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	private int size;

	public Que(int cap) {
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public void enque(int item) throws Exception {
		if (this.isfull()) {
			throw new Exception("Queue is full");
		}
		int idx = (this.front + this.size) % this.data.length;
		this.data[idx] = item;
		this.size++;

	}

	public int deque() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return rv;
	}

	public int getfront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[this.front];
		return rv;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public boolean isfull() {
		return this.size() == this.data.length;
	}

	public void display() {
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		for (int i = 0; i < this.size; i++) {
			int idx = (i + this.front) % this.data.length;
			System.out.print(this.data[idx] + " ");

		}
		System.out.println(".");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	}
}
