package org.example;

class Node{
    Node next;
    int value;
    public Node(int value){
        this.value = value;
    }
    public void setNext(Node node){
        this.next = node;
    }
}
public final class MyLinkedList {

    Node head;
    int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    public int get(int index){
        //O(n)
        if(index< 0 || index>= size){
            return -1;
        }
        Node curr = head;
        for(int i = 0; i < index; i++) {
          curr = curr.next;
        }
        return curr.value;
    }
    public void insert(int index, int val){
        //O(n)
        if(index < 0 || index > size){
            return;
        }
        Node newNode = new Node(val);
        if( index == 0){
            newNode.next = head;
            head = newNode;
        }else{
            Node prev = head;
            for(int i = 0; i < index -1 ; i++) {
              prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public void append(int val ){
        //o(n)
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }
    public void remove(int index) {
        //O(n)
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
        size--;
    }

    public int size() {
        return size;
    }

}
