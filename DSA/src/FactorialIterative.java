public class FactorialIterative {
    public static long factorial(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 10: " + factorial(10));
    }
}