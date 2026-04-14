public class DigitOccurrence {
    public static int count(int n, int d) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == d) count++;
                temp /= 10;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Digit 2 appears in 0-25: " + count(25, 2));
    }
}