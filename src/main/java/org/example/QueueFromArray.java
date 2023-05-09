package org.example;

import java.util.ArrayList;

public final class QueueFromArray <T>{

    private ArrayList<T> items;

    public QueueFromArray(){
        items = new ArrayList<>();
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(T item) {
        items.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return items.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return items.get(0);
    }

    public int size() {
        return items.size();
    }
}
