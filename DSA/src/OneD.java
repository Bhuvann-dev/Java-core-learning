import java.util.Scanner;

public class OneD {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the size of the Array:");
      int size = scan.nextInt();
      // System.out.println(size);

      int a[] = new int[size];

      System.out.println("Enter the size to be stored:");
      for(int i = 0; i <= size-1; i++) {
        a[i] = scan.nextInt();
      }

      System.out.println("Array Elements are:");
      System.out.print("[");
      for(int i = 0; i <= size-1; i++) {
        if( i != size-1)
        {
          System.out.print(a[i] + ", ");
        }
        else {
          System.out.print(a[i]);
        }
       
      }
      System.out.print("]");
  }
}
