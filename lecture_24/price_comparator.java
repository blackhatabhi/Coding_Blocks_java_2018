package lecture_24;

import java.util.Comparator;

public class price_comparator implements Comparator<car> {

	@Override
	public int compare(car t, car o) {
		return o.price - t.price;
	}

}
