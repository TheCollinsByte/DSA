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
}
