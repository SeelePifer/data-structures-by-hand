package org.example;

import java.util.ArrayList;

public class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap(){
        heap = new ArrayList<>();
    }

    public void add(int value){
        heap.add(value);

        int index = heap.size() - 1;
        int parentIndex = ( index - 1 ) / 2;

        while( index > 0 && heap.get(parentIndex) > heap.get(index) ){
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = ( index - 1 ) / 2;
        }
    }
    public int removeMin() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int index = 0;
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;

            if (leftChildIndex >= heap.size()) {
                break;
            }

            int smallerChildIndex = leftChildIndex;
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(leftChildIndex)) {
                smallerChildIndex = rightChildIndex;
            }

            if (heap.get(index) > heap.get(smallerChildIndex)) {
                swap(index, smallerChildIndex);
                index = smallerChildIndex;
            } else {
                break;
            }
        }

        return min;
    }

    // Helper method to swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Return the minimum value in the heap without removing it
    public int getMin() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        return heap.get(0);
    }

    // Return the size of the heap
    public int size() {
        return heap.size();
    }

    // Return true if the heap is empty, false otherwise
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
