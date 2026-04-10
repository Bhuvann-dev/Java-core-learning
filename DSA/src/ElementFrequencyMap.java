import java.util.HashMap;

public class ElementFrequencyMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);
        System.out.println("Element Frequencies: " + map);
    }
}