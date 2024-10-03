package com.thecollinsbyte.dsa.header;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

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
        integerList.insterAtBeginning(40);
        integerList.insterAtBeginning(30);
        integerList.insterAtBeginning(20);
        integerList.insterAtBeginning(10);

        List<Integer> result = integerList.traverseForward();

        assertEquals(List.of(10, 20, 30, 40), result);
        assertEquals(4, integerList.size());
    }
}

