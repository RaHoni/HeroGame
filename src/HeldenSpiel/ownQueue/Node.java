package HeldenSpiel.ownQueue;


class Node<ContentType> {
    private ContentType content;
    private Node<ContentType> nextNode;

    Node(ContentType inhalt) {
        content = inhalt;
    }

    ContentType getContent() {
        return content;
    }

    void setContent(ContentType content) {
        this.content = content;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node<ContentType> input) {
        nextNode = input;
    }
}
