package hw_data_structure;

import java.util.*;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-10-Nov-2018
 */
public class binarytree {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		binarytree m = new binarytree();
		BinaryTree bt = m.new BinaryTree();
		bt.printLevelOrder();
		bt.printleaf();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

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

	}

}
