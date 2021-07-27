package lecture_15;

public class dynamicque extends Que {
	
	
	public void enque(int item) throws Exception {
		if (this.isfull()) {
			int[] oa = this.data;
			int[] na = new int[2 * oa.length];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + this.front) % this.data.length;
				na[i] = oa[idx];
			}
			this.data = na;
			this.front = 0;
		}
		super.enque(item);
	}
}