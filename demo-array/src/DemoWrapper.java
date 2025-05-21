import java.util.Arrays;

public class DemoWrapper {
  public static void main(String[] args) {
    // 8 primitives
    int a = 1;
    byte b = 2;
    short c = 3;
    long d = 4L;
    float e = 5f;
    double f = 6;
    boolean g = true; // default value = false
    char h = 'a';

    // Wrapper Class of char -> 記得要大階
    Character c1 = Character.valueOf('a');
    System.out.println(c1); // a
    char c0 = c1.charValue();
    System.out.println(c0); // a

    System.out.println(c1.compareTo(Character.valueOf('b'))); // -1
    System.out.println(Character.valueOf('b').compareTo(c1)); // 1
    System.out.println(Character.valueOf('c').compareTo(Character.valueOf('b'))); // 1

    // Wrapper Class of boolean
    boolean b3 = Boolean.valueOf(true);
    boolean b4 = Boolean.valueOf(false);

    // ! Wrapper Class of byte, short, int, long
    byte b6 = 2;
    Byte b5 = Byte.valueOf((byte) 2);
    // int -> byte (unsafe)
    Short s2 = Short.valueOf((short) 2);
    Integer i1 = Integer.valueOf(2);
    Long l1 = Long.valueOf(2L); // -> 有autoconversion, 可不用加L

    // Wrapper Class of float, double
    Float f3 = Float.valueOf(3.14f); // double去float不安全again
    Double d3 = Double.valueOf(3.14);

    // Autoboxing (Only for the pair of primitive and Wrapper class)
    // int value -> Integer variable
    Integer i2 = 2;

    // ! int -> long (safe conversion)
    long l3 = 2;
    // int value -> long value -> Long (NOT ok)
    // Long l2 = 2; -> 不行的

    // long value -> Long
    Long l2 = 2L; 

    // ! Unboxing
    int i4 = Integer.valueOf(10);
    // int i5 = Long.valueof(10L);
    long i5 = Long.valueOf(10L);
    // Long -> Integer -> 你當佢係2個封咗嘅盒，大家睇唔到大家的value

    // Long -> long -> int -> (autobox) Integer
    Integer i6 = (int) ((long) Long.valueOf(10L)); // 可行，但現實不會寫

    // ! compareTo() -> Wrapper Class & String(少) -> 數字上會多用
    int age = 102;
    // ! Integer never use >, <. >=, <= We should use compareTo for comparison
    // 這個compareTo()不是減數
    System.out.println(Integer.valueOf(100).compareTo(Integer.valueOf(age))); // -1, right is larger, 2個都係盒先比較到  compareTo 唔同的Wrapper Class會有唔同的功能
    System.out.println(Integer.valueOf(102).compareTo(Integer.valueOf(age))); // 0

    // unboxing for Math operation (int - int -> int)
    int diff = Integer.valueOf(100) - Integer.valueOf(age);
    System.out.println(diff); // -2

    String s10 = "abcd";
    String s11 = "bcde";
    System.out.println(s11.compareTo(s10)); // 1 (compare first char, b - a)
    System.out.println(s10.compareTo(s11)); // -1 (compare first char, a - b)
    String s12 = "ccde";
    System.out.println(s12.compareTo(s10)); // 2 (compare first char, c - a)
    String s13 = "cdde";
    System.out.println(s13.compareTo(s12)); // 2 (compare second char, d - c) -> 第一個一樣，會compare第二個char

    String s14 = "Abcd";
    System.out.println(s14.compareTo(s10)); // -32 (A - a)
    String s16 = "Abcde";
    System.out.println(s14.compareTo(s16)); // -1 -> 不同長度就會出-1

    String name = "John";
    if (!name.equals("John")) {
      // do something
      System.out.println("Not John");
    } else {
      System.out.println("John");
    }

    // Check if the String value is Palindromic
    // madam
    // ada
    // abcba
    // abccba
    String word = "madam"; // true
    boolean isPalindromic = true;
    for (int i = 0; i < word.length()/2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
        isPalindromic = false;
        break;
      }
      
    }
    System.out.println(isPalindromic);



    String s = "hello world. I am Clarence.";
    String[] arr = s.split(" ");
    System.out.println(Arrays.toString(arr));

  }
  
}
