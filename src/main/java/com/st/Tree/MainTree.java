package com.st.Tree;

public class MainTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();

		/* create root */
		tree.root = new Node(1);


		tree.root.left = new Node(2);
		tree.root.right = new Node(3);


		tree.root.left.left = new Node(4);
	}

}
