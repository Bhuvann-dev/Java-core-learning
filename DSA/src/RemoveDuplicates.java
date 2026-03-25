public class RemoveDuplicates {
    public static int remove(int[] arr) {
        if (arr.length == 0) return 0;
        int j = 0; // index of next unique element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // return length of unique elements
    }

    public static void main(String[] args) {
        int[] sortedArr = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = remove(sortedArr);

        System.out.println("Unique elements:");
        for (int i = 0; i < length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}