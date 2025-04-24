import java.math.BigDecimal;
import java.time.LocalDate;

public class DemoString {
  public static void main(String[] args) {
    // String -> Literal Pool
    // ! In this case, we have one "hello" String object
    String s = "hello";
    String s1 = "hello";
    System.out.println(s1 == s); // true

    // 佢會先橡查個pool有冇呢個string object
    String s2 = "hello1"; // diiferent String -> new String object

    // so, at this moment, we got 2 String objects in memory (hello and hello1)
    // but we have 3 object references (s, s1, s2)

    // Operations
    s = s + "world"; // s -> "helloworld"
    // so, at this moment, we got 3 String objects in memory (hello and hello1, helloworld)

    s1 = s1 + "???"; // s1 -> "hello???"
    // so, at this moment, we got 3 String objects in memory (hello1, helloworld, hello???)
    //"hello" object will be collected by JVM (Auto-GC)

    // Algorithm -> program (Performance: runtime speed and memory usage)
    // ! Time Complexity and Space Complexity

    String s4 = new String("hello1"); // ! -> 強行new object
    System.out.println(s2 == s4); // false

    System.out.println(s1); // hello???
    String s5 = "hello???";
    System.out.println(s1 == s5); // ! false, 用+形式製造hello???係另一種形式的obejct, 係同本身hello???有不同，所以false(minor knowledge), //都係new String()\
    String s6 = "hello???";
    System.out.println(s5 == s6); // true

    String s7 = "hello".concat("???");
    System.out.println(s5 == s7); // false

    String s8 = String.valueOf("hello???");
    System.out.println((s8 == s5)); // true -> 都係check pool先

    String s9 = new String("hello???");
    System.out.println(s8 == s9); // false

    String s10 = new String("hello???").intern(); // 將會放返落string pool
    System.out.println(s10 == s5); // true

    int[] arr = new int[3]; // In Java, array is the most raw structure. 
    int x =3; // Primitive is also the raw structure in Java

    
    // methods的速度比較
    String s12 = "hellh";
    System.out.println(s12.replace('h', 'x')); // slow -> 因為會行for loop, 但係其實要諗下佢駛唔駛用呢個工具

    String s13 = s12.substring(1); // ellh , 由index 1到尾, ellh -> 這個方法更快
    s12.charAt(4); // 這個方法非常快

    BigDecimal bd = BigDecimal.valueOf(1.0); // add, subtract, multiply, divide
    BigDecimal bd2 = bd.add(BigDecimal.valueOf(1.2));
    System.out.println(bd == bd2); // false, 地址不用

    LocalDate ld = LocalDate.of(2025, 4, 24);
    LocalDate ld2 = LocalDate.of(2025, 4, 24);
    System.out.println(ld.equals(ld2)); // true, check values
    System.out.println(ld == ld2); // false, different address
  }
  
}
