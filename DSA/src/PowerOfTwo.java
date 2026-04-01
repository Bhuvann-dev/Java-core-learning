public class PowerOfTwo {
    public static boolean isPower(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println("Is 16 power of 2? " + isPower(16));
        System.out.println("Is 18 power of 2? " + isPower(18));
    }
}