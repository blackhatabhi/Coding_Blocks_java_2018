package lecture_25;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-03-Nov-2018
 */
public class client_heap {

	public static void main(String[] args) {
		heap h = new heap();
		for (int i = 5; i >= 1; i--) {
			h.add(i * 10);
		}
		while (!h.isEmpty()) {
			System.out.println(h.remove());
		}
	}

}
