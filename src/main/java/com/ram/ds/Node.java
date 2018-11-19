package com.ram.ds;

public class Node<T extends Comparable<T>> {

  private T data;
  private Node<T> next;

  public Node(final T data) {
    this.data = data;
    this.next = null;
  }

  public T getData() {
    return data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(final Node<T> next) {
    this.next = next;
  }
}
