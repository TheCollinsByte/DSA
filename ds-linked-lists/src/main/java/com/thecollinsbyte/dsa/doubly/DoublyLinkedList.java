package com.thecollinsbyte.dsa.doubly;

import java.util.List;
import java.util.ArrayList;

class Node<T> {
    T data;
    Node prev;
    Node next;

    public Node(T data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class DoublyLinkedList<T> {

    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(T data) {
        if(head == null) {
            throw new IllegalStateException("Cannot search from an empty list");
        }

        Node<T> current = head;
        while(current != null) {
            if(current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public List<T> traverse() {
        List<T> elements = new ArrayList<>();
        Node<T> current = head;
        while(current != null){
            elements.add(current.data);
            current = current.next;
        }
        return elements;
    }

    public void insertAtEnd(T data) {
        Node newNode = new Node(data);
        if(head == null || tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAtBeginning(T data) {
    }
}
