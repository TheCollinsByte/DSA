package com.collindigm.dsa.list;

public class SinglyLinkedList {

    public ListNode head;

    public static class ListNode {
        private int data;       // Can be a generic Type
        private ListNode next;  // Reference to next ListNode in list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int data, int position) {
        ListNode node = new ListNode(data);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;  // position - 1
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;   // Temporary Location
            previous.next = node;
            node.next = current;
        }
    }
}
