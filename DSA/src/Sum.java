import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter size of the array: ");
      int size = scan.nextInt();
      int sum = 0;
      int a[] = new int [size];

      System.out.println("Enter array elements: ");
      for(int i = 0; i < size; i++) {
        a[i] = scan.nextInt();
      }

      System.out.println("Array elements are: ");
      for(int i = 0; i < size; i++) {
        System.out.print( a[i] + " ");
      }

      for(int i = 0; i < size; i++) {
        sum += a[i];
      }
      System.out.println("Sum of array is: " + sum);

      


  }
}
