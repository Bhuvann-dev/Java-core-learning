class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        head.next = second;
        second.next = third;
        third.next = head; // Pointing back to head
        
        System.out.println("Circular Link created: " + third.next.data);
    }
}