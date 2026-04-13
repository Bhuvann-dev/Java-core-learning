public class ClimbStairs {
    public static int countWays(int n) {
        if (n <= 1) return 1;
        int first = 1, second = 1;
        for (int i = 2; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
    public static void main(String[] args) {
        int stairs = 4;
        System.out.println("Ways to climb " + stairs + " stairs: " + countWays(stairs));
    }
}