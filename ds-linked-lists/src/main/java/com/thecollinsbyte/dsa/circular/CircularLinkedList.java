package com.thecollinsbyte.dsa.circular;

import java.util.List;
import java.util.ArrayList;

class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList<T> {

    private Node<T> tail;
    private int size;


    public CircularLinkedList() {
        this.tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public List<T> traverse() {

        List<T> result = new ArrayList<>();

        if(size == 0) return result;
        Node<T> current = tail.next;
        do {
            result.add(current.data);
            current = current.next;
        } while(current != tail.next);

        return result;
    }

    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if(size == 0) {
            tail = newNode;
            tail.next = newNode;
            size++;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        size++;
    }

    public void insertAtPosition(T data, int position) {
        if(position < 1 || position > size + 1) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if(position == 1) {
            insertAtBeginning(data);
            return;
        } else if (position == size + 1) {
            insertAtEnd(data);
            return;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> current = tail.next;
        for(int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if(size == 0 && tail == null) {
            tail = newNode;
            tail.next = newNode;
            size++;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
        size++;
    }
}
