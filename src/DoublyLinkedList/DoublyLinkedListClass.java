package DoublyLinkedList;

public class DoublyLinkedListClass {
    Node head;      //head node

    //Node class
    static class Node{
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
        newNode.previous = null;
        if(head!=null){
            head.previous=newNode;
        }
        head = newNode;
    }

    public static void main(String[] args) {
        DoublyLinkedListClass dll = new DoublyLinkedListClass();
        dll.head = new Node(22);
        Node second = new Node(33);
        Node third = new Node(44);
        Node fourth = new Node(66);
        Node fourth = new Node(66);
        dll.head.next = second;
        second.next = third;
        third.next = fourth;
        System.out.println("\ndoubly linked list after insertion at node is:");
        dll.insertAtFirst(11);
    }

}
