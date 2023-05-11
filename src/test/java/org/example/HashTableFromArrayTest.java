package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HashTableFromArrayTest {
    @Test
    public void testPutAndGet() {
        HashTableFromArray table = new HashTableFromArray();
        table.put("foo", "bar");
        table.put("baz", 42);
        assertEquals("bar", table.get("foo"));
        assertEquals(42, table.get("baz"));
    }
    @Test
    public void testPutOverwrite() {
        HashTableFromArray table = new HashTableFromArray();
        table.put("foo", "bar");
        table.put("foo", "baz");
        assertEquals("baz", table.get("foo"));
    }
    @Test
    public void testGetNonExistent() {
        HashTableFromArray table = new HashTableFromArray();
        assertNull(table.get("foo"));
    }

}
