import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        String text = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character Frequencies: " + map);
    }
}
