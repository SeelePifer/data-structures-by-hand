package org.example;

import java.util.LinkedList;

public class HashTableFromChaining {
    private final int SIZE = 10;
    private LinkedList<HashTableFromArray.Entry>[] table;

    public HashTableFromChaining(){
        table = new LinkedList[SIZE];
    }

    public void put(Object key, Object value) {
        int index = key.hashCode() % SIZE;
        if (table[index] == null) {
            table[index] = new LinkedList<HashTableFromArray.Entry>();
        }
        for (HashTableFromArray.Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new HashTableFromArray.Entry(key, value));
    }
    public Object get(Object key) {
        int index = key.hashCode() % SIZE;
        if (table[index] == null) {
            return null;
        }
        for (HashTableFromArray.Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }
}
