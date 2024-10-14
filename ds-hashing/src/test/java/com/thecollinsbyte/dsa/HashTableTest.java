package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashTableTest {

    private HashTable<String, Integer> hashTable;

    @BeforeEach
    public void setUp() {
        hashTable = new HashTable<>();
    }


    @Test
    public void testPutAndGet() {
        hashTable.put("One", 1);
        hashTable.put("Two", 2);
        hashTable.put("Three", 3);

        assertEquals(Optional.of(1), hashTable.get("One"));
        assertEquals(Optional.of(2), hashTable.get("Two"));
        assertEquals(Optional.of(3), hashTable.get("Three"));
        assertEquals(Optional.empty(), hashTable.get("Four"));
    }

    @Test
    public void testPutOverwrite() {
    }

    @Test
    public void testRemove() {
    }

    @Test
    public void testSize() {
    }

    @Test
    public void testCollisionHandling() {
    }
}
