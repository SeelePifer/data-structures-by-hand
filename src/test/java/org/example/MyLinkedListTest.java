package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class MyLinkedListTest {
    @Test
    public void test() {
        MyLinkedList list = new MyLinkedList();

        // Test append
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));

        // Test insert
        list.insert(1, 5);
        assertEquals(4, list.size());
        assertEquals(1, list.get(0));
        assertEquals(5, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(3, list.get(3));

        // Test remove
        list.remove(2);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(5, list.get(1));
        assertEquals(3, list.get(2));
    }

}
