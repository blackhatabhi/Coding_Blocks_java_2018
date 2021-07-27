package lecture_21;

public class client_push {

	public static void main(String[] args) throws Exception {
		stack__using_queue_push stack = new stack__using_queue_push();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
	}

}
