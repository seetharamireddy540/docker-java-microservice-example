package com.ram.ds;

public class LinkedList<T extends Comparable<T>> {

  private Node<T> head;
  private Node<T> tail;

  public void add(T data) {

    Node node = new Node(data);
    if (this.head == null) {
      this.head = node;
    }
    if (this.tail == null) {
      this.tail = node;
    }

    this.tail.setNext(node);
    this.tail = node;
  }
}
