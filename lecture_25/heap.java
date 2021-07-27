package lecture_25;

import java.util.ArrayList;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-03-Nov-2018
 */
public class heap {
	ArrayList<Integer> data = new ArrayList<>();

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.data.size() == 0;
	}

	public void add(int item) {
		data.add(item);
		unheapify(data.size() - 1);

	}

	private void unheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (data.get(ci) < data.get(pi)) {
			swap(pi, ci);
			unheapify(pi);
		}

	}

	private void swap(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);
	}

	public int remove() {
		swap(0, this.size() - 1);
		int rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int minI = pi;
		int lcI = 2 * pi + 1;
		int rcI = 2 * pi + 2;
		if (lcI < this.size() && data.get(lcI) < data.get(minI)) {
			minI = lcI;
		}
		if (rcI < data.size() && data.get(rcI) < data.get(minI)) {
			minI = rcI;
		}
		if (minI != pi) {
			swap(pi, minI);
			unheapify(minI);
		}
	}

	public int getHP() {
		return this.data.get(0);
	}
}