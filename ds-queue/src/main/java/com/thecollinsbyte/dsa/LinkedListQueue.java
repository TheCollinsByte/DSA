package com.thecollinsbyte.dsa;

public class LinkedListQueue<T> implements Queue<T> {

    private static class Node<T> {
        Node<T> next;
        T data;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if(isEmpty()) {
            front = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    @Override
    public T dequeue() {
        size--;
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T rear() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
