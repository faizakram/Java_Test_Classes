package com.st.Tree;

public class MainTree {

	public static void preOrder(Node tree) {
		if (tree != null) {
			System.out.println(tree.key); // 10
			preOrder(tree.left);
			preOrder(tree.right);
		}
	}

	public static void inOrder(Node tree) {
		if (tree != null) {
			inOrder(tree.left);
			System.out.println(tree.key); // 10
			inOrder(tree.right);
		}
	}

	public static void postOrder(Node tree) {
		if (tree != null) {
			postOrder(tree.left);
			postOrder(tree.right);
			System.out.println(tree.key); // 10
		}
	}

	public static Integer printTree(Node tree) {
		if (tree == null)
			return 0;

		if (tree.left == null && tree.right == null)
			return tree.key;
		
		
		return printTree(tree.left) + printTree(tree.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(10);
		/* create root */
		tree.left = new Node(1);
		tree.right = new Node(2);
		tree.left.left = new Node(3);
		tree.left.right = new Node(4);
		tree.right.left = new Node(5);
		tree.right.right = new Node(6);
		System.out.println(printTree(tree));
	}

}
