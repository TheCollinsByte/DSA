package com.thecollinsbyte.dsa.circular;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CircularSinglyLinkedListTest {

    CircularSinglyLinkedList<Integer> integerList;
    CircularSinglyLinkedList<String> stringList;

    @BeforeEach
    public void setUp() {
        integerList = new CircularSinglyLinkedList<>();
        stringList = new CircularSinglyLinkedList<>();
    }

    @Test
    public void testSize() {
        integerList.insertAtBeginning(10);
        integerList.insertAtBeginning(20);
        integerList.insertAtBeginning(30);

        assertEquals(3, integerList.size());
    }

    @Test
    public void testInsertionAtEmptyList() {
        integerList.insertEmpty(10);

        assertEquals(10, integerList.traverse().get(0));
        assertEquals(1, integerList.size());
    }

    @Test
    public void testInsertionAtBeginning() {
        integerList.insertAtBeginning(10);
        integerList.insertAtBeginning(20);
        integerList.insertAtBeginning(30);

        List<Integer> result = integerList.traverse();

        assertEquals(List.of(30, 20, 10), result);
    }

    @Test
    public void testInsertionAtPosition() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(30);

        integerList.insertAtPosition(20, 2);

        List<Integer> result = integerList.traverse();

        assertEquals(3, result.size());
        assertEquals(List.of(10, 20, 30), result);
    }

    @Test
    public void testInsertionAtEnd() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);

        List<Integer> result = integerList.traverse();
        assertEquals(List.of(10, 20, 30), result);
    }

    @Test
    public void testDeleteFirstNode() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);

        integerList.deleteFirst();
        List<Integer> result = integerList.traverse();

        assertEquals(List.of(20, 30), result);
        assertEquals(2, result.size());
    }

    @Test
    public void testDeleteLastNode() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);

        integerList.deleteLast();
        List<Integer> result = integerList.traverse();

        assertEquals(List.of(10, 20), result);
        assertEquals(2, result.size());
    }

    @Test
    public void testDeleteAtPosition() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);

        integerList.deleteAtPosition(2);
        List<Integer> result = integerList.traverse();

        assertArrayEquals(new Integer[]{10, 30}, result.toArray());
        assertEquals(2, result.size());
    }

    @Test
    public void testDataContains() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);

        assertEquals(true, integerList.contains(10));
        assertEquals(false, integerList.contains(50));
    }
}
