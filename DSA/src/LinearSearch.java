public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] data = {10, 50, 30, 70, 90};
        System.out.println("Element found at index: " + search(data, 70));
    }
}