package lecture_22;

import java.util.LinkedList;
import java.util.Scanner;

public class binary_tree {
	public static void main(String[] args) {
		binary_tree bt = new binary_tree();
		Scanner Scn = new Scanner(System.in);
		int i = Scn.nextInt();
//		bt.printLevelOrder();
//		bt.printleaf();
//		bt.secondlargest();
//		System.out.println(bt.haspathSum(i));
		System.out.println(bt.sumpath(i));

	}

	static Scanner Scn = new Scanner(System.in);

	public class Node {
		int data;

		Node left;
		Node right;
	}

	private Node root;

	public binary_tree() {
		this.root = takeInput(null, false);
	}

	public binary_tree(int[] pre, int[] in) {
		this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (plo > phi || ilo > ihi) {
			return null;
		}
		Node nn = new Node();
		nn.data = pre[plo];
		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (pre[plo] == in[i]) {
				si = i;
				break;
			}

		}

		int nel = si - ilo;
		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nn;
	}
//	public  binary_tree(int[] post, int[] in) {
//		this.root=construct(post, in, 0, post.length - 1, 0, in.length - 1);
//	}
//
//	private  Node construct(int[] post, int[] in, int postS, int postE, int inS, int inE) {
//		if (inS > inE) {
//			return null;
//		}
//		int rootData = post[postE];
//		Node nn = new Node();
//		int i = inS;
//		while (i <= inE) {
//			if (in[i] == rootData) {
//				break;
//			}
//			i++;
//		}
//		int leftInStart = inS;
//		int leftInEnd = i - 1;
//		int rightInStart = i + 1;
//		int rightInEnd = inE;
//		int leftPostStart = postS;
//		int rightPostEnd = postE - 1;
//		int leftLength = leftInEnd - leftInStart + 1;
//		int leftPostEnd = leftPostStart + leftLength - 1;
//		int rightPostStart = leftPostEnd + 1;
//		nn.left = construct(post, in, leftPostStart, leftPostEnd, leftInStart, leftInEnd);
//		nn.right = construct(post, in, rightPostStart, rightPostEnd, rightInStart, rightInEnd);
//		return nn;
//	}

	private Node takeInput(Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("enter the data for root node");
		} else {
			if (ilc) {
				System.out.println("enter the data for left child" + parent.data);
			} else {
				System.out.println("enter the data of right chlid" + parent.data);
			}
		}
		int item = Scn.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println(nn.data + "has left child");
		boolean hlc = Scn.nextBoolean();
		if (hlc) {
			nn.left = takeInput(nn, true);

		}
		System.out.println(nn.data + "has right child");
		boolean hrc = Scn.nextBoolean();
		if (hrc) {
			nn.right = takeInput(nn, false);

		}
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

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int tm = node.data;
		int lm = max(node.left);

		if (lm > tm) {
			tm = lm;

		}
		int rm = max(node.right);
		if (rm > tm) {
			tm = rm;
		}
		return tm;
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
		boolean tf = false;
		boolean fl = find(node.left, item);
		if (fl) {
			tf = true;
		}
		boolean fr = find(node.right, item);
		if (fr) {
			tf = true;
		}
		return tf;
	}

	public int ht() {
		return ht(this.root);
	}

	private static int ht(Node node) {

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

	private class diapair {
		int diameter = 0;
		int ht = -1;
	}

	public int diameter2() {
		return diameter2(this.root).diameter;
	}

	private diapair diameter2(Node node) {
		if (node == null) {
			diapair d = new diapair();
			return d;
		}
		diapair ll = diameter2(node.left);
		diapair rl = diameter2(node.right);
		diapair np = new diapair();
		np.ht = Math.max(rl.ht, ll.ht) + 1;
		int ld = ll.diameter;
		int rd = rl.diameter;
		int sp = rl.ht + ll.ht + 2;
		np.diameter = Math.max(sp, Math.max(ld, rd));
		return np;

	}

	private class isbal {
		boolean bal = true;
		int ht = -1;
	}

	public boolean isBalance() {

		return isBalance(this.root).bal;
	}

	private isbal isBalance(Node node) {
		if (node == null) {
			isbal bp = new isbal();
			return bp;
		}
		isbal lbp = isBalance(node.left);
		isbal rbp = isBalance(node.right);
		isbal bal = new isbal();
		bal.ht = (Math.max(lbp.ht, rbp.ht)) + 1;
		if (lbp.bal && rbp.bal && Math.abs(lbp.ht - rbp.ht) <= 1) {
			bal.bal = true;
		} else {
			bal.bal = false;
		}
		return bal;
	}

	public void perorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}

	public void inorder() {
		inorder(this.root);
	}

	private void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);

		postorder(node.right);
		System.out.println(node.data);
	}

	private class pair {
		boolean selfdone;
		boolean leftdone;
		boolean rightdone;
		public Node node;

	}

	public void peroderI() {
		LinkedList<pair> s = new LinkedList<>();
		pair sp = new pair();
		sp.node = this.root;
		s.addFirst(sp);
		while (!s.isEmpty()) {
			pair tp = s.getFirst();
			if (tp.node == null) {
				s.removeFirst();
				continue;
			}
			if (tp.selfdone == false) {
				System.out.println(tp.node.data + " ");
				tp.selfdone = true;
			} else if (tp.leftdone == false) {
				pair np = new pair();
				np.node = tp.node.left;
				s.addFirst(np);
				tp.leftdone = true;
			} else if (tp.rightdone == false) {
				pair np = new pair();
				np.node = tp.node.right;
				s.addFirst(np);
				tp.rightdone = true;
			} else {

				s.removeFirst();
			}
		}
	}

	public void sibling() {
		this.sibling(this.root);
	}

	private void sibling(Node node) {
		if (node == null) {
			return;
		}
		if (node.left == null || node.right == null) {
			if (node.left != null) {
				System.out.println(node.left.data);
			}
			if (node.right != null) {
				System.out.println(node.right.data);
			}
		}
		sibling(node.left);
		sibling(node.right);
	}

	public int sumOfNodes() {
		return this.sumOfNodes(this.root);
	}

	private int sumOfNodes(Node node) {
		if (node == null) {
			return 0;
		}
		return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);

	}

