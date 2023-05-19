package org.example;

import java.util.ArrayList;

public final class HashTableFromArray {
    private final int SIZE = 10;
    private ArrayList<ArrayList<Entry>> table;

    public HashTableFromArray(){
        table = new ArrayList<>(SIZE);
        for(int i = 0; i < SIZE; i++) {
          table.add(new ArrayList<Entry>());
        }
    }
    public void put(Object key, Object value){ //O(n)
        int index = key.hashCode() % SIZE;
        ArrayList<Entry> entries = table.get(index);
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        entries.add(new Entry(key, value));
    }
    public Object get(Object key){ //O(n)
        int index = key.hashCode() % SIZE;
        ArrayList<Entry> entries = table.get(index);
        for (Entry entry: entries){
            if(entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }


    public static class Entry {
        Object key;
        Object value;

        Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
