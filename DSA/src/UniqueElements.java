import java.util.HashSet;

public class UniqueElements {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] numbers = {10, 20, 10, 30, 20, 40};

        for (int num : numbers) {
            set.add(num);
        }
        System.out.println("Unique Elements in Set: " + set);
        System.out.println("Contains 30? " + set.contains(30));
    }
}