package DoublyLinkedList;

public class DoublyLinkedListClass {
    Node head;      //head node

    //Node class
    class Node{
        int data;
        Node previous;
        Node next;

        //constructor
        public Node(int d){
            data = d;
            previous=null;
            next=null;
        }
    }
    //1. insert node at head in doubly linked list
    public  void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;

    }

    public static void main(String[] args) {

    }

}
