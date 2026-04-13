public class MissingNumberXOR {
    public static int find(int[] arr, int n) {
        int x1 = arr[0], x2 = 1;
        for (int i = 1; i < n - 1; i++) x1 ^= arr[i];
        for (int i = 2; i <= n; i++) x2 ^= i;
        return (x1 ^ x2);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        System.out.println("Missing number: " + find(a, 6));
    }
}