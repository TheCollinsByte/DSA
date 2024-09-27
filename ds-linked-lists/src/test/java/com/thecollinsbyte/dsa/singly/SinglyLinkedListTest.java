package com.thecollinsbyte.dsa.singly;

import java.util.List;
import com.thecollinsbyte.dsa.singly.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> intList;
    private SinglyLinkedList<String> stringList;

    @BeforeEach
    public void setUp() {
        intList = new SinglyLinkedList<>();
        stringList = new SinglyLinkedList<>();
    }

    @Test
    public void testInsertAtBeginning() {
        intList.insertAtBeginning(10);
        intList.insertAtBeginning(20);
        intList.insertAtBeginning(30);

        List<Integer> result = intList.traverse();
        assertEquals(30, result.get(0));
        assertEquals(20, result.get(1));
        assertEquals(10, result.get(2));
        assertEquals(List.of(30, 20, 10), result);
    }

    @Test
    public void testInsertAtEnd() {
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);

        List<Integer> result = intList.traverse();
        assertEquals(10, result.get(0));
        assertEquals(20, result.get(1));
        assertEquals(30, result.get(2));
        assertEquals(List.of(10, 20, 30), result);
    }

    @Test
    public void testInsertAtPosition() {
        intList.insertAtEnd(10);
        intList.insertAtEnd(30);

        intList.insertAtPosition(20, 1);

        List<Integer> result = intList.traverse();
        assertEquals(List.of(10, 20, 30), result);

        intList.insertAtPosition(40, 0);
        result = intList.traverse();
        assertEquals(List.of(40, 10, 20, 30), result);

        intList.insertAtPosition(50, 4);
        result = intList.traverse();
        assertEquals(List.of(40, 10, 20, 30, 50), result);
    }

    @Test
    public void testInsertAtPositionOutOfBound() {
        intList.insertAtEnd(10);
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> intList.insertAtPosition(20, 2));
        assertEquals("Position out of bounds", exception.getMessage());
    }

    @Test
    public void testTraverseEmptyList() {
        List<Integer> result = intList.traverse();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testTraverseWithElements() {
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);

        List<Integer> result = intList.traverse();
        assertEquals(3, result.size());
        assertEquals(10, result.get(0));
        assertEquals(20, result.get(1));
        assertEquals(30, result.get(2));
        assertEquals(List.of(10, 20, 30), result);
    }

    @Test
    public void testDeleteFromEmptyList() {
        Exception exception = assertThrows(IllegalStateException.class, () -> intList.deletionAtBeginning());
        assertEquals("Cannot delete from an empty list", exception.getMessage());
    }

    @Test
    public void testDeleteFromBeginning() {
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);
        intList.deletionAtBeginning();

        List<Integer> result = intList.traverse();
        assertEquals(List.of(20, 30), result);
    }

    @Test
    public void testDeleteFromEnd() {
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);

        intList.deletionAtEnd();
        assertEquals(List.of(10, 20), intList.traverse());

        intList.deletionAtEnd();
        assertEquals(List.of(10), intList.traverse());
    }

    @Test
    public void testDeleteAtPosition() {
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);
        intList.insertAtEnd(40);

        intList.deletionAtPosition(2);
        assertEquals(List.of(10, 20, 40), intList.traverse());
    }

    @Test
    public void testContains() {
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);
        intList.insertAtEnd(40);

        assertEquals(true, intList.contains(20));
        assertEquals(false, intList.contains(50));
    }

    @Test
    public void testSize() {
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);
        intList.insertAtEnd(40);

        assertEquals(4, intList.size());
    }

    @Test
    public void testGet() {
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);
        intList.insertAtEnd(40);

        assertEquals(20, intList.get(1));
    }
}
