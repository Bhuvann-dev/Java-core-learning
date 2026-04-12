public class ThreeArrayIntersection {
    public static void main(String[] args) {
        int a[] = {1, 5, 10, 20}, b[] = {6, 7, 20, 80}, c[] = {3, 4, 15, 20, 30};
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " "); i++; j++; k++;
            }
            else if (a[i] < b[j]) i++;
            else if (b[j] < c[k]) j++;
            else k++;
        }
    }
}