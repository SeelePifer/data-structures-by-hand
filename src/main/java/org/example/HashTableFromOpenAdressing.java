package org.example;

public final class HashTableFromOpenAdressing {
    private final int SIZE = 10;
    private Object[] table;

    public HashTableFromOpenAdressing(){
        table = new Object[SIZE];
    }
    public void put(Object key, Object value) {
        int index = key.hashCode() % SIZE;
        int i = 1;
        while (table[index] != null) {
            if (table[index] instanceof HashTableFromArray.Entry && ((HashTableFromArray.Entry) table[index]).key.equals(key)) {
                ((HashTableFromArray.Entry) table[index]).value = value;
                return;
            }
            index = (index + i * i) % SIZE;
            i++;
        }
        table[index] = new HashTableFromArray.Entry(key, value);
    }
    public Object get(Object key) {
        int index = key.hashCode() % SIZE;
        int i = 1;
        while (table[index] != null) {
            if (table[index] instanceof HashTableFromArray.Entry && ((HashTableFromArray.Entry) table[index]).key.equals(key)) {
                return ((HashTableFromArray.Entry) table[index]).value;
            }
            index = (index + i * i) % SIZE;
            i++;
        }
        return null;
    }
}
