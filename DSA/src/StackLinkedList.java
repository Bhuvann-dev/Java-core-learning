class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class StackLinkedList {
    Node top;
    public void push(int d) {
        Node newNode = new Node(d);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if (top == null) return -1;
        int d = top.data;
        top = top.next;
        return d;
    }
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(10); s.push(20);
        System.out.println("Popped: " + s.pop());
    }
}