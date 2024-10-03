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
    public void insertAtBeginning() {
        integerList.insterAtBeginning(40);
        integerList.insterAtBeginning(30);
        integerList.insterAtBeginning(20);
        integerList.insterAtBeginning(10);

        List<Integer> result = integerList.traverseForward();

        assertEquals(List.of(10, 20, 30, 40), result);
        assertEquals(4, integerList.size());
    }

    @Test
    public void insertAtEnd() {
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
        integerList.insterAtBeginning(40);
        integerList.insterAtBeginning(30);
        integerList.insterAtBeginning(20);
        integerList.insterAtBeginning(10);

        List<Integer> forwardTraverse = integerList.traverseForward();
        List<Integer> backwardTraverse = integerList.traverseBackward();

        assertEquals(List.of(10, 20, 30, 40), forwardTraverse);
        assertEquals(List.of(40, 30, 20, 10), backwardTraverse);
    }
}

