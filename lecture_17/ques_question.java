package lecture_17;

import lecture_15.dynamicque;
import lecture_15.Que;

public class ques_question {
	public static void main(String[] args) throws Exception {

		Que q = new dynamicque();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);

		q.display();
		displayReverse(q, 0);
		q.display();

		actualReverse(q);
		q.display();

	}

	public static void displayReverse(Que q, int count) throws Exception {

		if (count == q.size()) {
			return;
		}

		int temp = q.deque();
		q.enque(temp);

		displayReverse(q, count + 1);

		System.out.println(temp);

	}

	public static void actualReverse(Que q) throws Exception {

		if (q.isEmpty()) {
			return;
		}

		int temp = q.deque();

		actualReverse(q);

		q.enque(temp);

	}

}
