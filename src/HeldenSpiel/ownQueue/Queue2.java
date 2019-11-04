package HeldenSpiel.ownQueue;

public class Queue2 {
    private Node head;
    private Node tail;

    public Queue2() {
        head = new Node(null);
    }

    public boolean isEmpty() {
        return head.getContent() == null;
    }

    public void enqueue(Held p) {
        Node newNode = new Node(p);
        tail.setNextNode(newNode);
        tail = newNode;
    }

    public void dequeue() {
        head = (head.getNextNode());
    }

    public Held front() {
        return head.getContent();
    }
}
