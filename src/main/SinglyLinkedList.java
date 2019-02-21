package main;

public class SinglyLinkedList {


    private Node head=null;
    private int size=0;


    //method to insert a new node at the head
public void insert(int value){
head=new Node(value,head);
size++;
}
//method to insert a mew node after a node
    public void insert(int value,Node node)
    {
        node.next=new Node(value,node.next);
        size++;
    }


public String toString(){
    StringBuilder result=new StringBuilder();
Node temp=head;
while(temp!=null)
{
    result.append(temp.data);
    if(temp.next!=null){
        result.append("==>");
    }
    temp=temp.next;
}
    return result.toString();
}


    public static void main(String[] args) {
        SinglyLinkedList linkedList;
        linkedList = new SinglyLinkedList();
        for (int i = 0; i < 5; i++) {
            linkedList.insert(i+1);
        }

        System.out.println(linkedList);


    }

private static class Node{
private int data;
private Node next;

    public Node(int data) {
        this.data = data;
    this.next=null;
    }



    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}

}
