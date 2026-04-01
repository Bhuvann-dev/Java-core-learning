public class CircularQueue {
    int[] q;
    int front = -1, rear = -1, size;
    CircularQueue(int n) { size = n; q = new int[n]; }

    public void enqueue(int data) {
        if ((rear + 1) % size == front) return;
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        q[rear] = data;
    }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.enqueue(10); cq.enqueue(20);
        System.out.println("Circular Queue initialized.");
    }
}
