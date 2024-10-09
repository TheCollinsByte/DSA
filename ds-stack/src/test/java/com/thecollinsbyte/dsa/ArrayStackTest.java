package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayStackTest {
    private Stack<Integer> stack;

    @BeforeEach
    public void setup() {
        stack = new ArrayStack<>();
    }

    @Test
    public void testPushAndPop() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
        assertEquals(20, stack.peek()); // Peek doesn't remove the element
        assertEquals(2, stack.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());

        stack.push(10);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testSize() {
        assertEquals(0, stack.size());

        stack.push(1);
        assertEquals(1, stack.size());

        stack.push(2);
        assertEquals(2, stack.size());

        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    void testPopEmptyStack() {
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void testPeekEmptyStack() {
        assertThrows(IllegalStateException.class, stack::peek);
    }
}