//	public boolean structurallyIdentical(BinaryTree other) {
//		return this.structurallyIdentical(this.root, other.root);
//	}
//
//	private boolean structurallyIdentical(Node tnode, Node onode) {
//		if (tnode == null && onode == null)
//			return true;
//
//		if (tnode != null && onode != null)
//			return (structurallyIdentical(tnode.left, onode.left) && structurallyIdentical(tnode.right, onode.right));
//
//		return false;
//	}
	public void printLevelOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printGivenLevel(root, i);
	}

	int height(Node root) {
		if (root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);

			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	public void printGivenLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			System.out.println();
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	public void printleaf() {
		printleaf(this.root);
	}

	private void printleaf(Node node) {
		if (node == null) {
			return;
		}
		if (node.right == null && node.left == null) {
			System.out.println(node.data);
		}
		if (node.left != null) {
			printleaf(node.left);
			if (node.right != null) {
				printleaf(node.right);
			}
		}
	}

	public void remove() {
		remove(this.root);
	}

	private Node remove(Node node) {
		if (node == null) {
			return null;
		}
		if (node.left == null && node.right == null) {
			return null;
		}
		node.left = remove(node.left);
		node.right = remove(node.right);
		return node;
	}

//	public void findSecondLargest() {
//		findSceondLargest(this.root);
//	}
//
//	private Node findSceondLargest(Node root) {
//		if (root == null || (root.left == null && root.right == null))
//			return null;
//		Node parent = null, child = root;
//		while (child.right != null) {
//			parent = child;
//			child = child.right;
//		}
//		if (child.left == null)
//			return parent;
//		child = child.left;
//		while (child.right != null) {
//			child = child.right;}
//		return child;
//	}
	public void secondlargest() {
		secondlargest(this.root);

	}

	private void secondlargest(Node node) {
		if (node == null || node.right == null && node.left == null) {
			return;
		}
		if (root.right == null) {
			Node temp = null;
			temp = node.left;
			while (temp.right != null) {
				temp = temp.right;
			}
			return;
		}
		Node p = null;
		Node temp = null;
		p = node;
		temp = node.right;
		while (temp.right != null) {
			p = temp;
			temp = temp.right;
		}
		System.out.println(p.data);
	}

	public int sumpath(int sum) {
		return haspathSum(this.root, sum);
	}

	private static int haspathSum(Node node, int sum) {
		if (node == null)
			return 0;
		else {

			/* otherwise check both subtrees */
			int subsum = sum - node.data;
			if (subsum == 0 && node.left == null && node.right == null)
				return 0;
			int ans = 0;
			if (node.left != null)
				ans = haspathSum(node.left, subsum);
			if (node.right != null)
				ans = haspathSum(node.right, subsum);
			return ans;
		}
	}
//	public void printsumpath(int sum) {
//		printsumpath(this.root,sum,0);
//	}
//	private void printsumpath(Node node, int sum, int ssf) {
//		if(node==null) {
//			return;
//		}
//		
//			
//		}
//		Node newnode(int key) {
//			Node temp=new Node();
//			temp.k
//			
//		}
//	}

//	private void display(Node node) {
//		if (node == null) {
//			return;
//		}
//		String str = "";
//		if (node.left == null) {
//			str += ".";
//		} else {
//			str += node.left.data;
//		}
//		str += "->" + node.data + "<-";
//		if (node.right == null) {
//			str += ".";
//
//		} else {
//			str += node.right.data;
//		}
//		System.out.println(str);
//		display(node.left);
//		display(node.right);
//
//	}

	
}
