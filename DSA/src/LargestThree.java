
public class LargestThree {
    public static void print3Largest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > first) {
                third = second; second = first; first = x;
            } else if (x > second) {
                third = second; second = x;
            } else if (x > third) {
                third = x;
            }
        }
        System.out.println("Three largest: " + first + ", " + second + ", " + third);
    }
    public static void main(String[] args) {
        int[] nums = {10, 4, 3, 50, 23, 90};
        print3Largest(nums);
    }
}