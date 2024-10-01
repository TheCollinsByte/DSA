package com.thecollinsbyte.dsa.circular;

import java.util.ArrayList;
import java.util.List;

public class CircularDoublyLinkedList<T> {

    private class Node {

        T data;
        Node prev;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public int length() {
        if(head == null || tail == null) {
            return 0;
        }

        Node current = tail.next;
        int length = 1;
        do {
            current = current.next;
            length++;
        } while(current != tail.next);

        return length;
    }

    public List<T> traverse() {
        if(head == null || tail == null || size == 0) {
            throw new IllegalStateException("List is empty");
        }

        List<T> results = new ArrayList<>();
        Node current = head;
        do {

            results.add(current.data);
            current = current.next;
        } while(current != tail.next);

        return results;
    }

    public void insertAtEmpty(T data) {
        if(size == 0) {
            Node newNode = new Node(data);
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            size++;
        } else {
            throw new IllegalStateException("List is not empty");
        }
    }

    public void insertAtBeginning(T data) {
        Node newNode = new Node(data);
        if(size == 0) {
            insertAtEmpty(data);
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
            size++;
        }
    }

    public void insertAtEnd(T data) {
        Node newNode = new Node(data);
        if(size == 0) {
            insertAtEmpty(data);
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
            size++;

        }
    }
}
