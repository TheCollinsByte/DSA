package com.thecollinsbyte.dsa.header;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoublyCircularHeaderLinkedListTest {

    private DoublyCircularHeaderLinkedList<Integer> integerList;

    @BeforeEach
    public void setUp() {
        integerList = new DoublyCircularHeaderLinkedList<>();
    }

    @Test
    public void insertAtBeginning() {
        integerList.insterAtBeginning(10);
        integerList.insterAtBeginning(20);
        integerList.insterAtBeginning(30);
        integerList.insterAtBeginning(40);

        assertEquals(4, integerList.size());
    }
}

