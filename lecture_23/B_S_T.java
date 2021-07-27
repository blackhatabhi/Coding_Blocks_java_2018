package lecture_23;

public class B_S_T {
	private class Node {

		int data;
		Node left;
		Node right;
	}

	private Node root;

	public B_S_T(int[] in) {
		this.root = construct(in, 0, in.length - 1);
	}

	private Node construct(int[] in, int ilo, int iho) {
		if (ilo > iho) {
			return null;
		}
		int mid = (ilo + iho) / 2;
		Node nn = new Node();
		nn.data = in[mid];
		nn.left = construct(in, ilo, mid - 1);
		nn.right = construct(in, mid + 1, iho);
		return nn;
	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);
		return ls + rs + 1;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}

		int ll = diameter(node.left);
		int rl = diameter(node.right);
		int sp = ht(node.left) + ht(node.right) + 2;

		return Math.max(sp, Math.max(ll, rl));

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public boolean find() {
		return find(this.root, 70);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		if (item > node.data) {
			return find(node.right, item);

		} else if (item < node.data) {
			return find(node.left, item);
		} else {
			return true;
		}
	}

	public void printdec() {
		printdec(this.root);

	}

	private void printdec(Node node) {
		if (node == null) {
			return;
		}
		printdec(node.right);
		System.out.println(node.data);
		printdec(node.left);

	}

	public void printrange() {
		printrange(this.root, 7, 31);

	}

	private void printrange(Node node, int lo, int hi) {
		if (node == null) {
			return;
		}
		if (node.data < lo) {
			printrange(node.right, lo, hi);
		}
		if (node.data > hi) {
			printrange(node.left, lo, hi);
		}
		if (node.data <= hi && node.data >= lo) {
			printrange(node.right, lo, hi);
			System.out.println(node.data + " ");
			printrange(node.left, lo, hi);
		}
	}

	private class heapmover {
		int sum = 0;
	}

	public void replacewithsumlarger() {
		replacewithsumlarger(this.root, new heapmover());
	}

	private void replacewithsumlarger(Node node, heapmover mover) {
		replacewithsumlarger(node.right, mover);
		int temp = node.data;
		node.data = mover.sum;
		mover.sum += temp;
		replacewithsumlarger(node.left, mover);
	}

	public void add(int item) {
		add(this.root, item);
	}

	private void add(Node node, int item) {
		if (item > node.data) {
			if (node.right == null) {
				Node nn = new Node();
				nn.data = item;
				node.right = nn;
			} else {
				add(node.right, item);
			}
		} else {
			if (node.left == null) {
				Node nn = new Node();
				nn.data = item;
				node.left = nn;
			} else {
				add(node.left, item);
			}

		}

	}

	public void remove(int item) {
		remove(this.root, null, item);
	}

	private void remove(Node node, Node parent, int item) {
		if (node == null) {
			return;
		}
		if (item > node.data) {
			remove(node.right, node, item);
		} else if (item < node.data) {
			remove(node.left, node, item);
		} else {
			if (node.left == null && node.right == null) {
				if (node.data < parent.data) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (node.left == null && node.right != null) {
				if (node.data <= parent.data) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			} else if (node.left != null && node.right == null) {
				if (node.data <= parent.data) {
					parent.left = node.right;
				} else {
					parent.right = node.left;
				}
			} else {
				int max = max(node.left);
				node.data = max;
				remove(node.left, node, max);
			}
		}

	}

	public void display() {
		System.out.println("-------------------------------");
		display(this.root);
		System.out.println("-------------------------------");
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}
		str += "->" + node.data + "<-";
		if (node.right == null) {
			str += ".";

		} else {
			str += node.right.data;
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}
}
