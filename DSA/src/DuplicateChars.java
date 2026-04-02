public class DuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        
        System.out.println("Duplicate Characters:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char)i + " appears " + freq[i] + " times");
            }
        }
    }
}