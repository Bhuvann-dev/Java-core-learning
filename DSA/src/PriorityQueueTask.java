import java.util.PriorityQueue;

public class PriorityQueueTask {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(30);

        System.out.println("Smallest element (Head): " + pq.peek());
        System.out.println("Removing elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}