package com.thecollinsbyte.dsa.header;

public class SinglyHeaderLinkedList<T> {

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node header;

    public SinglyHeaderLinkedList() {
        this.header = new Node(null);
    }

}
