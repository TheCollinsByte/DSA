package com.thecollinsbyte.dsa.header;


public class SinglyCircularHeaderLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> header;
    private int size;

    public SinglyCircularHeaderLinkedList() {
        header = new Node<>(null);
        header.next = header;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if(header.next == header) {
            header.next = newNode;
            newNode.next = header;
            size++;
            return;
        }
        newNode.next = header.next;
        header.next = newNode;
        size++;
    }
}
