public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 19, 1};
        int max = arr[0], min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}