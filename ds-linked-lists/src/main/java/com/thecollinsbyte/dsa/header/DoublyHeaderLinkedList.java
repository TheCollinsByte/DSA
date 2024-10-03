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

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.prev = header.prev;
        newNode.next = header;
        header.prev.next = newNode;
        header.prev = newNode;
        size++;
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
}
