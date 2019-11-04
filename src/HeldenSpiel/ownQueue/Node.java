package HeldenSpiel.ownQueue;

public class Node {
    private Held content;
    private Node nextNode;

    public Node(Held inhalt) {
        content = inhalt;
    }

    public Held getContent() {
        return content;
    }

    public void setContent(Held content) {
        this.content = content;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node input) {
        nextNode = input;
    }
}
