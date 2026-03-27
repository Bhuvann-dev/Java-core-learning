import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10); nums.add(20); nums.add(30);

        Iterator<Integer> it = nums.iterator();
        System.out.println("Iterating using Iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
