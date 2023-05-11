package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HashTableFromOpenAdressingTest {
    @Test
    public void testPutAndGet() {
        HashTableFromOpenAdressing table = new HashTableFromOpenAdressing();
        table.put("foo", "bar");
        table.put("baz", 42);
        assertEquals("bar", table.get("foo"));
        assertEquals(42, table.get("baz"));
    }
    @Test
    public void testPutOverwrite() {
        HashTableFromOpenAdressing table = new HashTableFromOpenAdressing();
        table.put("foo", "bar");
        table.put("foo", "baz");
        assertEquals("baz", table.get("foo"));
    }
    @Test
    public void testGetNonExistent() {
        HashTableFromOpenAdressing table = new HashTableFromOpenAdressing();
        assertNull(table.get("foo"));
    }
}
