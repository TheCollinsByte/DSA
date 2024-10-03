package com.thecollinsbyte.dsa.header;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class SinglyCircularHeaderLinkedListTest {

    private SinglyCircularHeaderLinkedList<Integer> integerList;

    @BeforeEach
    public void setUp() {
        integerList = new SinglyCircularHeaderLinkedList<>();
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
}
