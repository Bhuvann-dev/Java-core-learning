public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int first = arr[0];

        // Shift elements to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        System.out.println("Array after left rotation:");
        for (int i : arr) System.out.print(i + " ");
    }
}