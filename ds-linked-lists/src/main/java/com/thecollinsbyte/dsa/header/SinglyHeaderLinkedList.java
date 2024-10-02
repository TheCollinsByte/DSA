package com.thecollinsbyte.dsa.header;

public class SinglyHeaderLinkedList<T> {

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node header;
    private int size;

    public SinglyHeaderLinkedList() {
        this.header = new Node(null);
    }

    public int size() {
        return size;
    }

    public void insertAtBeginning(T data) {
        Node newNode = new Node(data);
        newNode.next = header.next;
        header.next = newNode;
        size++;
    }

}
