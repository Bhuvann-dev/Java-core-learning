import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Berry");
        
        Collections.sort(fruits); // Sorting the list
        System.out.println("Sorted Fruits: " + fruits);
        
        fruits.set(1, "Dragonfruit"); // Updating an element
        System.out.println("Updated List: " + fruits);
    }
}