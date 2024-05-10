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

        public int getData() {
            return data;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
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

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;   // Break the chain
        return current;
    }

    public ListNode delete(int position) {
        if (position == 1) {
            head = head.next;
        }

        ListNode previous = head;
        int count = 1;

        while (count < position - 1) {
            previous = previous.next;
            count++;
        }

        ListNode current = previous.next;
        previous.next = current.next;
        return current;
    }
}
