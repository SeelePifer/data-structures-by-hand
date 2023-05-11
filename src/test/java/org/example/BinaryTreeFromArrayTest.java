package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeFromArrayTest {
    @Test
    public void testAdd() {
        BinaryTreeFromArray bt = new BinaryTreeFromArray();
        bt.add(5);
        bt.add(3);
        bt.add(7);
        bt.add(2);
        bt.add(4);
        bt.add(6);
        bt.add(8);

        // Check that the tree has the correct number of nodes
        assertEquals(7, bt.size());
    }

    @Test
    public void testSearch() {
        BinaryTreeFromArray bt = new BinaryTreeFromArray();
        bt.add(5);
        bt.add(3);
        bt.add(7);
        bt.add(2);
        bt.add(4);
        bt.add(6);
        bt.add(8);

        // Check that search returns true for values in the tree
        assertTrue(bt.search(3));
        assertTrue(bt.search(8));

        // Check that search returns false for values not in the tree
        assertFalse(bt.search(1));
        assertFalse(bt.search(9));
    }

    @Test
    public void testPrintTree() {
        BinaryTreeFromArray bt = new BinaryTreeFromArray();
        bt.add(5);
        bt.add(3);
        bt.add(7);
        bt.add(2);
        bt.add(4);
        bt.add(6);
        bt.add(8);

        // Check that the printed tree matches the expected output
        String expectedOutput = "5 3 7 2 4 6 8 ";
        assertEquals(expectedOutput, getOutput(bt));
    }

    private String getOutput(BinaryTreeFromArray bt) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);

        bt.printTree();

        System.out.flush();
        System.setOut(old);
        return baos.toString();
    }
}
