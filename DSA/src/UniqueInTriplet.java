public class UniqueInTriplet {
    public static int find(int[] arr) {
        int ones = 0, twos = 0;
        for (int x : arr) {
            ones = (ones ^ x) & (~twos);
            twos = (twos ^ x) & (~ones);
        }
        return ones;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 3};
        System.out.println("Unique element: " + find(arr));
    }
}