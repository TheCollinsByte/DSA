package com.thecollinsbyte.dsa.header;

import java.util.ArrayList;
import java.util.List;

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

        List<T> result = new ArrayList<>();
        Node<T> current = header.next;

        while(current != header) {
            result.add(current.data);
            current = current.next;
        }

        return result;
    }

    public List<T> traverseBackward() {
        if(size == 0) {
            throw new IllegalStateException("List is empty");
        }

        List<T> result = new ArrayList<>();
        Node<T> current = header.prev;

        while(current != header) {
            result.add(current.data);
            current = current.prev;
        }

        return result;
    }
}
