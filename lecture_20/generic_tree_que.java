package lecture_20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class generic_tree_que {
	Scanner Scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public void generic_tree() {
		this.root = takeinput(null, -1);
	}

//we want to create the ith child of the parent
	private Node takeinput(Node parent, int ith) {
		if (parent == null) {
			System.out.println("enter the data for root node");
		} else {
			System.out.println("enter the data for" + ith + "child" + parent.data);
		}
		int item = Scn.nextInt();
		// nn=new node
		Node nn = new Node();
		nn.data = item;
		System.out.println("no. of children for" + nn.data + "?");
		// noc= no.of children
		int noc = Scn.nextInt();
		for (int i = 0; i < noc; i++) {
			Node child = takeinput(nn, i);
			nn.children.add(child);
		}
		return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {

		String str = node.data + "->";

		for (Node child : node.children) {
			str += child.data + ",";

		}
		str += ".";
		System.out.println(str);

		for (Node child : node.children) {

			display(child);
		}

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		int ts = 0;
		for (Node child : node.children) {
			int cs = size(child);
			ts += cs;
		}
		return ts + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		int max = node.data;
		for (Node child : node.children) {
			int a = max(child);
			if (max < a) {
				max = a;

			}

		}
		return max;
	}

	public boolean find() {
		return find(this.root, 20);
	}

	private boolean find(Node node, int target) {

		if (node.data == target) {
			return true;
		}
		boolean cf = false;
		for (Node child : node.children) {
			cf = find(child, target);
			if (cf) {
				return true;
			}
		}

		return cf;
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		int th = -1;
		for (Node child : node.children) {
			int ch = ht(child);
			if (ch > th) {
				th = ch;
			}
		}
		return th + 1;
	}

// question of lecture_ 20; 

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {
		int left = 0;
		int right = node.children.size() - 1;
		while (left < right) {
			Node ln = node.children.get(left);
			Node rn = node.children.get(right);
			node.children.set(left, rn);
			node.children.set(right, ln);
			left++;
			right--;
		}
		for (Node child : node.children) {
			mirror(child);
		}
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {
		System.out.println(node.data);
		for (Node child : node.children) {
			preorder(child);
		}

	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {

		for (Node child : node.children) {
			postorder(child);
		}
		System.out.println(node.data);
	}

	public void levelorder() {
		LinkedList<Node> q = new LinkedList<>();
		q.addLast(this.root);
		while (!q.isEmpty()) {
			Node rn = q.removeFirst();
			System.out.print(rn.data + " ");
			for (Node child : rn.children) {
				q.addLast(child);
			}

		}
		System.out.println();

	}

	public void levelorderlinewise() {
		LinkedList<Node> q = new LinkedList<>();// q=queue
		LinkedList<Node> h = new LinkedList<>();// h=helper
		q.addLast(this.root);
		while (!q.isEmpty()) {
			Node rn = q.removeFirst();
			System.out.print(rn.data + " ");
			for (Node child : rn.children) {
				h.addLast(child);
			}
			if (q.isEmpty()) {
				System.out.println();
				q = h;
				h = new LinkedList<>();
			}
		}
	}

	public void printAtLevel(int level) {
		printAtLevel(this.root, level, 0);
		System.out.println();
	}

	private void printAtLevel(Node node, int level, int count) {
		if (level == count) {
			System.out.println(node.data + "");
		}
		for (Node child : node.children) {
			printAtLevel(child, level, count + 1);
		}

	}

	private class HeapMover {

		int size;
		boolean find;
		int max = Integer.MIN_VALUE;
		int ht;

		Node pred;
		Node succ;
		Node jl;

	}

	public void multiSolver(int item) {

		HeapMover mover = new HeapMover();

		multiSolver(this.root, item, 0, mover);

		System.out.println("Max : " + mover.max);
		System.out.println("Find : " + mover.find);
		System.out.println("Ht : " + mover.ht);
		System.out.println("Size : " + mover.size);

		System.out.println("Pred : " + (mover.pred != null && mover.find == true ? mover.pred.data : null));
		System.out.println("Succ : " + (mover.succ == null ? null : mover.succ.data));
		System.out.println("JL : " + (mover.jl == null ? null : mover.jl.data));
	}

	private void multiSolver(Node node, int item, int count, HeapMover mover) {

		mover.size++;

		if (mover.find == true && mover.succ == null) {
			mover.succ = node;
		}

		if (node.data == item) {
			mover.find = true;
		}

		if (mover.find == false) {
			mover.pred = node;
		}

		if (node.data > mover.max) {
			mover.max = node.data;
		}

		if (count > mover.ht) {
			mover.ht = count;
		}

		if (node.data > item) {

			if (mover.jl == null || node.data < mover.jl.data) {
				mover.jl = node;

			}
		}

		for (Node child : node.children) {
			multiSolver(child, item, count + 1, mover);
		}

	}

	public static boolean checkIdentical(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		if (node1 == null || node2 == null) {
			return false;
		}
		if (node1.data != node2.data) {
			return false;
		}
		for (int i = 0; i < node1.children.size(); i++) {
			if (!checkIdentical(node1.children.get(i), node2.children.get(i))) {
				return false;
			}
		}
		return true;
	}

	public int countLeafNodes() {
		return this.countLeafNodes(this.root);
	}

	private int countLeafNodes(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.children.size() == 0) {
			return 1;
		}
		int count = 0;
		for (Node child : node.children) {
			count += countLeafNodes(child);
		}
		return count;
	}

	public void replaceWithDepth() {
		this.replaceWithDepth(this.root, 0);
	}

	private void replaceWithDepth(Node node, int d) {

		if (node == null) {
			return;
		}

		node.data = d;
		for (Node child : node.children) {
			replaceWithDepth(child, d + 1);
		}
	}
	public int sumOfNodes() {
		return this.sumOfNodes(this.root) ;
	}
	
	private int sumOfNodes(Node node) {
		if(node==null){
		    return 0;
		}
		int total=0;
		for(int i=0;i<node.children.size();++i){
		    total+=sumOfNodes(node.children.get(i));
		}
		return node.data+total;

	}
}
