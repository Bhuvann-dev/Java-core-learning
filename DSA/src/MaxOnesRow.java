public class MaxOnesRow {
    public static void main(String[] args) {
        int mat[][] = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        int maxRow = -1, maxCount = -1;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) if (mat[i][j] == 1) count++;
            if (count > maxCount) { maxCount = count; maxRow = i; }
        }
        System.out.println("Row with max 1s: " + maxRow);
    }
}