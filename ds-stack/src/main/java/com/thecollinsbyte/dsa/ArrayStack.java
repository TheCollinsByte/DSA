package com.thecollinsbyte.dsa;

public class ArrayStack<T> implements Stack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] items;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        items = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    @Override
    public void push(T item) {
        if (top == items.length - 1) {
            resize();
        }
        items[++top] = item;
    }

    @Override
    public T pop() {
        if(isEmpty()) throw new IllegalStateException("Stack is empty");

        T item = items[top];
        items[top--] = null;

        return item;
    }

    @Override
    public T peek() {
        if(isEmpty()) throw new IllegalStateException("Stack is empty");
        return items[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[items.length * 2];
        System.arraycopy(items, 0, newArray, 0, items.length);
        items = newArray;
    }
}
