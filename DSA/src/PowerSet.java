public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        int size = (int) Math.pow(2, n);

        for (int i = 0; i < size; i++) {
            String subset = "";
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) subset += s.charAt(j);
            }
            System.out.println("{" + subset + "}");
        }
    }
}