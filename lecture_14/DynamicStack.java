package lecture_14;

public class DynamicStack extends Stack {
	public void push(int item) throws Exception {
		if (isfull()) {
			int[] oa = this.data;
			int[] na = new int[2 * oa.length];
			for (int i = 0; i < oa.length; i++) {
				na[i] = oa[i];
			}
			this.data = na;
		}

		super.push(item);

	}
}
