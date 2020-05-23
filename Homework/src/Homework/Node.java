package Homework;

public class Node {
    private Node leftChild;
    private Node rightChild;

    private String nodeName;

    public Node(String name) {
        this.nodeName = name;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public String getNodeName() {
        return nodeName;
    }

    public String getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(" node name: " + nodeName);
        builder.append(" leftNode: " + leftChild.getNodeName());
        builder.append(" right Node: " + rightChild.getNodeName());
        return builder.toString();
    }
}