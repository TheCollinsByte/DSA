package com.thecollinsbyte.dsa.header;

import java.util.List;
import java.util.ArrayList;

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

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> current = header;
        if(current.next == header) {
            header.next = newNode;
            newNode.next = header;
            size++;
            return;
        }

        while(current.next != header) {
            current = current.next;
        }

        current.next = newNode;
        newNode.next = header;

        size++;
    }

    public List<T> traverseForward() {
        if (size == 0 || header.next == header) {
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
        if (size == 0 || header.next == header) {
            throw new IllegalStateException("List is empty");
        }

        List<T> result = new ArrayList<>();
        Node<T> current = header.next;

        do {
            result.add(current.data);
            current = current.next;
        } while (current != header);

        List<T> reversedResult = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            reversedResult.add(result.get(i));
        }

        return reversedResult;
    }
}
