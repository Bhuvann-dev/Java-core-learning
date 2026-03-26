public class MissingNumber {
    public static int find(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int currentSum = 0;
        for (int num : arr) currentSum += num;
        return totalSum - currentSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // 3 is missing
        System.out.println("Missing number: " + find(arr, 6));
    }
}