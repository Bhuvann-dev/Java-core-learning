import java.util.HashSet;

public class DisjointSets {
    public static boolean areDisjoint(int[] set1, int[] set2) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : set1) hashSet.add(x);
        for (int x : set2) {
            if (hashSet.contains(x)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 3, 4, 6};
        int[] arr2 = {8, 7, 9, 1};
        System.out.println("Are disjoint: " + areDisjoint(arr1, arr2));
    }
}