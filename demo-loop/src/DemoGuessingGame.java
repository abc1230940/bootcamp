import java.util.Scanner;

public class DemoGuessingGame {
  public static void main(String[] args) {
    // 1- 100
    // Bome = 67

    // User A: 93(1-100)
    // User B: 49(1-92)
    // User A: 66(50-92)
    // User B: 68(67-92)
    // User A: 67(67-67) 
    int bomb = 67; // random number
    // while loop
    // Scanner (Collect user input)
    // ! User A and B ? counter -> User A / B
    // Adjust the range of numbers
    // Prompt Question: "Please input a number:"
    // continue condition
    
    int input = -1;
    int min = 1;
    int max = 100;
    int counter = 1;
    char user = 'A';

    while (input != bomb) {
        // collect input
        if (counter % 3 == 1 ) {
          user = 'A';
        } else if (counter % 3 == 2) {
          user = 'B'; 
        } else if (counter % 3 == 0) {
          user = 'C';
        }
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("User " + user + " Please input a number between " + min + "-" + max);
        input = scanner.nextInt();
        // Validate input if it is valid
        if (input < min || input > max) {
          continue;
        }
          // ! Adjust the range of numbers
        if (input > bomb) {
            max = input - 1;
            } else {
            min = input + 1;
          }
          counter++; // 無論佢輸入咩number都會加count
        }
     
    if (counter % 3 == 2) {
      user = 'A';
    } else if (counter % 3 == 0) {
      user = 'B';
    } else if (counter % 3 == 1) {
      user = 'C';
    }
    System.out.println("User " + user + " lost ");
    



  }
}
