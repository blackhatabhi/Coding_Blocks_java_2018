package lecture_24;

import java.util.Comparator;

public class colour_comparator implements Comparator<car> {

	@Override
	public int compare(car t, car o) {
		return t.color.compareTo(o.color);
	}

}
