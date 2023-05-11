package org.example;

import java.util.ArrayList;

public class BinaryTreeFromArray {
    private ArrayList<Integer> tree;


    public BinaryTreeFromArray(){
        tree = new ArrayList<Integer>();
    }
    public void add(int value) {
        tree.add(value);
    }

    public boolean search(int value) {
        return tree.contains(value);
    }

    public void printTree() {
        for (int i = 0; i < tree.size(); i++) {
            System.out.print(tree.get(i) + " ");
        }
    }
    public int size(){
        return tree.size();
    }
}
