package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueFromArrayTest {

    @Test
    public void testEnqueue() {
        QueueFromArray<Integer> queue = new QueueFromArray<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(3, queue.size());
    }

    @Test
    public void testDequeue() {
        QueueFromArray<String> queue = new QueueFromArray<>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        String item = queue.dequeue();
        assertEquals("a", item);
        assertEquals(2, queue.size());
    }

    @Test
    public void testPeek() {
        QueueFromArray<Double> queue = new QueueFromArray<>();
        queue.enqueue(3.14);
        queue.enqueue(2.71);
        Double item = queue.peek();
        assertEquals(Double.valueOf(3.14), item);
        assertEquals(2, queue.size());
    }

    @Test
    public void testIsEmpty() {
        QueueFromArray<String> queue = new QueueFromArray<>();
        assertTrue(queue.isEmpty());
        queue.enqueue("hello");
        assertFalse(queue.isEmpty());
    }
}
