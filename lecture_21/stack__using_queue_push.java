package lecture_21;

import lecture_15.dynamicque;

public class stack__using_queue_push {
	static dynamicque primary = new dynamicque();

	public void push(int item) throws Exception {

		try {
			primary.enque(item);
		} catch (Exception e) {
			throw new Exception("stack id full");

		}
	}

	public int pop() throws Exception {
		try {
			dynamicque helper = new dynamicque();
			while (primary.size() != 1) {
				int element = primary.deque();
				helper.enque(element);

			}
			int rv = primary.deque();
			primary = helper;
			return rv;
		} catch (Exception r) {
			throw new Exception("stack is empty");
		}
	}

	public int top() throws Exception {
		try {
			dynamicque helper = new dynamicque();
			while (primary.size() != 1) {
				int element = primary.deque();
				helper.enque(element);

			}
			int rv = primary.deque();
			helper.enque(rv);
			primary = helper;
			return rv;
		} catch (Exception r) {
			throw new Exception("stack is empty");
		}
	}

	public int size() {
		return primary.size();
	}

	public boolean isEmpty() {
		return size() == 0;

	}

	public void display() throws Exception {
		try {
			display1(0);
		} catch (Exception e) {
			throw new Exception("error");
		}
	}

	private static void display1(int count) throws Exception {

		if (count == primary.size()) {
			return;
		}

		int temp = primary.deque();
		primary.enque(temp);

		display1(count + 1);

		System.out.println(temp + " ");

	}

}
