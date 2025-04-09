public class Exercise1 {
  public static void main(String[] args) {
    String s1 = "welcome";
    // equals()
    System.out.println(s1.equals("welcome")); // true
    boolean b1 = s1.equals("welcome");
    System.out.println(b1); // true

    // length()
    System.out.println(s1.length()); // 7
    int x = s1.length();
    System.out.println(x); // 7

    // charAt()
    System.out.println(s1.charAt(0)); // w
    char c1 = s1.charAt(0);
    System.out.println(c1); // w

    // System.out.println(s1.charAt(10)); // ! Exception (System Error) -> java會run, 但去到呢一步會停 -> bug

    // Naming Convention - Java
    // Camel case
    String studentName = "John";
    System.out.println(studentName); // John

  }
  
}
