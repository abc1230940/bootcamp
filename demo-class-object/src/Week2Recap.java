import java.math.BigDecimal;
import java.time.LocalDate;

public class Week2Recap {
  private int age;
  private String name;

  // getter
  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  // setter
  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  // ! compareTo
  public int compareTo(Week2Recap week2Recap) { // compareTo係method name Week2Recap -> the name of the class
    if (this.age == week2Recap.getAge()) {
      return 0;
    } else if (this.age > week2Recap.getAge()) {
      return 1;
    } else {
      return -1;
    }
  }

  // w1.isOlderThan(xxx) -> 只能在Week2Recap call
  public boolean isOlderThan(Week2Recap week2Recap) {
    if (this.age > week2Recap.getAge()) { // return this.age > week2Recap.getAge(); -> 更快
      return true;
    }
    return false;
  }

  // method name -> Presentation
  public boolean isElderly() {
    return this.age >= 65;
  }

  public static void main(String[] args) { // ! It is a testing area
    // 8 Primitives, String
    // BigDecimal
    // LocalDate

    // Store a set of same type of values -> array
    LocalDate[] dates = new LocalDate[3];
    BigDecimal[] numbers = new BigDecimal[4];

    // Wrapper Class
    // Integer, Short, Long, Byte
    // Double, Float
    // Character
    // Boolean
    // autobox (from primitives to Wrapper Class), unbox (from Wrapper Class to Primitives)

    // Primitives - Upcast, Downcast
    // ! byte -> short -> int -> long -> float -> double -> safe, upcast
    // ! char -> int
    int k = 3;
    long x = k; // upcast

    // ! During compile time, "unsafe" on type conversion -> Explicit Conversion
    // ! During runtime, JVM find 4L is safe for this conversion
    int h = (int) 4L;

    // overflow
    byte b = (byte) 138L;
    System.out.println(b); // -118

    // Math(pow, sqrt, round, max, min)
    // BigDecimal (add, subtract, multiply, divide)

    // ! String
    String s1 = "hello"; // s1係地址 Assign the object address of "hello" object into s1.

    // ! When you use "new" to create object, Java always create a new one for you
    String s2 = new String("hello");

    // ! When you use double quote to create String object, Java checks if the "hello" object exists
    // ! So, in this case, Java assign the same object address of s1 into s3.
    String s3 = "hello";
    System.out.println(s1.equals(s2)); // true -> 真係check個String
    System.out.println(s1.equals(s3)); // true -> 真係check個String

    System.out.println(s1 == s2); // false, "==" check if they are with same object address, 所以同.equals好大分別, check相同不要用
    System.out.println(s2 == s3); // false
    System.out.println(s1 == s3); // true

    // The above theory applies to all Objects
    BigDecimal bd1 = BigDecimal.valueOf(3); // object
    BigDecimal bd2 = BigDecimal.valueOf(3);
    System.out.println(bd1 == bd2); // ! true -> 會用返同一個box

    BigDecimal bd3 = new BigDecimal("3");
    System.out.println(bd1 == bd3); // false -> 有new時就一定會開個新object

    BigDecimal johnSalary = BigDecimal.valueOf(21000);
    BigDecimal marySalary = BigDecimal.valueOf(21000);

    // ! Object methods always check the value itself
    // Primitives always use "==" if they are with same value
    if (johnSalary.compareTo(marySalary) == 0) { // if they are having same salary, return int
      System.out.println("they are having same salary");
    }

    // LocalDate
    // equals, compareTo
    System.out
        .println(LocalDate.of(2024, 1, 1).compareTo(LocalDate.of(2024, 1, 1))); // 0

    App a1 = new App();

    Week2Recap p1 = new Week2Recap();
    p1.setAge(30);
    p1.setName("John");
    Week2Recap p2 = new Week2Recap();
    p2.setAge(30);
    p2.setName("Mary");
    System.out.println(p1 == p2); // false -> 因為new
    System.out.println(p1.getAge() == p2.getAge()); // true -> getAge value
    System.out.println(p1.compareTo(p2)); // 0
    System.out.println(p1.isOlderThan(p2)); // 用工具去包裝, p1裝住好多資料(age, name, ...)，只係用其中一個特微去做一D事

    if (p1.isElderly()) { // ! -> 增強presentation, 解低discussion, 只有岩與錯，比數字

    }

    if (p1.getAge() >= 65) {

    }

    System.out.println(p1.getAge());
    System.out.println(p1.getName());

    Circle c3 = new Circle(); // 即使在另一個java file, 只要在同一個Src, 就可以製造object
    c3.setRadius(2.56);
    System.out.println(c3.area());



  }

}
