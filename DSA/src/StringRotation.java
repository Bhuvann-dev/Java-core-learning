public class StringRotation {
    public static String rotate(String str, int d) {
        return str.substring(d) + str.substring(0, d);
    }
    public static void main(String[] args) {
        String s = "Bengaluru";
        System.out.println("Rotated by 3: " + rotate(s, 3));
    }
}