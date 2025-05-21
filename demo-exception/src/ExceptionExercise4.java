import java.util.Scanner;

public class ExceptionExercise4 {

  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();
    
    // code here ...
    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registeration is Success."

    
    // try, catch
    try {
      registerUser(username, password, email);
      System.out.println("User Registration is Success.");
    } catch (UserRegistrationException e) {
      System.out.println("User Registration is Fail:" + e.getMessage());
    }
  }

  public static class UserRegistrationException extends RuntimeException { // ! Class中可以寫class, 但只可以自私用, 通常寫static
    // code here ...
    public UserRegistrationException(String message) {
      super(message); // call parent constructor
    }
  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password,
      String email) {
    // ! re-throw
    // 如果想知邊一個死，應該係開3個Exception
    // ! 一個try就會離開, catch不代表離開, 但能夠會狀態
    // code here ...
    String errorMessage = "";
    boolean errorFound = false;
    try {
      validateUsername(username);
    } catch (IllegalArgumentException e) {
      errorMessage += e.getMessage();
      errorFound = true;
    }
    try {
      validatePassword(password);
    } catch (IllegalArgumentException e) {
      errorMessage += e.getMessage();
      errorFound = true;
    }
    try {
      validateEmail(email);
    } catch (IllegalArgumentException e) {
      errorMessage += e.getMessage();
      errorFound = true;
    }

    if (errorFound) {
      throw new UserRegistrationException(errorMessage);
    }
    System.out.println("User registered successfully: " + username);
    } 
    
      
    
      
    
    
  

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    // code here ...
    if (username == null || "".equals(username)) { // ! 一定要咁樣寫
      throw new IllegalArgumentException("Username validation fails.");  // ! Java覺得非法參數好common
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {
    // code here ...
    if (password == null || password.length() < 8 ||  
      (!password.contains("!") && !password.contains("@") && !password.contains("$") 
      && !password.contains("&"))) { // 記住這一個描述，如果withSpecialChar -> 就可以用|| -> 再用boolean -> 調返轉去諗
      throw new IllegalArgumentException("Password validation fails.");
    }
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {
    // code here ...
    if (email == null || (!email.contains("@"))) {
      throw new IllegalArgumentException("Email validation fails.");
    }
  }
}