package lecture_21;

import lecture_15.dynamicque;

public class stack__using_queue_pop {
	static dynamicque primary = new dynamicque();

	public void push(int item) throws Exception {

		try {
			dynamicque helper = new dynamicque();
			helper.enque(item);
			while (primary.size() != 0) {
				int element = primary.deque();
				helper.enque(element);

			}
			primary = helper;
		} catch (Exception e) {
			throw new Exception("stack is full");

		}
	}

	public int pop() throws Exception {
		try {

			int rv = primary.deque();
			return rv;
		} catch (Exception r) {
			throw new Exception("stack is empty");
		}
	}

	public int top() throws Exception {
		try {

			int rv = primary.getfront();
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
			primary.display();
		} catch (Exception e) {
			throw new Exception("error");
		}
	}

}
