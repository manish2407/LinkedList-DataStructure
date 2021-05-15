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
    //1. printlist function to print the linked list in both direction
    public void printlist(){
        Node node = head;
        Node last = null;
        System.out.println("Linked list traversal in forward direction");
        while (node!=null){
            System.out.print(node.data+"-->");
            node = node.next;
        }/*
        node = node.previous;
        System.out.println();
        System.out.println("linked list traversal in reverse order");
        while (node!=head){
            System.out.println(node.data+"-->");
            node = node.previous;
        }*/
    }
    //2. insert node at head in doubly linked list
    public  void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.previous = null;
        if(head!=null){
            head.previous=newNode;
        }
        head = newNode;
    }
    //2. insert a node after a given node
    public void insertAtgivenNode(Node givenNode, int data){
        Node current = head;
        Node newNode = new Node(data);
        if(givenNode==null){
            System.out.println("it will work same as insertAtFirst function");
        }
        else{
            newNode.next = givenNode.next;
            givenNode.next = newNode;
            newNode.previous = givenNode;
            if (newNode.next != null) {
                newNode.next.previous = newNode;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListClass dll = new DoublyLinkedListClass();
        dll.head = new Node(22);
        Node second = new Node(33);
        Node third = new Node(44);
        Node fourth = new Node(55);
        Node fifth = new Node(66);
        Node sixth = new Node(77);
        Node seventh = new Node(88);
        dll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        //1
        /*dll.printlist();*/
        //2
        /*System.out.println("\ndoubly linked list after insertion at node is:");
        dll.insertAtFirst(11);
        dll.printlist();*/
        //3
        dll.printlist();
        System.out.println("\ndoubly linked list after insertion of node after a given node is:");
        dll.insertAtgivenNode(sixth,80);
        dll.printlist();
    }

}
