package com.ram.ds.treeproblems;

public class TreeApp {

	public static void main(final String[] arg) {
		final TreeNode<Integer> node = new TreeNode<>(50);
		final TreeNode<Integer> node1 = new TreeNode<>(45);
		final TreeNode<Integer> node2 = new TreeNode<>(60);
		node.setLeft(node1);
		node.setRight(node2);
		final TreeNode<Integer> node3 = new TreeNode<>(80);
		node2.setRight(node3);

		final Tree<Integer> tree = new Tree(node);
		System.out.println(" Inorder");
		tree.printInorder();
		System.out.println(" \n PreOrder ");
		tree.printPreOrder();
		System.out.println(" \n PostOrder");
		tree.printPostOrder();
	}
}
