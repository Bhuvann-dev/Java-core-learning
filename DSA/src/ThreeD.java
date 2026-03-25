import java.util.Scanner;

public class ThreeD {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int a[][][] = new int[3][2][3];

      for(int i = 0; i <= a.length-1; i++) {
        for(int j = 0; j <= a[i].length-1; j++) {
          for(int k = 0; k <= a[i][j].length-1; k++) {
              a[i][j][k] = scan.nextInt();
          }
        }
      }

      System.out.println("Elements are : ");

      for(int i = 0; i <= a.length-1; i++) {
        for(int j = 0; j <= a[i].length-1; j++) {
          for(int k = 0; k <= a[i][j].length-1; k++) {
              System.out.print(a[i][j][k] + " ");
          }
          System.out.println();
        }
        System.out.println();
      }
  }
}
