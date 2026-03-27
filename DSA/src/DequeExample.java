import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        LinkedList<String> deque = new LinkedList<>();
        deque.addFirst("Start");
        deque.addLast("End");
        deque.add(1, "Middle");

        System.out.println("Deque: " + deque);
        System.out.println("Removed from Front: " + deque.removeFirst());
    }
}