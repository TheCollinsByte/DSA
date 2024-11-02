package com.thecollinsbyte.dsa.header;

import java.util.List;
import java.util.ArrayList;

public class DoublyHeaderLinkedList<T> {

    static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node<T> header;
    private int size;

    public DoublyHeaderLinkedList() {
        this.header = new Node<T>(null);
        this.header.next = this.header;
        this.header.prev = this.header;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = header.next;
        newNode.prev = header;
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

        Node<T> newNode = new Node<T>(data);
        Node<T> current = header.next;
        int currentPosition = 1;

        while (currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;

        size++;
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.prev = header.prev;
        newNode.next = header;
        header.prev.next = newNode;
        header.prev = newNode;
        size++;
    }

    public void deleteFirst() {
        if(size == 0 || header.next == null) {
            throw new IllegalStateException("List is empty");
        }
        header.next = header.next.next;
        header.next.prev = header;
        size--;
    }

    public void deleteAtPosition(int position) {
        if(position < 1 || position > size + 1) {
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

        Node<T> current = header.next;
        int currentPosition = 1;

        while(currentPosition < position) {
            current = current.next;
            currentPosition++;
        }


        current.prev.next = current.next;
        current.next.prev = current.prev;

        size--;
    }

    public void deleteLast() {
        if(size == 0 || header.next == null) {
            throw new IllegalStateException("List is empty");
        }
        header.prev = header.prev.prev;
        header.prev.next = header;
        size--;
    }

    public boolean contains(T data) {

        Node<T> current = header.next;

        while(current != header) {
            if(current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public List<T> traverseForward() {
        if(size == 0) {
            throw new IllegalStateException("List is empty");
        }
        List<T> results = new ArrayList<T>();
        Node<T> current = header.next;

        while(current != header) {
            results.add(current.data);
            current = current.next;
        }

        return results;
    }

    public List<T> traverseBackward() {
        if(size == 0) {
            throw new IllegalStateException("List is empty");
        }

        List<T> results = new ArrayList<>();
        Node<T> current = header.prev;
        while(current != header) {
            results.add(current.data);
            current = current.prev;
        }

        return results;
    }
}
