public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArr = {10, 20, 30, 40, 50};
        int key = 40, low = 0, high = sortedArr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArr[mid] == key) {
                System.out.println("Found at: " + mid);
                return;
            }
            if (sortedArr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("Not found");
    }
}