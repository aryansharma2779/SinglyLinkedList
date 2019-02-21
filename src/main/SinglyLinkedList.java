package main;

public class SinglyLinkedList {

private static class Node{
private int data;
private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(Node next) {
        this.next = next;
    }
}

}
