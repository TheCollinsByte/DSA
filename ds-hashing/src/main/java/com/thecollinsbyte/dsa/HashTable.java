package com.thecollinsbyte.dsa;

import java.lang.Math;
import java.util.LinkedList;
import java.util.Optional;

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

    public void put(K key, V value) {
        int index = hash(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value));
        size++;
    }

    public Optional<V> get(K key) {
        int index = hash(key);
        for (Entry<K,V> entry : buckets[index]) {
            if(entry.key.equals(key)) {
                return Optional.of(entry.value);
            }
        }
        return Optional.empty();
    }

    public V remove(K key) {
        return null;
    }

    public int size() {
        return size;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
