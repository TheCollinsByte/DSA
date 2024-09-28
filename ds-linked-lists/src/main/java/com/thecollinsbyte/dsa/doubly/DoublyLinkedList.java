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

    public int length() {
        if(head == null) {
            return 0;
        }

        Node<T> current = head;
        int length = 0;
        while(current != null) {
            current = current.next;
            length++;
        }

        return length;
    }

    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        int currentPosition = 0;

        while(current != null) {
            if(currentPosition == index) {
                return current.data;
            }
            current = current.next;
            currentPosition++;
        }

        return null;
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

    public void insertAtBeginning(T data) {
        Node newNode = new Node<>(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtPosition(T data, int position) {
        if(position < 0 || position > size){
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        if(position == 0) {
            insertAtBeginning(data);
            return;
        }
        if(position == size) {
            insertAtEnd(data);
            return;
        }
        Node<T> newNode = new Node<>(data);
        Node<T> current = head;

        for(int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;
        if(current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        size++;
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

    public void deletionAtBeginning() {
        if(head == null) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }
        if(head == tail) {
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void deleteAtPosition(int position) {
        if(position < 0 || position >= size){
            throw new IndexOutOfBoundsException("Invalid Position");
        }

        if(position == 0) {
            deletionAtBeginning();
            return;
        }

        if(position == size - 1) {
            deletionAtEnd();
            return;
        }

        Node<T> current = head;
        for(int i = 0; i < position; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        if(current.next != null) {
            current.next.prev = current.prev;
        }

        size--;
    }

    public void deletionAtEnd() {
        if(tail == null) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }
        if(head == tail) {
            head = tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
}
