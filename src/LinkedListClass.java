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

    //1.printlist function to print the list
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-->");
            n = n.next;
        }
    }

    //2.insertFirst Function to insert node at head position
    public void insertFirst(int new_Data){
        Node NewNode = new Node(new_Data);
        NewNode.next = head;
        head = NewNode;

    }

    //3.insertAfter function for inserting node after given node
    public void insertAfter(Node previous_Node, int data){
        if(previous_Node == null){
            System.out.println("this will work same as insertLast Function");
        }
        /*if(previous_Node.next == null){
            System.out.println("this node cannot be null");
        }*/
        else {
            Node NewNode = new Node(data);
            NewNode.next = previous_Node.next;
            previous_Node.next = NewNode;
        }
    }

    //4.insertlast Function to insert node at the ned of linked list
    public void insertLast(int new_Data){
        Node NewNode = new Node(new_Data);
        if(head == null){
            System.out.println("LinkedList is empty");
            head = NewNode;
        }
        else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = NewNode;
        }
    }

    //5.Delete method to delete the given key from the linkedlist
    public void delete(int data) {
        Node temp = head, previous = null;
        //to check list is empty or not

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == data) {
            temp = temp.next; // Changed head
        }
        while (temp != null && temp.data != data) {
            previous = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node not found");
        } else {
            previous.next = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListClass llist = new LinkedListClass();
        llist.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);
        Node fourth = new Node(44);
        Node fifth = new Node(55);
        Node sixth = new Node(55);
        Node seventh = new Node(55);

        llist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        //1
        llist.printList();
        //2
        llist.insertFirst(10);
        System.out.println("\nAfter insertion at head position");
        llist.printList();
        //3
        System.out.println("\nAfter insertion at given node");
        llist.insertAfter(third,40);
        llist.insertAfter(fifth,60);
        llist.printList();

    }
}
