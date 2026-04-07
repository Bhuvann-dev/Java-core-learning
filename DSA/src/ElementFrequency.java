public class ElementFrequency {
    public static int count(int[] arr, int x) {
        int freq = 0;
        for (int num : arr) if (num == x) freq++;
        return freq;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 4};
        System.out.println("Frequency of 2: " + count(arr, 2));
    }
}