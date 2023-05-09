package org.example;


public final class StackFromList<T> {

    private NodeForStack<T> top;

    public void push(T value) {
        NodeForStack<T> newNode = new NodeForStack(value);
        newNode.next = top;
        top = newNode;
    }
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T value = top.value;
        top = top.next;
        return value;
    }
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    private static class NodeForStack<T> {
        private final T value;
        private NodeForStack next;

        public NodeForStack(T value) {
            this.value = value;
        }
}
}
