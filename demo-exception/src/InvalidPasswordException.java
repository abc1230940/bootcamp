// ! "extends Exception" -> InvalidPasswordException becomes "Checked Exception" .> must be handled
public class InvalidPasswordException extends Exception {

  // Parent Class Exception by default contain "message" attribute
public InvalidPasswordException() {

}

  public InvalidPasswordException(String message) {
    super(message);
  }

  public static void main(String[] args) {
    // ! During compile time, we have to handle "checked" exception -> 紅線
    try {
      int result = isValidPassword("234561234");
      System.out.println(result);
    } catch (InvalidPasswordException e) {
      System.out.println("this is InvalidPasswordException: " + e.getMessage());
    }
  }
  

  // ! method signature -> throws
  // potentially throw exception -> method caller has to handle the exception
  public static int isValidPassword(String password) throws InvalidPasswordException {
    // length > 8 and english characters -> 1
    // length > 8 and contains numbers and english characters -> 2
    // length > 8 and contains numbers and english characters and special character -> 3
    // otherwise, throw InvalidPasswordException 
    if (password == null || password != null && password.length() <= 8) {
      throw new InvalidPasswordException("Invalid. Password Length <= 8"); // ! force you to "handle" -> 可以自帶message拎返出去用
    }
    boolean foundNumber = false;
    boolean foundEnglish = false;
    boolean foundSpecialChar = false;
    for (char ch : password.toCharArray()) {
      if (ch >= '0' && ch <= '9') {
        foundNumber = true;
      } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
        foundEnglish = true;
      } else if (ch >= '!' && ch <= '/' || ch >= ':' && ch <= '@' || ch >= '[' && ch <= '`' || ch >= '{' && ch <= '~') {
        foundSpecialChar = true;
      }
      }
      if (!foundEnglish) {
        throw new InvalidPasswordException("Invalid. English Character is not found.");
      }
      if (foundEnglish) {
        if (foundNumber) {
          if (foundNumber) {
            if (foundSpecialChar) {
            return 3;
          }
          return 2;
      }
      return 1;
    }
        }
        return -1;
  }
}


  



  

