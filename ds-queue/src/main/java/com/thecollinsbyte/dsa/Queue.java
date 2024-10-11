package com.thecollinsbyte.dsa;

public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T peek();
    T rear();
    boolean isFull();
    boolean isEmpty();
}
