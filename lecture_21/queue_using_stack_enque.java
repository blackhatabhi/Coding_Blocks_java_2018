package lecture_21;
import lecture_14.DynamicStack;
public class queue_using_stack_enque {
	static DynamicStack primary = new DynamicStack();

	public void enqueue(int item) throws Exception {
		try {
			primary.push(item);
		} catch (Exception e) {
			throw new Exception("queue is full");
		}

	}

	public int dequeue() throws Exception { 
		try {
			DynamicStack helper = new DynamicStack();
			while (primary.size() != 1) {
				int element;

				element = primary.pop();
				helper.push(element);
			}

			int rv = primary.pop();
			while (helper.size() != 0) {
				int element = helper.pop();
				primary.push(element);

			}
			return rv;
		} catch (Exception e) {
			throw new Exception("queue is empty");
		}

	}

	public int getfront() throws Exception {
		try {
			DynamicStack helper = new DynamicStack();
			while (primary.size() != 1) {
				int element;

				element = primary.pop();
				helper.push(element);
			}

			int rv = primary.pop();
			while (helper.size() != 0) {
				int element = helper.pop();
				primary.push(element);

			}
			return rv;
		} catch (Exception e) {
			throw new Exception("queue is empty");
		}
	}

	public int size() {
		return primary.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() throws Exception {
		display1();
	}

	private static void display1() throws Exception {

		if (primary.isEmpty()) {
			return;
		}

		int temp = primary.pop();
		display1();

		System.out.println(temp);

		primary.push(temp);

	}
}