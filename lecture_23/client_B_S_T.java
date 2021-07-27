package lecture_23;

public class client_B_S_T {

	public static void main(String[] args) {
		int[] in = { 5, 10, 15, 20, 25, 30, 35 };
		B_S_T bt = new B_S_T(in);
//		bt.printdec();
//		bt.printrange();

		bt.add(27);
		bt.remove(10);
		bt.remove(30);
		bt.remove(20);
		bt.display();
	}

}
