class QNode {
    int key; QNode next;
    public QNode(int key) { this.key = key; this.next = null; }
}
public class QueueLinkedList {
    QNode front, rear;
    void enqueue(int key) {
        QNode temp = new QNode(key);
        if (this.rear == null) { this.front = this.rear = temp; return; }
        this.rear.next = temp; this.rear = temp;
    }
    int dequeue() {
        if (this.front == null) return -1;
        int val = this.front.key; this.front = this.front.next;
        if (this.front == null) this.rear = null;
        return val;
    }
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10); q.enqueue(20);
        System.out.println("Dequeued: " + q.dequeue());
    }
}