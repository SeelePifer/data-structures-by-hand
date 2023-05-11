package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeWithNodesTest {
    @Test
    public void testAdd() {
        BinaryTreeWithNodes tree = new BinaryTreeWithNodes();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        assertTrue(tree.search(5));
        assertTrue(tree.search(3));
        assertTrue(tree.search(7));
        assertTrue(tree.search(2));
        assertTrue(tree.search(4));
        assertTrue(tree.search(6));
        assertTrue(tree.search(8));
    }

    @Test
    public void testSearch() {
        BinaryTreeWithNodes tree = new BinaryTreeWithNodes();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        assertTrue(tree.search(5));
        assertTrue(tree.search(3));
        assertTrue(tree.search(7));
        assertTrue(tree.search(2));
        assertTrue(tree.search(4));
        assertTrue(tree.search(6));
        assertTrue(tree.search(8));
        assertFalse(tree.search(1));
        assertFalse(tree.search(9));
    }

    @Test
    public void testPrintInOrder() {
        BinaryTreeWithNodes tree = new BinaryTreeWithNodes();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        assertEquals("2 3 4 5 6 7 8 ", getOutput(() -> tree.printInOrder()));
    }

    @Test
    public void testPrintPreOrder() {
        BinaryTreeWithNodes tree = new BinaryTreeWithNodes();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        assertEquals("5 3 2 4 7 6 8 ", getOutput(() -> tree.printPreOrder()));
    }

    @Test
    public void testPrintPostOrder() {
        BinaryTreeWithNodes tree = new BinaryTreeWithNodes();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        assertEquals("2 4 3 6 8 7 5 ", getOutput(() -> tree.printPostOrder()));
    }

    // Helper method to capture console output
    private String getOutput(Runnable action) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        action.run();
        System.setOut(originalOut);
        return outContent.toString();
    }
}
