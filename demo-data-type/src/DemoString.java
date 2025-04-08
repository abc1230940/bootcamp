public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    // String is not a primitive
    String s1 = "Hello";
    String s2 = "100";

    // String + operation
    s2 = s2 + "100";
    System.out.println(s2); // "100100"
    s1 = s1 + "100";
    System.out.println(s1); // "Hello100"

    int x = 999;
    int y = 100;
    char c2 = '?';
    System.out.println(s1 + x); // "Hello100999"
    System.out.println(s1 + x * y); // "Hello10099900"
    System.out.println(s1 + x * y + c2); //Hello10099900?
  }
  
}
