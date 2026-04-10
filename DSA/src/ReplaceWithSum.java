public class ReplaceWithSum {
    static int getSum(int n) {
        int s = 0;
        while (n > 0) { s += n % 10; n /= 10; }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 56};
        for (int i = 0; i < arr.length; i++) arr[i] = getSum(arr[i]);
        for (int x : arr) System.out.print(x + " ");
    }
}