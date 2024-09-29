package com.thecollinsbyte.dsa.circular;

class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList<T> {

    private Node<T> tail;
    private int size;


    public CircularLinkedList() {
        this.tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>();
    }
}
