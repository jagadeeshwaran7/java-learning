package com.javalearnings.collections.lists.linkedlist;

public class Node {
    private Integer data;
    private Node nextNode;
    public Node(Integer data) {
        this.data = data;
        this.nextNode = null;
    }

    public Integer getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
