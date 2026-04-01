import java.util.Scanner;

public class Avg {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the array size:");
      int size = scan.nextInt();
      int a [] = new int [size];
      int sum = 0;
      
      System.out.println("Enter array elements: ");
      for(int i = 0; i < size; i++) {
        a[i] = scan.nextInt();
        sum += a[i];
      }
      System.out.println("Array elements are:");
      for(int i = 0; i < size; i++) {
        System.out.print(a[i] + " ");
      }

      double avg = sum/size;
      System.out.println("Average of array: " + avg);
      


  }
}
