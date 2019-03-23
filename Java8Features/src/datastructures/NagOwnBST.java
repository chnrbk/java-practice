package datastructures;

import datastructures.BST.Node;

public class NagOwnBST {

	Node root;

	public NagOwnBST(int item) {
		root = new Node();
		root.data = item;
		root.left = null;
		root.right = null;
	}

	// insert

	public boolean insert(int item) {
		Node n = new Node();
		n.data = item;
		n.left = null;
		n.right = null;
		Node p = root;
		Node c = root;
		if (root == null) {
			root = n;
			return true;
		}
		p = c;
		// iterate all the nodes till child node is null, so there we will add
		// new node
		while (c != null) {
			p = c;
			if (item < c.data) {
				c = c.left;
			} else {
				c = c.right;
			}
		}
		if (item < p.data) {
			p.left = n;
		} else {
			p.right = n;
		}

		return true;
	}

	class Node {
		int data;
		Node left, right;
	}

	public void showAll() {

		if (root == null) {
			System.out.println("empty");
			return;
		}
		Node l = root;
		Node r = root;

		System.out.print(" " + root.data);
		
		while (r != null && l!=null) {
			l=l.left;
			System.out.print(" " + l.data);
			r=r.right;
			System.out.print(" " + r.data);
			
		}

	}
	
	public Node findNode(int key) {
		Node c = root;
		while (c != null) {

			if (key==c.data) {
				break;
			}
			if (key<c.data) {
				c = c.left;
			} else {
				c = c.right;
			}
		}
		return c;

	}
	
	// recursion
		public void showAll(Node n) {
			// start from root
			Node p = n;
			if (p != null) {
				System.out.print(" " + p.data);
				showAll(p.left);
				showAll(p.right);
			}

		}

}
