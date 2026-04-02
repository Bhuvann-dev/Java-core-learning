import java.util.HashSet;

public class ArraySubset {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr1) set.add(x);
        for (int x : arr2) {
            if (!set.contains(x)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};
        System.out.println("Is subset? " + isSubset(a, b));
    }
}