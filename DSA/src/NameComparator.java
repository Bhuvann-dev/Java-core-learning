import java.util.*;

public class NameComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chirag", "Swati", "Abhi");
        // Sorting by name length using a Lambda expression
        Collections.sort(names, (a, b) -> a.length() - b.length());
        System.out.println("Sorted by length: " + names);
    }
}