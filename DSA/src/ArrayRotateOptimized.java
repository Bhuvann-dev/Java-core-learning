public class ArrayRotateOptimized {
    void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start]; arr[start] = arr[end]; arr[end] = temp;
            start++; end--;
        }
    }
    void rotate(int arr[], int d) {
        int n = arr.length; d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        new ArrayRotateOptimized().rotate(arr, 2);
        for (int i : arr) System.out.print(i + " ");
    }
}