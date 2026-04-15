public class ReverseArrayInPlace {
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        reverse(nums);
        for (int i : nums) System.out.print(i + " ");
    }
}