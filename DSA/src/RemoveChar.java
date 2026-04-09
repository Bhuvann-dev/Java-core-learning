public class RemoveChar {
    public static void main(String[] args) {
        String str = "Bengaluru";
        char target = 'u';
        String result = str.replace(Character.toString(target), "");
        System.out.println("After removing '" + target + "': " + result);
    }
}