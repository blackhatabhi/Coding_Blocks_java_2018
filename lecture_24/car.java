package lecture_24;

public class car implements Comparable<car> {

	int speed;
	int price;
	String color;

	public car(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "S:" + this.speed + " " + "P:" + this.price + " " + "C:" + this.color;
	}

	@Override
	public int compareTo(car other) {
//		return this.speed - other.speed;
		return other.price - this.price;
//		return this.color.compareTo(other.color);
	}

}
