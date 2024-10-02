package com.thecollinsbyte.dsa.header;

import java.util.ArrayList;
import java.util.List;

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

    public void insertAtPosition(T data, int position) {
        if(position < 1 || position >= size + 1) {
            throw new IllegalStateException("Position out of bounds");
        }

        if(position == 1) {
            insertAtBeginning(data);
            return;
        }

        if(position == size + 1) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = header;
        int currentPosition = 0;

        while(current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if(current == null) {
            throw new IllegalStateException("Position out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        Node newNode = new Node(data);
        Node current = header;
        while(current.next != null) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public List<T> traverseForward() {
        List<T> results = new ArrayList<>();

        if(size == 0 || header == null) {
            throw new IllegalStateException("List is empty");
        }

        Node current = header.next;
        while(current != null) {
            results.add(current.data);
            current = current.next;
        }

        return results;
    }
}
