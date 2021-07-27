package lecture_25;

import java.util.ArrayList;
import java.util.Scanner;

//import lecture_24.car;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-03-Nov-2018
 */
public class client_heapgenric {

	public static void main(String[] args) {
//		car[] carr = new car[5];
//		carr[0] = new car(100, 300, "black");
//		carr[1] = new car(200, 400, "white");
//		carr[2] = new car(300, 500, "red");
//		carr[3] = new car(400, 100, "blue");
//		carr[4] = new car(500, 400, "pink");
//		heapGenric<car> heapg = new heapGenric<>();
//		for (int i = 0; i < 5; i++) {
//			heapg.add(carr[i]);
//		}
//		while (!heapg.isEmpty()) {
//			System.out.println(heapg.remove());
//			
//		}
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(9);
		list3.add(10);
		list3.add(11);
		list3.add(12);
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(13);
		list4.add(14);
		list4.add(15);
		list4.add(16);

		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		System.out.println(list);

		System.out.println(mergedKsortedArr(list));
		ArrayList<Integer> listn = new ArrayList<>();
		listn.addAll(list3);
		listn.addAll(list4);
		Scanner S = new Scanner(System.in);
		int k = S.nextInt();
		System.out.println(KlargestElement(listn, k));

	}

	private static class pair implements Comparable<pair> {
		int data;
		int listNo;
		int indexNo;

		@Override
		public int compareTo(pair o) {
			return o.data - this.data;
		}
	}

	public static ArrayList<Integer> mergedKsortedArr(ArrayList<ArrayList<Integer>> list) {
		ArrayList<Integer> ans = new ArrayList<>();
		heapGenric<pair> heap = new heapGenric<>();
		for (int i = 0; i < list.size(); i++) {
			pair np = new pair();
			np.data = list.get(i).get(0);
			np.listNo = i;
			np.indexNo = 0;
			heap.add(np);
		}
		while (!heap.isEmpty()) {
			pair rp = heap.remove();
			ans.add(rp.data);

			rp.indexNo++;
			if (rp.indexNo < list.get(rp.listNo).size()) {
				rp.data = list.get(rp.listNo).get(rp.indexNo);
				heap.add(rp);
			}
		}
		return ans;
	}

	public static ArrayList<Integer> KlargestElement(ArrayList<Integer> list, int k) {
		heap heap = new heap();
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			heap.add(list.get(i));
		}
		for (int i = k; i < list.size(); i++) {
			int min = heap.getHP();
			if (list.get(i) > min) {
				heap.remove();
				heap.add(list.get(i));
			}
		}
		while (!heap.isEmpty()) {
			ans.add(heap.remove());

		}
		return ans;
	}
}
