public class Fibonacci {
    public static int getFib(int n) {
        if (n <= 1) return n;
        return getFib(n - 1) + getFib(n - 2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + " is: " + getFib(n));
    }
}