public class StringPrefix {
    public static String getPrefix(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) res.append(s1.charAt(i));
            else break;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println("Common Prefix: " + getPrefix("Coding", "Coders"));
    }
}