package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueFromListTest {

    @Test
    public void testEnqueue() {
        QueueFromList<Integer> queue = new QueueFromList<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(3, queue.size());
    }

    @Test
    public void testDequeue() {
        QueueFromList<String> queue = new QueueFromList<>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        String item = queue.dequeue();
        assertEquals("a", item);
        assertEquals(2, queue.size());
    }

    @Test
    public void testPeek() {
        QueueFromList<Double> queue = new QueueFromList<>();
        queue.enqueue(3.14);
        queue.enqueue(2.71);
        Double item = queue.peek();
        assertEquals(Double.valueOf(3.14), item);
        assertEquals(2, queue.size());
    }

    @Test
    public void testIsEmpty() {
        QueueFromList<String> queue = new QueueFromList<>();
        assertTrue(queue.isEmpty());
        queue.enqueue("hello");
        assertFalse(queue.isEmpty());
    }
}
