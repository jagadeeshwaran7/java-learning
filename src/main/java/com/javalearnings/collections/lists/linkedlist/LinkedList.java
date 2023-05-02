package com.javalearnings.collections.lists.linkedlist;

public class LinkedList {
    private Node head;
    private Integer counter = 0;


    public LinkedList() {

    }

    public Node getHead() {
        return head;
    }

    public void addFirst(Integer data) {
        if (this.head == null) {
            this.head = new Node(data);
            counter++;
        } else {
            Node temp = new Node(data);
            temp.setNextNode(this.head);
            this.head = temp;
            counter++;
        }
    }

    public void removeFirst() {
        if (this.head != null) {
            this.head = this.head.getNextNode();
            counter--;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        linkedList.addFirst(1);
        linkedList.addFirst(0);
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();


        Node linkedNode = linkedList.getHead();
        while (linkedNode != null) {
            System.out.println(linkedNode.getData());
            linkedNode = linkedNode.getNextNode();
        }
        }
}
