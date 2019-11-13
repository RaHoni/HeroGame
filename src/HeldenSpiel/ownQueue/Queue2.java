package HeldenSpiel.ownQueue;


public class Queue2<ContentType> {
    private Node<ContentType> head;
    private Node<ContentType> tail;

    public Queue2() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head.getContent() == null;
    }

    public void enqueue(ContentType p) {
        Node<ContentType> newNode = new Node<>(p);
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

    public ContentType front() {
        return head.getContent();
    }
}