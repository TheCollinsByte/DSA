package com.thecollinsbyte.dsa.header;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinglyHeaderLinkedListTest {

    SinglyHeaderLinkedList<Integer> integerList;

    @BeforeEach
    public void setUp() {
        integerList = new SinglyHeaderLinkedList<>();
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
    public void testInsertAtPosition() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);
        integerList.insertAtPosition(30, 3);

        List<Integer> results = integerList.traverseForward();
        assertEquals(5, integerList.size());
        assertEquals(List.of(10, 20, 30, 40, 50), results);
    }

    @Test
    public void testTraversalBothDirections() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);

        List<Integer> results = integerList.traverseBackward();
        assertEquals(List.of(50, 40, 30, 20, 10), results);
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
}
