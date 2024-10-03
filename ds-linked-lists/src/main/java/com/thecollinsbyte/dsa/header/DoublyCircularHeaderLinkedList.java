package com.thecollinsbyte.dsa.header;

public class DoublyCircularHeaderLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    private Node<T> header;
    private int size;

    public DoublyCircularHeaderLinkedList() {
        header = new Node<>(null);
        header.next = header;
        header.prev = header;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void insterAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = header.next;
        newNode.prev = header;
        header.next.prev = newNode;
        header.next = newNode;
        size++;
    }
}

