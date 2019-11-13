package HeldenSpiel.ownQueue;

import HeldenSpiel.Hero;

public class Node {
    private Hero content;
    private Node nextNode;

    Node(Hero inhalt) {
        content = inhalt;
    }

    Hero getContent() {
        return content;
    }

    public void setContent(Hero content) {
        this.content = content;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node input) {
        nextNode = input;
    }
}
