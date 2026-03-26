import java.util.HashMap;

public class FirstUnique {
    public static void find(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println("First unique: " + c);
                return;
            }
        }
    }
    public static void main(String[] args) {
        find("swiss");
    }
}