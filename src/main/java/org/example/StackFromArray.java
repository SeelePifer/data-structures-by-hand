package org.example;

import java.util.ArrayList;

public final class StackFromArray<T>{
    private final ArrayList<T> elements = new ArrayList<>();

    public void push(T value){
        elements.add(value);
    } //O(1)
    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return elements.remove(elements.size() -1);
    } //O(1)
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    } //O(1)

    public boolean isEmpty() {
        return elements.isEmpty();
    }

}
