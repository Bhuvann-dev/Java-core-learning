import java.util.Arrays;

public class SievePrimes {
    public static void findPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) prime[i] = false;
            }
        }
        for (int i = 2; i <= n; i++) if (prime[i]) System.out.print(i + " ");
    }
    public static void main(String[] args) {
        findPrimes(30);
    }
}