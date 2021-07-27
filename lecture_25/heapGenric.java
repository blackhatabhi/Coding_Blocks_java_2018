package lecture_25;

import java.util.ArrayList;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-03-Nov-2018
 */
public class heapGenric<T extends Comparable<T>> {
	ArrayList<T> data = new ArrayList<>();

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.data.size() == 0;
	}

	public void add(T item) {
		data.add(item);
		unheapify(data.size() - 1);

	}

	private void unheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (islarger(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			unheapify(pi);
		}

	}

	private void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);
	}

	public T remove() {
		swap(0, this.size() - 1);
		T rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int minI = pi;
		int lcI = 2 * pi + 1;
		int rcI = 2 * pi + 2;
		if (lcI < this.size() && islarger(data.get(lcI), data.get(minI)) > 0) {
			minI = lcI;
		}
		if (rcI < data.size() && islarger(data.get(rcI), data.get(minI)) > 0) {
			minI = rcI;
		}
		if (minI != pi) {
			swap(pi, minI);
			unheapify(minI);
		}
	}
	
	public int islarger(T t, T o) {
		return t.compareTo(o);
	}
	public T getHP() {
		return this.data.get(0);
	}

}