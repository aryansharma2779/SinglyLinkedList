package main;

public class SinglyLinkedList {


    private Node head=null;
    private int size=0;


    //method to insert a new node at the head
    private void insertHead(int value){
        head=new Node(value,head);
        size++;
    }
    //method to insert a mew node after a node
   private void insertAfter(int value,Node node)
    {
        node.next=new Node(value,node.next);
        size++;
    }

    public void insert(int data) {

        if (head == null) {
            insertHead(data);
        }
        else
        {
        Node temp=this.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        insertAfter(data,temp);
        }

    }

    private int removedHead(){
        int response=-1;
        Node temp=this.head;
        if(head!=null)
        {
            size--;
            head=temp.next;
            response =temp.data;
        }

           return response;
    }

    private int removedAfter(Node node){
        int response=-1;
        Node temp=node.next;
        if(temp!=null){
            response=temp.data;
            node.next=temp.next;
            size--;
        }

        return response;
    }
    public int remove(int data){
        int response=-1;
        Node temp=this.head;
        if(temp.data==data){
            response=removedHead();
        }else
        {
            while(temp!=null){
                if(temp.data==data){
                    response=removedAfter(temp);
                    break;
                }
                temp=temp.next;
            }
        }

        return response;
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

        linkedList.remove(1);
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
