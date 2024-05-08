package com.collindigm.dsa.list;

public class SinglyLinkedList {

    public ListNode head;

    public static class ListNode {
        private int data;       // Generic Type
        private ListNode next;

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
}
