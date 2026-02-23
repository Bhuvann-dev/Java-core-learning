 import java.util.Scanner;
public class MathOperationApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operation = scan.nextLine();
        int a = scan.nextInt();
        int b = scan.nextInt();

        switch (operation) {
            case "Addition":
                System.out.println("The result of addition is: " + MathOperations.addition(a, b) );
            
            case "Subtraction": 
                System.out.println("The result of addition is: " + MathOperations.addition(a, b) );    

             case "Multiplictation":
                System.out.println("The result of addition is: " + MathOperations.multiplication(a, b));
            
            case "Division": 
                System.out.println("The result of addition is: " + MathOperations.division(a, b)); 
        }
            
    }

}
