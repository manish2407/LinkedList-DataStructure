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
    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        ll.head = new Node(11);
        ll.second = new Node(22);
        ll.third = new Node(33);
        ll.head.next = ll.second;
        ll.second.next = ll.third;
        ll.printList();
    }
}
