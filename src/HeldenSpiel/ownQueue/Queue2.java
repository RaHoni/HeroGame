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
        head.setContent(p);
    }

    public void dequeue() {
        head.setContent(head.getNextNode().getContent());
    }

    public Held front() {
        return head.getContent();
    }
}
