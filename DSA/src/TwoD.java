import java.util.Scanner;
public class TwoD {
  
  public static void main(String[] args) {
      
    

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter you 2D array size in Row and col:");
    int row = scan.nextInt();
    int col = scan.nextInt();

    int a [][] = new int[row][col];

    System.out.println("Enter the elements to be inserted:");
    for(int i = 0; i <= a.length-1; i++) {
      for(int j = 0; j<= a[i].length-1; j++) {
        a[i][j] = scan.nextInt() ;
      }
    }

    System.out.println("Entered Elements are: "); 
    for(int i = 0; i <= a.length-1; i++) {
      for(int j = 0; j <= a[i].length-1; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }


  }
}
 

