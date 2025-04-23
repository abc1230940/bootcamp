public class DemoConversion {
  public static void main(String[] args) {
    int x = 3;
    // because it is safe conversion, so java helps auto-conversion
    long l = x;
    System.out.println(l); // 3 -> long value

    // because it is safe conversion, so java helps auto-conversion
    double d1 = 0.3f;
    System.out.println(d1); // 0.3 -> double value (floating point ...)

    int y = 3;
    // ! byte b2 = x; -> Not OK, x is variable of int, unsafe conversion, java reject auto-conversion
    // ! char -> int
    byte b2 = (byte) y; // 夾硬做，後果自負, may cause overflow 
    byte b1 = (byte) 3;

    // ! 1. Implicit conversion -> 隱藏轉換
    // long to double是可以的
    // 大細關係: byte -> short -> int -> long -> float -> double
    double d2 = 3L; 
    System.out.println(d2); // 3.0

    float f2 = 4L;
    System.out.println(f2); // 4.0

    int ascii = 'a';
    System.out.println(ascii); // 97
    // 0, A, a -> 記
    int assciiOfA = 'A';
    System.out.println(assciiOfA); // 65
    int assciiOf0 = '0';
    System.out.println(assciiOf0); // 48

    // ! 2. Explicit conversion 明確轉換
    int x2 = 30000;
    short s2 = (short) x2;
    System.out.println(s2);


    // ! 3. auto-box, unbox (for Wrapper Class)
    int x3 = Integer.valueOf(9); // unbox
    Integer x4 = x3; // autobox
  }
  
}
