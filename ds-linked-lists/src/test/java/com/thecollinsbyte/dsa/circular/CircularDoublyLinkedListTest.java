package com.thecollinsbyte.dsa.circular;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void testLength() {
    }
}
