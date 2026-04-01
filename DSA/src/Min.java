import java.util.Scanner;

public class Min {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

      System.out.println("Enter the size of the array:");
      int size = scan.nextInt();

      int a [] = new int [size];

      System.out.println("Enter Array elements: ");
      for(int i = 0; i < size; i++) {
        a[i] = scan.nextInt();
      }

      System.out.println("Array elements are: ");
      for(int i = 0; i < size; i++) {
        System.out.print(a[i] + " ");
      }
      System.out.println();

      int min = a[0];
      for(int i = 1; i < size; i++) {
        if(a[i] < min) {
          min = a[i];
        }
      }
  }
}
