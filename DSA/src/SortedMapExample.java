import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> dictionary = new TreeMap<>();
        dictionary.put("Zebra", "Animal");
        dictionary.put("Apple", "Fruit");
        dictionary.put("Ball", "Toy");

        // Keys are automatically sorted alphabetically
        System.out.println("Dictionary (Sorted): " + dictionary);
    }
}