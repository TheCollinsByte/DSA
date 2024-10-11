package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    public void testIsEmpty() {
        testIsEmptyImpl(new ArrayQueue<>());
    }

    @Test
    public void testIsFull() {
        testIsFullImpl(new ArrayQueue<>());
    }

    @Test
    public void testSize() {
        testSizeImpl(new ArrayQueue<>());
    }

    @Test
    public void testExceptions() {
        testExceptionImpl(new ArrayQueue<>());
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

    private void testIsEmptyImpl(Queue<Double> queue) {
        assertTrue(queue.isEmpty());
        queue.enqueue(3.1415);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    private void testIsFullImpl(Queue<Integer> queue) {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        if(queue instanceof ArrayQueue) {
            assertTrue(queue.isFull());
            queue.enqueue(10);  // This will trigger a resize for ArrayQueue
            assertFalse(queue.isFull());
        } else {
            assertFalse(queue.isFull());    // LinkedList is never full
        }
    }

    private void testSizeImpl(Queue<Integer> queue) {
        assertEquals(0, queue.size());
        queue.enqueue(10);
        assertEquals(1, queue.size());
        queue.enqueue(20);
        assertEquals(2, queue.size());
        queue.dequeue();
        assertEquals(1, queue.size());
    }

    private void testExceptionImpl(Queue<String> queue) {
        assertThrows(IllegalStateException.class, queue::dequeue);
        assertThrows(IllegalStateException.class, queue::peek);
        assertThrows(IllegalStateException.class, queue::rear);
    }
}
