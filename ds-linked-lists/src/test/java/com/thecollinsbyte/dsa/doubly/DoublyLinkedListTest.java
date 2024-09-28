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
