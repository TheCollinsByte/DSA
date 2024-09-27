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
            return new ArrayList();
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
    }
}
