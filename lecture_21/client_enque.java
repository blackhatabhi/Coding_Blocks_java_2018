package lecture_21;

public class client_enque {

	public static void main(String[] args) throws Exception {
		queue_using_stack_enque enque=new queue_using_stack_enque();
		enque.enqueue(10);
		enque.enqueue(20);
		enque.enqueue(30);
		enque.enqueue(40);
		enque.enqueue(50);
		enque.enqueue(60);
		enque.enqueue(70);
		enque.display();

	}

}
