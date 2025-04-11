public class DemoIf {
  public static void main(String[] args) {
    // if, else if, else
    int x = 25;

    // if + else if + else
    if (x < 10) { // 先試第一行
      System.out.println("x < 10"); // ! else if: 滿足咗第一行，即使第二行條件都滿足就不會行下一行

    } else if (x >= 20) { // mutually exclusive，第一行唔滿足，會行呢一行
      System.out.println("x >=20");

    } else { // 10 - 19
      System.out.println("10 -19");

    }

    // 2. if
    // 3. if + else, else 係所有情況都包晒
    String s1 = "may";
    if (s1.equals("hello")) {
      System.out.println("this is hello");
    } else if (s1.equals("Hello")) {
      System.out.println("This is Hello");
    } else {
      System.out.println("this is may");
    }
    // 4. if + else if  沒有else, 不包括所有case
    String s = "goodbye";
    if (s.equals("hello")) {
      System.out.println("this is hello");
    } else if (s.equals("Hello")) {
      System.out.println("This is Hello");
    }
  }
  
}
