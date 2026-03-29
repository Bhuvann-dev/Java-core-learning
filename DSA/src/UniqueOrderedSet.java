import java.util.LinkedHashSet;

public class UniqueOrderedSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("First");
        lhs.add("Second");
        lhs.add("First"); // Duplicate ignored

        System.out.println("Unique but Ordered: " + lhs);
    }
}