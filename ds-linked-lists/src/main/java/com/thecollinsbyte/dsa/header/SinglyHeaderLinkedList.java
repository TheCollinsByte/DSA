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
