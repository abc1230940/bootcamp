import java.util.Scanner;

public class InvalidAgeException extends RuntimeException {
  private String code;
  public static void main(String[] args) {
    InvalidAgeException iae = new InvalidAgeException();

  
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input an age number:");
    int input = scanner.nextInt();
    try {
      int result = calculate(input);
      System.out.println("The input is " + input + " and the result is " + result);
    } catch (InvalidAgeException e) {
      System.out.println("Please input again. The value age is invalid.");
    }

    scanner.nextLine();
    

    // capture name, name length cannot be > 10
    System.out.println("Please input a name");
    
    String name = scanner.nextLine();
    try {
      int length = checkName(name);
      System.out.println("The length of input name is " + length);
    } catch (NameTooTongExection e) {
      System.out.println("Please input again. The name " + name + " is longer than 10 digits");
    }

   

  }

  public static int calculate(int age) {
    if (age < 0) {
      throw new InvalidAgeException();
    }
    return age + 10;
  }

  public static int checkName(String name) {
    if (name.length() > 10) {
      throw new NameTooTongExection(); // throw an error event
    }
    return name.length();
  }
}
