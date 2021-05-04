public class LinkedListClass {
    Node head;
    Node second;
    Node third;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    }
}
