public class RotateArrayK {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) temp[i] = arr[i];
        for (int i = k; i < n; i++) arr[i - k] = arr[i];
        for (int i = 0; i < k; i++) arr[n - k + i] = temp[i];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 2);
        for (int i : arr) System.out.print(i + " ");
    }
}