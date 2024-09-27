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
        assertEquals(1, intList.size());
        assertEquals(10, intList.get(0));
    }

    @Test
    public void testInsertAtEnd() {
        intList.insertAtEnd(10);
        assertEquals(1, intList.size());
        assertEquals(10, intList.get(0));
    }

    @Test
    public void testInsertAtPosition() {
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
}
