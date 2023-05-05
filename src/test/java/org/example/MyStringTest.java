package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;

public class MyStringTest {
    @Test
    public void testConcat(){
        MyString str1 = new MyString("Hello");
        MyString str2 = new MyString("World!");
        MyString result = str1.concat(str2);

        assertEquals(result.toString(), "HelloWorld!");
    }
    @Test
    public void testCompareTo() {
        MyString string1 = new MyString("Hello");
        MyString string2 = new MyString("Hello");
        MyString string3 = new MyString("World");
        MyString string4 = new MyString("Hella");

        assertEquals(string1.compareTo(string2), 0); // same
        assertTrue(string1.compareTo(string3) < 0);  // lower than
        assertTrue(string3.compareTo(string1) > 0);  // higher than
        assertFalse(string1.compareTo(string4) < 0);  // same quantity
    }
    @Test
    public void testSplitAndIndexOf() {
        MyString string1 = new MyString("HelloWorld");
        MyString[] chunks = string1.split(3);

        assertEquals(chunks.length, 4);
        assertEquals(chunks[0].toString(), "Hel");
        assertEquals(chunks[1].toString(), "loW");
        assertEquals(chunks[2].toString(), "orl");
        assertEquals(chunks[3].toString(), "d");


        MyString target1 = new MyString("World");
        MyString target2 = new MyString("Java");
        assertEquals(string1.indexOf(target1), 5);
        assertEquals(string1.indexOf(target2), -1);
    }
}
