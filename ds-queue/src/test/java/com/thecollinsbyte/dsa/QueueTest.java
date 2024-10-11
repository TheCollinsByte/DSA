package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class QueueTest {

    @Test
    public void testEnqueueDequeue() {
        testEnqueueDequeueImpl(new ArrayQueue<>());
    }

    @Test
    public void testPeek() {
        testPeekImpl(new ArrayQueue<>());
    }

    @Test
    public void testRear() {
        testRearImpl(new ArrayQueue<>());
    }

    private void testEnqueueDequeueImpl(Queue<Integer> queue) {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());
        assertEquals(10, queue.dequeue());
        assertEquals(20, queue.dequeue());
        assertEquals(30, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    private void testPeekImpl(Queue<String> queue) {
        queue.enqueue("First");
        queue.enqueue("Second");

        assertEquals("First", queue.peek());
        assertEquals(2, queue.size());
    }

    private void testRearImpl(Queue<String> queue) {
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");

        assertEquals("Third", queue.rear());
        assertEquals(3, queue.size());
    }
}
