package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinHeapTest {
    @Test
    public void testAddAndRemoveMin() {
        MinHeap heap = new MinHeap();
        heap.add(3);
        heap.add(1);
        heap.add(4);
        heap.add(2);

        assertEquals(1, heap.removeMin());
        assertEquals(2, heap.removeMin());
        assertEquals(3, heap.removeMin());
        assertEquals(4, heap.removeMin());
    }
    @Test
    public void testGetMin() {
        MinHeap heap = new MinHeap();
        heap.add(3);
        heap.add(1);
        heap.add(4);
        heap.add(2);

        assertEquals(1, heap.getMin());
    }

    @Test
    public void testSizeAndIsEmpty() {
        MinHeap heap = new MinHeap();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());

        heap.add(3);
        assertFalse(heap.isEmpty());
        assertEquals(1, heap.size());

        heap.removeMin();
        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
    }

    @Test
    public void testEmptyHeap() {
        MinHeap heap = new MinHeap();

        assertThrows(IllegalStateException.class, () -> heap.getMin());
        assertThrows(IllegalStateException.class, () -> heap.removeMin());
    }
}
