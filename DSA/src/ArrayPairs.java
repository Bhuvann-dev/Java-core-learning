import java.util.HashSet;

public class ArrayPairs {
    public static void findPairs(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int target = sum - num;
            if (set.contains(target)) {
                System.out.println("Pair found: (" + target + ", " + num + ")");
            }
            set.add(num);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 7, -1, 5};
        findPairs(nums, 6);
    }
}