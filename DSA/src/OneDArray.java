import java.util.Scanner;
public class OneDArray {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the size of the Array: ");
    int size = scan.nextInt();
    
    int a[] = new int[size];


    System.out.println("Enter the elements to be stored: ");
    for(int i = 0; i <= size-1; i++) {
       a[i] = scan.nextInt();
    }


    System.out.println("Array elements are: ");
    for(int i = 0; i <= size-1; i++) {
      System.out.println(a[i]);
    }

    
  }
}
