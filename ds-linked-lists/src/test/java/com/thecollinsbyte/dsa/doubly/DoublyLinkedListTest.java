package com.thecollinsbyte.dsa.doubly;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.thecollinsbyte.dsa.doubly.DoublyLinkedList;
import static org.junit.jupiter.api.Assertions.*;


public class DoublyLinkedListTest {

    private DoublyLinkedList<String> strDoublyLinkedList;
    private DoublyLinkedList<Integer> intDoublyLinkedList;

    @BeforeEach
    private void setUp() {
        strDoublyLinkedList = new DoublyLinkedList<>();
        intDoublyLinkedList = new DoublyLinkedList<>();
    }

    @Test
    public void testInsertAtBeginning() {
        intDoublyLinkedList.insertAtBeginning(10);
        intDoublyLinkedList.insertAtBeginning(20);
        intDoublyLinkedList.insertAtBeginning(30);
        List<Integer> results = intDoublyLinkedList.traverse();

        assertEquals(30, results.get(0));
        assertEquals(20, results.get(1));
        assertEquals(10, results.get(2));
        assertEquals(List.of(30, 20, 10), results);
    }

    @Test
    public void testInsertAtPosition() {
        intDoublyLinkedList.insertAtEnd(10);
        intDoublyLinkedList.insertAtEnd(20);
        intDoublyLinkedList.insertAtPosition(5, 1);

        List<Integer> results = intDoublyLinkedList.traverse();

        assertEquals(List.of(10, 5, 20), results);
        assertEquals(3, results.size());
    }

    @Test
    public void testInsertAtEnd() {
        intDoublyLinkedList.insertAtEnd(10);
        intDoublyLinkedList.insertAtEnd(20);

        assertEquals(2, intDoublyLinkedList.size());
    }

    @Test
    public void testContains() {
        intDoublyLinkedList.insertAtEnd(10);
        intDoublyLinkedList.insertAtEnd(20);

        assertEquals(true, intDoublyLinkedList.contains(10));
        assertEquals(true, intDoublyLinkedList.contains(20));
        assertEquals(false, intDoublyLinkedList.contains(30));
    }

    @Test
    public void testTreverse() {
        intDoublyLinkedList.insertAtEnd(10);
        intDoublyLinkedList.insertAtEnd(20);
        intDoublyLinkedList.insertAtEnd(30);
        List<Integer> result = intDoublyLinkedList.traverse();

        assertEquals(10, result.get(0));
        assertEquals(20, result.get(1));
        assertEquals(30, result.get(2));
        assertEquals(List.of(10, 20, 30), result);
    }
}
