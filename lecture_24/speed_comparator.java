package lecture_24;

import java.util.Comparator;

public class speed_comparator implements Comparator<car> {

	@Override
	public int compare(car t, car o) {
		return t.speed - o.speed;
	}

}
