public class RecursiveBinarySearch {
    public static int search(int[] arr, int low, int high, int target) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return search(arr, low, mid - 1, target);
        return search(arr, mid + 1, high, target);
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16};
        System.out.println("Index of 12: " + search(arr, 0, arr.length - 1, 12));
    }
}