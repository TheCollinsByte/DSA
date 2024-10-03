package com.thecollinsbyte.dsa.header;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoublyCircularHeaderLinkedListTest {

    private DoublyCircularHeaderLinkedList<Integer> integerList;

    @BeforeEach
    public void setUp() {
        integerList = new DoublyCircularHeaderLinkedList<>();
    }

    @Test
    public void testInsertAtBeginning() {
        integerList.insertAtBeginning(40);
        integerList.insertAtBeginning(30);
        integerList.insertAtBeginning(20);
        integerList.insertAtBeginning(10);

        List<Integer> result = integerList.traverseForward();

        assertEquals(List.of(10, 20, 30, 40), result);
        assertEquals(4, integerList.size());
    }

    @Test
    public void testInsertAtPosition() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);
        integerList.insertAtPosition(30, 3);

        List<Integer> result = integerList.traverseForward();

        assertEquals(List.of(10, 20, 30, 40, 50), result);
        assertEquals(5, integerList.size());
    }

    @Test
    public void testInsertAtEnd() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtEnd(40);

        List<Integer> result = integerList.traverseForward();

        assertEquals(List.of(10, 20, 30, 40), result);
        assertEquals(4, integerList.size());
    }

    @Test
    public void testBidirectionalTraversal() {
        integerList.insertAtBeginning(40);
        integerList.insertAtBeginning(30);
        integerList.insertAtBeginning(20);
        integerList.insertAtBeginning(10);

        List<Integer> forwardTraverse = integerList.traverseForward();
        List<Integer> backwardTraverse = integerList.traverseBackward();

        assertEquals(List.of(10, 20, 30, 40), forwardTraverse);
        assertEquals(List.of(40, 30, 20, 10), backwardTraverse);
    }
}

