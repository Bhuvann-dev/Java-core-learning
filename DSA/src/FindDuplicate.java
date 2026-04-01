import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                System.out.println("Duplicate found: " + num);
                return;
            }
            seen.add(num);
        }
    }
}