import java.util.Scanner;

public class InvalidIPAddressException extends Exception {

  public InvalidIPAddressException(String message) {
    super(message);
  }

  public static int isValidIPAddress(int number) throws InvalidIPAddressException {
    if (number < 0 || number > 255) {
      throw new InvalidIPAddressException("Invalid. The section must be >= 0 and <= 255"); // 提供佢嘅結果
    }
    return number;
  }

  public static void main(String[] args) {
  // while loop 

    Scanner scanner = new Scanner(System.in);
    int[] IPAddress = new int[4];
    for (int i = 0; i < 4; i++) {
      boolean validInput = false;
      while (!validInput) {
        System.out.println("Please enter the section " + (i + 1) + " of IP Address");
        String input = scanner.nextLine();
        try {
        Integer section = Integer.valueOf(input);
        isValidIPAddress(section);
        validInput = true;
        IPAddress[i] = section;
        System.out.println("The section" + (i + 1) + " of IP Address is " + section);
      } catch (NumberFormatException e) {
        System.out.println("Error: Please enter a valid number again. (0-255)");
      } catch (InvalidIPAddressException e) {
        System.out.println("This is InvalidIPAddressException: " + e.getMessage());
      } 
    }
      
    }
    scanner.close();
    System.out.println("The IP Address is [" + IPAddress[0] + "." + IPAddress[1] + "." + IPAddress[2] + "." + IPAddress[3] + "]");
    
    
    
  }
}
