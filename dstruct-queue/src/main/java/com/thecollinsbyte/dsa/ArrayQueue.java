package com.thecollinsbyte.dsa;

public class ArrayQueue<T> implements Queue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] queue;
    private int front;
    private int rear;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        queue = (T[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(T item) {
        if(isFull()) {
            resize();
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }

    @Override
    public T dequeue() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        T item = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    @Override
    public T peek() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        return queue[front];
    }

    @Override
    public T rear() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        return queue[rear];
    }

    @Override
    public boolean isFull() {
        return size == queue.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = queue.length * 2;
        T[] newQueue = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % queue.length];
        }
        queue = newQueue;
        front = 0;
        rear = size - 1;
    }
}
