public class RecursiveSelectionSort {
    static void sort(int[] arr, int n, int index) {
        if (index == n) return;
        int minIdx = index;
        for (int j = index + 1; j < n; j++) {
            if (arr[j] < arr[minIdx]) minIdx = j;
        }
        int temp = arr[minIdx];
        arr[minIdx] = arr[index];
        arr[index] = temp;
        sort(arr, n, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        sort(arr, arr.length, 0);
        for (int i : arr) System.out.print(i + " ");
    }
}