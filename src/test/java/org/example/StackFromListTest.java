package org.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackFromListTest {
    @Test
    public void testPushPop() {
        StackFromList<Integer> stack = new StackFromList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(Optional.of(3), Optional.ofNullable(stack.pop()));
        assertEquals(Optional.of(2), Optional.ofNullable(stack.pop()));
        assertEquals(Optional.of(1), Optional.ofNullable(stack.pop()));
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        StackFromList<String> stack = new StackFromList<>();
        stack.push("foo");
        stack.push("bar");
        assertEquals("bar", stack.peek());
        assertEquals("bar", stack.pop());
        assertEquals("foo", stack.peek());
    }

    @Test
    public void testEmptyStackException() {
        StackFromList<Object> stack = new StackFromList<>();
        assertThrows(RuntimeException.class, () -> {
            stack.pop();
        });
        assertThrows(RuntimeException.class, () -> {
            stack.peek();
        });
    }
}
