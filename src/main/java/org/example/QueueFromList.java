package org.example;

import java.util.LinkedList;

public final class QueueFromList <T>{

    private LinkedList<T> items;
    public QueueFromList() {
        items = new LinkedList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(T item) {
        items.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return items.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return items.getFirst();
    }

    public int size() {
        return items.size();
    }
}
