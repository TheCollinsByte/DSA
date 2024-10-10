package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class QueueTest {

    @Test
    public void testEnqueueDequeue() {
        testEnqueueDequeue(new ArrayQueue<>());
    }


    private void testEnqueueDequeue(Queue<Integer> queue) {
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
}
