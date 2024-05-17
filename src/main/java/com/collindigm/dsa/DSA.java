package com.collindigm.dsa;

import com.collindigm.dsa.list.DoublyLinkedList;
import com.collindigm.dsa.list.SinglyLinkedList;

public class DSA {
    public static void main(String[] args){
        /*
        double now = System.currentTimeMillis();

        SumOfNumber sumOfNumber = new SumOfNumber();
        System.out.println(sumOfNumber.findSumByFormula(9999));

        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " milliseconds");

        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();

        int[] values = new int[]{-20, 1, 0, 2, 3, 0, 4, 6, 7, 8, 9, 10, 11};

        int[] odd = arrayUtil.removeEven(values);
        arrayUtil.printArray(odd); // 1, 3, 5, 7, 9

        arrayUtil.reverseArray(values, 0, values.length - 1);
        arrayUtil.printArray(values); // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

        int minimumValue = arrayUtil.findMinimum(values);
        System.out.println("Minimum Value: " + minimumValue);

        int secondMaximumValue = arrayUtil.findSecondMaximumValue(values);
        System.out.println("Second Maximum Value: " + secondMaximumValue);

        arrayUtil.moveZeros(values, values.length);
        arrayUtil.printArray(values); //

        System.out.println("The Size of original array - " + values.length);
        values = arrayUtil.resize(values, values.length * 2);
        System.out.println("The Size of original array after resize - " + values.length);

        int missingNumber = arrayUtil.findMissingNumber(new int[]{1, 2, 4, 5, 6, 7, 8});
        System.out.println("Missing number in array: " + missingNumber);

        if (arrayUtil.isPalindrome("madam")) {
            System.out.println("The string is palindrome !!!");
        } else {
            System.out.println("The string is not palindrome !!!");
        }
        */

        /*
        // Singly Linked List
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new SinglyLinkedList.ListNode(10);
        SinglyLinkedList.ListNode second = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode third = new SinglyLinkedList.ListNode(8);
        SinglyLinkedList.ListNode fourth = new SinglyLinkedList.ListNode(11);

        // Now We will connect them together to form a chain
        sll.head.setNext(second); // 10 --> 1
        second.setNext(third);    // 10 --> 1 --> 8
        third.setNext(fourth);    // 10 --> 1 --> 8 --> 11 --> null

        sll.display();
        System.out.println();
        System.out.println("Length of a Singly Linked List: " + sll.length());

        sll.insertFirst(10);
        sll.insertFirst(1);
        sll.insertFirst(0);
        sll.insertLast(100);
        sll.insert(50, 1);
        sll.insert(60, 5);

        sll.display();
        System.out.println();
        System.out.println(sll.deleteFirst().getData());
        sll.display();
        System.out.println(sll.deleteLast().getData());
        sll.display();
        System.out.println("Delete at position 3: " + sll.delete(1).getData());
        sll.display();

        if (sll.find(sll.head, 50)) {
            System.out.println("Search Value Found");
        } else {
            System.out.println("Search Value Not Found");
        }

        sll.display();
        sll.reverse(sll.head);
        sll.display();

        SinglyLinkedList.ListNode node = sll.getNthNodeFromEnd(1);
        System.out.println(node.getData());

        SinglyLinkedList node1 = new SinglyLinkedList();
        node1.head = new SinglyLinkedList.ListNode(1);
        node1.insertLast(4);
        node1.insertLast(8);

        SinglyLinkedList node2 = new SinglyLinkedList();
        node2.head = new SinglyLinkedList.ListNode(3);
        node2.insertLast(5);
        node2.insertLast(8);
        node2.insertLast(9);
        node2.insertLast(4);
        node2.insertLast(1);

        node1.display();
        node2.display();

        SinglyLinkedList result = new SinglyLinkedList();
        result.head = result.add(node1.head, node2.head);
        //result.head = node2.merge(node1.head, node2.head);

        result.display();
         */

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.displayForward();
        dll.displayBackward();
    }
}
