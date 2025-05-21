import java.util.Scanner;

public class ExceptionExercise1 {
  // Question: Write a program that divides two numbers provided by the user. Handle the
  // ArithmeticException when dividing by zero and display an appropriate message.

  // 1. If exception is caught, print "Error: Cannot divide by zero.", otherwise print "Result: X"
  // 2. No matter if the exception is caught, finally print "Division operation completed."
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter numerator: ");
    int numerator = scanner.nextInt();
    System.out.print("Enter denominator: ");
    int denominator = scanner.nextInt();
    scanner.close();

    // code here ...
    // try, catch
    try {
      System.out.println("Result: " + numerator / denominator);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero.");
    } finally { // comes to "finally" code block no matter "try" or "catch"
      System.out.println("Division operation completed.");
    }
    
      
    }
  }
