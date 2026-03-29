import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Thread-Safe");
        v.add("Dynamic-Array");
        
        System.out.println("Vector size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
    }
}