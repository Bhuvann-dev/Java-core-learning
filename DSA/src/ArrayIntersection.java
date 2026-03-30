import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1}, arr2 = {2, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) set.add(i);

        System.out.print("Intersection: ");
        for (int i : arr2) {
            if (set.contains(i)) {
                System.out.print(i + " ");
                set.remove(i);
            }
        }
    }
}