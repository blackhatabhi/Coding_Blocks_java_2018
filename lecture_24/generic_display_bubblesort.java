package lecture_24;

import java.util.Comparator;

public class generic_display_bubblesort {

	public static void main(String[] args) {
		Integer[] arrT = { 1, 2, 3, 4, 5 };
		String[] arrS = { "abhinav", "ayush", "vaibhav" };
		car[] carr = new car[5];
		carr[0] = new car(100, 300, "black");
		carr[1] = new car(200, 400, "white");
		carr[2] = new car(300, 500, "red");
		carr[3] = new car(400, 100, "blue");
		carr[4] = new car(500, 400, "pink");
		display(arrS);
		display(arrT);
		bubblesort(carr, new speed_comparator());
		display(carr);
		bubblesort(carr, new price_comparator());
		display(carr);
		bubblesort(carr, new colour_comparator());
		display(carr);

	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val + " ");
		}
		System.out.println();
	}

	public static <T> void bubblesort(T[] arr, Comparator<T> comparator) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - counter - 1; j++) {
				if (comparator.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
