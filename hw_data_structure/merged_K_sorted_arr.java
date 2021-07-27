package hw_data_structure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-11-Nov-2018
 */
public class merged_K_sorted_arr {
	public int size;
	public HeapNode[] Heap;
	public int position;
	int[] result;

	public void MergeKSortedArrays(int k) {
		this.size = k;
		Heap = new HeapNode[k + 1];
		position = 0;
		Heap[0] = new HeapNode(0, -1);
	}

	public int[] merge(int[][] A, int k, int n) {
		int nk = n * k;
		result = new int[nk];
		int count = 0;
		int[] ptrs = new int[k];
		for (int i = 0; i < ptrs.length; i++) {
			ptrs[i] = 0;
		}
		for (int i = 0; i < k; i++) {
			if (ptrs[i] < n) {
				insert(A[i][ptrs[i]], i);
			} else {
				insert(Integer.MAX_VALUE, i);
			}

		}
		while (count < nk) {
			HeapNode h = extractMin();
			result[count] = h.data;
			ptrs[h.listNo]++;
			if (ptrs[h.listNo] < n) {
				insert(A[h.listNo][ptrs[h.listNo]], h.listNo);
			} else {
				insert(Integer.MAX_VALUE, h.listNo);
			}
			count++;
		}
		return result;
	}

	public void insert(int data, int listNo) {
		if (position == 0) {
			Heap[position + 1] = new HeapNode(data, listNo);
			position = 2;
		} else {
			Heap[position++] = new HeapNode(data, listNo);
			bubbleUp();
		}
	}

	public HeapNode extractMin() {
		HeapNode min = Heap[1];
		Heap[1] = Heap[position - 1];
		Heap[position - 1] = null;
		position--;
		sinkDown(1);
		return min;
	}

	public void sinkDown(int k) {
		int smallest = k;

		if (2 * k < position && Heap[smallest].data > Heap[2 * k].data) {
			smallest = 2 * k;
		}
		if (2 * k + 1 < position && Heap[smallest].data > Heap[2 * k + 1].data) {
			smallest = 2 * k + 1;
		}
		if (smallest != k) {
			swap(k, smallest);
			sinkDown(smallest);
		}

	}

	public void swap(int a, int b) {
		HeapNode temp = Heap[a];
		Heap[a] = Heap[b];
		Heap[b] = temp;
	}

	public void bubbleUp() {
		int pos = position - 1;
		while (pos > 0 && Heap[pos / 2].data > Heap[pos].data) {
			HeapNode y = Heap[pos];
			Heap[pos] = Heap[pos / 2];
			Heap[pos / 2] = y;
			pos = pos / 2;
		}
	}

	public static void main(String[] args) {

		Scanner Scn = new Scanner(System.in);
		int m = Scn.nextInt();
		int n = Scn.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[j][i] = Scn.nextInt();
			}
			merged_K_sorted_arr ak = new merged_K_sorted_arr();
			int[] op = ak.merge(arr, arr.length, arr.length);
			System.out.println(Arrays.toString(op));
		}

	}

	class HeapNode {
		int data;
		int listNo;

		public HeapNode(int data, int listNo) {
			this.data = data;
			this.listNo = listNo;
		}
	}
}
