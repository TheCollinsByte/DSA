package com.thecollinsbyte.dsa.header;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class DoublyHeaderLinkedListTest {

    DoublyHeaderLinkedList<Integer> integerList;

    @BeforeEach
    public void setUp() {
        integerList = new DoublyHeaderLinkedList<>();
    }

    @Test
    public void testInsertAtBeginning() {
        integerList.insertAtBeginning(10);
        integerList.insertAtBeginning(20);
        integerList.insertAtBeginning(30);
        integerList.insertAtBeginning(40);
        integerList.insertAtBeginning(50);

        assertEquals(5, integerList.size());
    }

    @Test
    public void testInsertAtEnd() {
        integerList.insertAtEnd(10);
        integerList.insertAtEnd(20);
        integerList.insertAtEnd(30);
        integerList.insertAtEnd(40);
        integerList.insertAtEnd(50);

        assertEquals(5, integerList.size());
    }
}
