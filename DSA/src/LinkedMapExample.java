import java.util.LinkedHashMap;

public class LinkedMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(3, "Three");
        lhm.put(1, "One");
        lhm.put(2, "Two");
        
        // Unlike HashMap, this maintains the order in which items were added
        System.out.println("Insertion Order: " + lhm);
    }
}