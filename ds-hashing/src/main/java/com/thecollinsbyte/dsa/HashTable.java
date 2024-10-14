package com.thecollinsbyte.dsa;

import java.util.LinkedList;
import java.util.Map.Entry;

public class HashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;
    private int size;


    @SuppressWarnings("unchecked")
    public HashTable() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

}
