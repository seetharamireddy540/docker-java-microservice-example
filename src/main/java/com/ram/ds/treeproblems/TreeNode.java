package com.ram.ds.treeproblems;

public class TreeNode<T> implements Comparable<T> {

  private final T data;
  private TreeNode<T> left;
  private TreeNode<T> right;

  public TreeNode(final T data) {
	this.data = data;
  }

  public void setLeft(final TreeNode<T> left) {
	this.left = left;
  }

  public void setRight(final TreeNode<T> right) {
	this.right = right;
  }

  public T getData() {
	return this.data;
  }

  public TreeNode<T> getLeft() {
	return this.left;
  }

  public TreeNode<T> getRight() {
	return this.right;
  }

  @Override
  public int compareTo(final T o) {
	return 0;
  }
}
