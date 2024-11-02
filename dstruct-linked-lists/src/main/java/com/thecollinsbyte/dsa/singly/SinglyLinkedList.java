package com.thecollinsbyte.dsa.singly;

import java.util.List;
import java.util.ArrayList;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


public class SinglyLinkedList<T> {

    private Node<T> head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public List<T> traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return new ArrayList<>();
        }
        List<T> elements = new ArrayList<>();
        Node<T> current = head;
        while (current != null) {
            elements.add(current.data);
            current = current.next;
        }
        return elements;
    }


    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPosition(T data, int position) {
        Node<T> newNode = new Node<>(data);
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node<T> current = head;
        int currentPosition = 0;

        while(current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if(current == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deletionAtBeginning() {
        if (head == null) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }
        head = head.next;
    }

    public void deletionAtEnd() {
        if(head == null) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }
        if(head.next == null) {
            head = null;
            return;
        }

        Node<T> secondToLast = head;

        while(secondToLast.next.next != null)
            secondToLast = secondToLast.next;

        secondToLast.next = null;
    }

    public void deletionAtPosition(int position) {
        if(head == null){
            throw new IllegalStateException("Cannot delete from an empty list");
        }
        if(position < 1) {
            throw new IllegalStateException("Position cannot be negative");
        }
        if(position == 0) {
            deletionAtBeginning();
            return;
        }

        Node<T> current = head;
        int currentPosition = 0;

        while(current.next != null) {
            if(currentPosition == position - 1) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
            currentPosition++;
        }

        throw new IndexOutOfBoundsException("Position out of bounds");
    }

    public boolean contains(T data) {
        if(head == null) {
            throw new IllegalStateException("Cannot search from an empty list");
        }
        while(head != null) {
            if(head.data.equals(data)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int size() {
        int size = 0;
        Node<T> current = head;
        while(current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public T get(int index) {
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        Node<T> current = head;
        int currentIndex = 0;
        while(current != null) {
            if(currentIndex == index) {
                return current.data;
            }
            current = current.next;
            currentIndex++;
        }
        return null;
    }
}
