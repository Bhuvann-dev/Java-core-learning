public class NearlySortedSearch {
    public static int search(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return mid;
            if (mid > low && arr[mid - 1] == x) return mid - 1;
            if (mid < high && arr[mid + 1] == x) return mid + 1;
            if (arr[mid] > x) high = mid - 2;
            else low = mid + 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        System.out.println("Index of 40: " + search(arr, 40));
    }
}