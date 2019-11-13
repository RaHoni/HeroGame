package HeldenSpiel.ownQueue;


import HeldenSpiel.Hero;

public class Queue2 {
    private Node head;
    private Node tail;

    public Queue2() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head.getContent() == null;
    }

    public void enqueue(Hero p) {
        Node newNode = new Node(p);
        if (head.getContent() == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode);
            tail = tail.getNextNode();
        }
    }

    public void dequeue() {
        if (head == tail) {
            tail = null;
            head = null;
        } else head = head.getNextNode();
    }

    public Hero front() {
        return head.getContent();
    }
}