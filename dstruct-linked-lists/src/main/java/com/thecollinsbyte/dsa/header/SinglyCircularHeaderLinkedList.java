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

        Node<T> current = header;
        Node<T> newNode = new Node<>(data);
        int currentPosition = 1;

        while(currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        newNode.next = current.next;
        current.next = newNode;

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

    public void deleteFirst() {
        if(size == 0 || header.next == header) {
            throw new IllegalStateException("List is empty");
        }
        header.next = header.next.next;
        size--;
    }

    public void deleteAtPosition(int position) {
        if(size == 0 || header.next == header) {
            throw new IllegalStateException("List is empty");
        }

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

        int currentPosition = 1;
        Node<T> current = header;

        while(currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        current.next = current.next.next;

        size--;
    }

    public void deleteLast() {
        if(size == 0 || header.next == header) {
            throw new IllegalStateException("List is empty");
        }

        Node<T> current = header;
        Node<T> prev = header;

        while(current.next != header) {
            prev = current;
            current = current.next;
        }

        prev.next = header;

        size--;
    }

    public boolean contains(T data) {
        Node<T> current = header.next;

        do {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        } while(current != header);

        return false;
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
