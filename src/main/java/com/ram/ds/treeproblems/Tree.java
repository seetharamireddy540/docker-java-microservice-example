package com.ram.ds.treeproblems;

public class Tree<T extends Comparable<T>> {

  private TreeNode<T> root;

  public Tree() {
  }

  public Tree(final TreeNode<T> root) {
    this.root = root;
  }

  public TreeNode<T> getRoot() {
    return root;
  }

  public void insertNode(TreeNode<T> node) {
    if (this.root == null) {
      this.root = node;
      return;
    }
  }

  public void printInorder() {

    printInorder(this.root);
  }

  private void printInorder(final TreeNode<T> root) {
    if (root == null) {
      return;
    }
    printInorder(root.getLeft());
    System.out.print(" -> " + root.getData());
    printInorder(root.getRight());
  }

  public void printPreOrder() {
    printPreOrder(this.root);

  }

  private void printPreOrder(final TreeNode<T> root) {
    if (root == null) {
      return;
    }
    System.out.print(" -> " + root.getData());
    printInorder(root.getLeft());
    printInorder(root.getRight());

  }

  public void printPostOrder() {
    printPostOrder(this.root);

  }

  private void printPostOrder(final TreeNode<T> root) {
    if (root == null) {
      return;
    }
    printInorder(root.getLeft());
    printInorder(root.getRight());
    System.out.print(" -> " + root.getData());
  }
}
