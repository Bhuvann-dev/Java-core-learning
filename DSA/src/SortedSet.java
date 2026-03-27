import java.util.TreeSet;

public class SortedSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Zebra");
        ts.add("Ant");
        ts.add("Monkey");

        System.out.println("Automatically Sorted Set: " + ts);
        System.out.println("First element: " + ts.first());
    }
}