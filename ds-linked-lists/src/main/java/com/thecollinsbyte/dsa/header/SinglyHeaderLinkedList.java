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
        this.size = 0;
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
        if(position < 1 || position > size + 1) {
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

    public void deleteFirst() {
        if(size == 0 || header.next == null) {
            throw new IllegalStateException("List is empty");
        }
        header.next = header.next.next;
        size--;
    }

    public void deleteAtPosition(int position) {
        if(position < 1 || position > size + 1) {
            System.out.println("Position out of bounds");
            throw new IllegalStateException("Position out of bounds");
        }

        if(position == 1) {
            deleteFirst();
            return;
        }

        if(position == size + 1) {
            deleteLast();
            return;
        }

        Node current = header;
        int currentPosition = 0;

        while(currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        current.next = current.next.next;

        size--;
    }

    public void deleteLast() {
        if(size == 0 || header.next == null) {
            throw new IllegalStateException("List is empty");
        }
        Node current = header;
        while(current.next != null && current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
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

    public boolean contains(T data) {
        if(size == 0 || header.next == null) {
            throw new IllegalStateException("List is empty");
        }

        Node current = header.next;

        while(current != null) {
            if(current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public List<T> traverseForward() {
        if(size == 0 || header.next == null) {
            throw new IllegalStateException("List is empty");
        }

        List<T> results = new ArrayList<>();

        Node current = header.next;
        while(current != null) {
            results.add(current.data);
            current = current.next;
        }

        return results;
    }

    public List<T> traverseBackward() {
        if(size == 0 || header.next == null) {
            throw new IllegalStateException("List is empty");
        }

        List<T> results = new ArrayList<>();
        int count = 0;
        Node current = header.next;

        while(current != null) {
            count++;
            current = current.next;
        }

        current = header.next;
        for (int i = 0; i < count; i++) {
            current = header.next;
            for (int j = 0; j < count - i - 1; j++) {
                current = current.next;
            }
            results.add(current.data);
        }

        return results;
    }
}
