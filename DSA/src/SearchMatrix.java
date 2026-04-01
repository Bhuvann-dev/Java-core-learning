public class SearchMatrix {
    public static boolean search(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) return true;
            if (matrix[r][c] > target) c--;
            else r++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {{10, 20, 30}, {15, 25, 35}, {27, 29, 37}};
        System.out.println("Target 29 found: " + search(mat, 29));
    }
}