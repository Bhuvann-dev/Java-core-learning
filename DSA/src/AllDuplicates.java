import java.util.*;

public class AllDuplicates {
    public static void find(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int x : arr) {
            if (!seen.add(x)) duplicates.add(x);
        }
        System.out.println("Duplicates: " + duplicates);
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        find(nums);
    }
}