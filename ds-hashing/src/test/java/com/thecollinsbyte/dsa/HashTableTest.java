package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashTableTest {
    private HashTable<TestKey, Integer> hashTable;

    @BeforeEach
    void setUp() {
        hashTable = new HashTable<>();
    }

    @Test
    void testPutAndGet() {
        TestKey key1 = new TestKey("one", 1);
        TestKey key2 = new TestKey("two", 2);
        TestKey key3 = new TestKey("three", 3);

        hashTable.put(key1, 1);
        hashTable.put(key2, 2);
        hashTable.put(key3, 3);

        assertEquals(Optional.of(1), hashTable.get(key1));
        assertEquals(Optional.of(2), hashTable.get(key2));
        assertEquals(Optional.of(3), hashTable.get(key3));
        assertEquals(Optional.empty(), hashTable.get(new TestKey("four", 4)));
    }

    @Test
    void testPutOverwrite() {
        TestKey key = new TestKey("key", 1);
        hashTable.put(key, 1);
        assertEquals(Optional.of(1), hashTable.get(key));

        hashTable.put(key, 2);
        assertEquals(Optional.of(2), hashTable.get(key));
    }

    @Test
    void testRemove() {
        TestKey key = new TestKey("key", 1);
        hashTable.put(key, 1);
        assertEquals(Optional.of(1), hashTable.get(key));

        hashTable.remove(key);
        assertEquals(Optional.empty(), hashTable.get(key));
    }

    @Test
    void testSize() {
        assertEquals(0, hashTable.size());

        hashTable.put(new TestKey("one", 1), 1);
        assertEquals(1, hashTable.size());

        hashTable.put(new TestKey("two", 2), 2);
        assertEquals(2, hashTable.size());

        hashTable.remove(new TestKey("one", 1));
        assertEquals(1, hashTable.size());
    }

    @Test
    void testCollisionHandling() {
        TestKey key1 = new TestKey("First", 1);
        TestKey key2 = new TestKey("Second", 1);  // Same hash as key1
        TestKey key3 = new TestKey("Third", 2);   // Different hash

        hashTable.put(key1, 1);
        hashTable.put(key2, 2);
        hashTable.put(key3, 3);

        assertEquals(Optional.of(1), hashTable.get(key1));
        assertEquals(Optional.of(2), hashTable.get(key2));
        assertEquals(Optional.of(3), hashTable.get(key3));

        assertEquals(3, hashTable.size());
    }

    // Custom key class for testing collisions
    private static class TestKey {
        private final String value;
        private final int hash;

        TestKey(String value, int hash) {
            this.value = value;
            this.hash = hash;
        }

        @Override
        public int hashCode() {
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            TestKey testKey = (TestKey) obj;
            return value.equals(testKey.value);
        }
    }
}
