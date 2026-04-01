import java.util.Scanner;
public class SecondLargest {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int size = scan.nextInt();
      int a [] = new int[size];

      int Largest = a[0];
      int SecondLargest = a[0];
      
      for(int i = 0; i < size; i++) {
        a[i] = scan.nextInt();
      }

      for(int i = 1; i < size; i++) {
        if(a[i] > Largest) {
          Largest = a[i];
        } else if(a[i] > SecondLargest) {
          SecondLargest = a[i];
        }
      }
      System.out.println("Second largest: " + SecondLargest);



  }
}
