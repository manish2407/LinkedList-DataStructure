public class LinkedListClass {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
            }
        }
        //insertFirst Function to insert node at head position
    public void insertFirst(int new_Data){
        Node NewNode = new Node(new_Data);
        NewNode.next = head;
        head = NewNode;

    }
    //insertAfter function for inserting node after given node
    public void insertAfter(Node previous_Node, int data){
        if(previous_Node == null){
            System.out.println("this node cannot be null");
        }
        Node NewNode = new Node(11);
        NewNode.next = previous_Node.next;
        previous_Node.next = NewNode;
    }
    //printlist function to print the list
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-->");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListClass llist = new LinkedListClass();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        llist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        llist.printList();
        llist.insertFirst(0);
        System.out.println("\nAfter insertion at head position");
        llist.printList();
        System.out.println("\nAfter insertion at given node");
    }
}
