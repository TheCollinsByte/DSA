package com.thecollinsbyte.dsa.header;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class SinglyCircularHeaderLinkedListTest {

    private SinglyCircularHeaderLinkedList<Integer> integerList;

    @BeforeEach
    public void setUp() {
        integerList = new SinglyCircularHeaderLinkedList<>();
    }

    @Test
    public void testInsertAtBeginning() {
        integerList.insertAtBeginning(10);
        integerList.insertAtBeginning(20);
        integerList.insertAtBeginning(30);
        integerList.insertAtBeginning(40);
        integerList.insertAtBeginning(50);

        List<Integer> results = integerList.traverseForward();

        assertEquals(5, integerList.size());
        assertEquals(List.of(50, 40, 30, 20, 10), results);
    }

    @Test
    public void testInsertAtPosition() {
        integerList.insertAtBeginning(10);
        integerList.insertAtBeginning(20);
        integerList.insertAtBeginning(40);
        integerList.insertAtBeginning(50);
        integerList.insertAtPosition(30, 3);

        List<Integer> results = integerList.traverseForward();

        assertEquals(5, integerList.size());
        assertEquals(List.of(50, 40, 30, 20, 10), results);
    }

    @Test
    public void testInsertAtEnd() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);

        List<Integer> results = integerList.traverseForward();

        assertEquals(5, integerList.size());
        assertEquals(List.of(10, 20, 30, 40, 50), results);
    }

    @Test
    public void testDeleteFirst() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);
        integerList.deleteFirst();

        List<Integer> results = integerList.traverseForward();

        assertEquals(4, integerList.size());
        assertEquals(List.of(20, 30, 40, 50), results);
    }

    @Test
    public void testDeleteAtPosition() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);
        integerList.deleteAtPosition(3);

        List<Integer> results = integerList.traverseForward();

        assertEquals(4, integerList.size());
        assertEquals(List.of(10, 20, 40, 50), results);
    }

    @Test
    public void testDeleteLast() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);
        integerList.deleteLast();

        List<Integer> results = integerList.traverseForward();

        assertEquals(4, integerList.size());
        assertEquals(List.of(10, 20, 30, 40), results);
    }

    @Test
    public void testContains() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);

        assertEquals(true, integerList.contains(30));
        assertEquals(false, integerList.contains(100));
    }

    @Test
    public void testBidirectionalTraversal() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);

        List<Integer> forwardTraverse = integerList.traverseForward();
        List<Integer> backwardTraverse = integerList.traverseBackward();

        assertEquals(List.of(10, 20, 30, 40, 50), forwardTraverse);
        assertEquals(List.of(50, 40, 30, 20, 10), backwardTraverse);
    }
}
