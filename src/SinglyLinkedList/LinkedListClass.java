package SinglyLinkedList;

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

    //4.insertlast Function to insert node at the end of linked list
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

    //6.delete node from linkedlist using position
    public void DeleteUsingPosition(int position){
        if(head == null){
            System.out.println("can't find the position of node");
        }
        else{
            Node temp = head;
            if(position == 0){
                head = head.next;
            }
            for (int i = 0;temp!=null && i < position-1; i++) {
                temp = temp.next;
            }
            if(temp == null || temp.next == null){
                System.out.println("\nYou are at the end of the list");
            }
            Node next = temp.next.next;
            temp.next =  next;
        }

    }
    //7.function to delete the linkedlist
    public void DeleteLinkedList(){
        head = null;
    }
    //8.find the length of linkedlist
    public void lengthUsingIterativeMethod(){
        int count = 0;
        Node Current = head;
        while(Current!=null){
            Current = Current.next;
            count = count+1;
        }
        System.out.println("\nlength of string is "+count);
    }
    //9. Search an element in given linkedlist
    public boolean search(int key){
        Node current = head;
        while (current!=null){
            if (current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    //10 getNthNode function to get the data of no node int the linkedlist
    public void getNthNode(int index){
        int count = 0;
        Node current = head;
        while(current!=null){
            if(count == index){
                System.out.println("\ndata at "+count+"th node is "+current.data);
            }
            count = count+1;
            current = current.next;
        }
    }
    //11 find the value of nth node from last
    public void nthNodeFromEnd(int index){
        int length = 0;
        Node current = head;
        while(current !=null){
            length = length+1;
            current = current.next;
        }
        if(index>length){
            System.out.println("Index is out of range");
        }
        current = head;
        for (int i = 1; i < length-index+1 ; i++) {
            current = current.next;
        }
        System.out.println("\nvalue of nth node from end is "+current.data);
    }
    //12.return the middle value of linkedlist
    public  void  middleValue(){
        int length = 1;
        Node current = head;
        while(current !=null){
            length = length+1;
            current = current.next;
        }current = head;
        if(length%2!=0) {
            for (int i = 1; i <= length / 2; i++) {
                current = current.next;
            }
            System.out.println("\nvalue of middle node is " + current.data);
        }
        else{
            current = head;
            for (int i = 1; i < length / 2; i++) {
                current = current.next;
            }
            System.out.println("\nvalue of middle node is " + current.data);
        }
    }
    //13.count the no. of times key occurs in linkedlist
    public void frequencyofValue(int key){
        int count = 0;
        Node current = head;
        while(current!=null){
            if(current.data==key){
                count = count+1;
            }
            current=current.next;
        }
        System.out.println("\n"+key+" occurs "+count+" times.");
    }
    //14.Function to reverse the linkedlist
    public  Node reverse(){
        Node previous = null;
        Node next = null;
        Node current = head;
        while (current!=null){
            next = current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head = previous;
        return  head;
    }

    public static void main(String[] args) {
        LinkedListClass llist = new LinkedListClass();
        llist.head = new Node(22);
        Node second = new Node(33);
        Node third = new Node(44);
        Node fourth = new Node(66);
        Node fifth = new Node(77);
        Node sixth = new Node(88);
        Node seventh = new Node(99);

        llist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        //1
        /*llist.printList();*/
        //2
        /*llist.insertFirst(11);
        System.out.println("\nAfter insertion at head position");
        llist.printList();*/
        //3
        /*System.out.println("\nAfter insertion at given node");
        llist.insertAfter(third,55);
        llist.printList();*/
        //4
        /*llist.insertLast(100);
        System.out.println("\nAfter adding node at last position");
        llist.printList();*/
        //5
        /*llist.delete(55);
        System.out.println("\nAfter deleting a key from list");
        llist.printList();
        llist.delete(100);
        System.out.println("\nAfter deleting a key from list");
        llist.printList();
        llist.delete(10);
        System.out.println("\nAfter deleting a key from list");
        llist.printList();*/
        //6
        /*llist.DeleteUsingPosition(7);
        System.out.println("\nAfter deleting a node using position from list");
        llist.printList();*/
        //7
        /*llist.DeleteLinkedList();
        System.out.println("\nlist after deletion");
        llist.printList();*/
        //8
        /*llist.lengthUsingIterativeMethod();*/
        //9
        /*llist.search(55);*/
        //10
        /*llist.getNthNode(4);
        llist.getNthNode(13);*/
        //11
        /*llist.nthNodeFromEnd(5);*/
        //12
        /*llist.middleValue();*/
        //13
        /*llist.frequencyofValue(55);*/
        //14
        /*System.out.println("\nGiven Linked list");
        llist.printList();
        Node node = llist.reverse();
        System.out.println("\nReversed linked list ");
        llist.printList();*/
    }
}
