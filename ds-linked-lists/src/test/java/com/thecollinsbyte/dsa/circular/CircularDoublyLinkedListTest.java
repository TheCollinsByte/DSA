package com.thecollinsbyte.dsa.circular;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircularDoublyLinkedListTest {

    CircularDoublyLinkedList<Integer> integerList;
    CircularDoublyLinkedList<String> stringList;

    @BeforeEach
    public void setUp() {
        integerList = new CircularDoublyLinkedList<>();
        stringList = new CircularDoublyLinkedList<>();
    }

    @Test
    public void testSize() {
        integerList.insertAtEmpty(10);
        assertEquals(1, integerList.size());
    }

    @Test
    public void testInsertionAtEmptyListWithException() {
        integerList.insertAtEmpty(10);
        assertEquals(1, integerList.size());

        Exception exception = assertThrows(IllegalStateException.class, () -> integerList.insertAtEmpty(20));
        assertEquals("List is not empty", exception.getMessage());
    }

    @Test
    public void testInsertionAtBeginning() {
        integerList.insertAtBeginning(30);
        integerList.insertAtBeginning(20);
        integerList.insertAtBeginning(10);
        List<Integer> result = integerList.traverse();

        assertEquals(3, integerList.size());
        assertEquals(List.of(10, 20, 30), result);
    }

    @Test
    public void testTraversal() {
        integerList.insertAtBeginning(30);
        integerList.insertAtBeginning(20);
        integerList.insertAtBeginning(10);
        List<Integer> result = integerList.traverse();

        assertEquals(List.of(10, 20, 30), result);
        assertEquals(3, result.size());
    }

    @Test
    public void testTraversalOnEmptyList() {
        Exception exception = assertThrows(IllegalStateException.class, () -> integerList.traverse());
        assertEquals("List is empty", exception.getMessage());
    }

    @Test
    public void testInsertionAtEnd() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        List<Integer> result = integerList.traverse();

        assertEquals(List.of(10, 20, 30), result);
        assertEquals(3, result.size());
    }

    @Test
    public void testInsertionAtPosition() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtPosition(40, 2);
        List<Integer> result = integerList.traverse();

        assertEquals(List.of(10, 40, 20, 30), result);
        assertEquals(4, result.size());
    }
}
