public class CountSetBits {
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1); // Brian Kernighan’s Algorithm
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 29; // Binary: 11101
        System.out.println("Set bits in " + num + ": " + count(num));
    }
}