package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackFromArrayTest {

    @Test
    public void canCreateStack(){
        StackFromArray<Integer> stack = new StackFromArray<>();
        assertTrue(stack != null);
    }
    @Test
    public void testPushPop() {
        StackFromArray<Integer> stack = new StackFromArray<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        StackFromArray<String> stack = new StackFromArray<>();
        stack.push("foo");
        stack.push("bar");
        assertEquals("bar", stack.peek());
        assertEquals("bar", stack.pop());
        assertEquals("foo", stack.peek());
    }

    @Test
    public void testEmptyStackException() {
        StackFromArray<Object> stack = new StackFromArray<>();
        assertThrows(RuntimeException.class, () -> {
            stack.pop();
        });
        assertThrows(RuntimeException.class, () -> {
            stack.peek();
        });
    }
}
