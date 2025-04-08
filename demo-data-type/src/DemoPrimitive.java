public class DemoPrimitive {
  public static void main(String[] args) {
    // ! Primitives (int, double, long, short, byte, float, boolean, char)
    // 8 primitives in total for Java
    
    // Primitives for Interger (byte, short, int, long)
    int x = 10;

    // range from -128 to 127
    byte b1 = 10;
    byte b2 = -128;
    byte b3 = 127;
    // byte b4 = 128;
    System.out.println(b1);

    // b3 + 1
    // 1. byte + int -> int
    // 2. assign int to byte variable
    int i9 = 1; // 即做int i9 = 1都唔俾,java thinks it's not safe -> not allowed for assignment
    b3 = (byte) (b3 + 1); // 強行將int放入byte -> (byte)數式
    System.out.println(b3); // -128 (overflow)

    int i10 = 1;
    byte b4 = 1;
    b4 = (byte) (b4 + i10);
    System.out.println(b4); // 2


    // -32xxx to 32xxx
    short s1 = 10;
    short s2 = -32768;
    // short s3 = -32769;
    System.out.println(s1);
    System.out.println(s2);

    // int y = -2147483649;
    int z = 2147483647;
    System.out.println(z);
    z = z + 1; 
    System.out.println(z); // ! -2147483648 (overflow)

    // long
    // 10 is an int value
    // ! -2147483649 -> invalid value (int)
    // ! -2147483649L -> valid value (long)
    long l1 = 9223372036854775807L;
    long l2 = -4000000L;
    System.out.println(l1);

    // long + int -> long
    l2 = l2 + 200;
    System.out.println(l2);

    // double, float -> store the decimals
    // ! 9.5 is a double value
    // ! 9.5d is a double value
    // ! 9.5f is a float value
    double d1 = 9.5;
    double d2 = 9.5d;
    float f1 = 9.5f;
    
    // ! the type double is more precise than float -> Java does not allow.
    // float f2 = 9.5;

    float f2 = 0.3f - 0.1f;
    System.out.println(f2); // 0.20000002 (same problem with double)

    // boolean
    boolean b10 = true;
    b10 = false;
    System.out.println(b10);

    int age = 66;
    boolean isElderly = age > 65; // 比較式
    System.out.println(isElderly);

    // char
    // Store single character
    // 'a' -> char value
    // c1, c2 -> char variable
    char c1 = 'a';
    char c2 = '\'';
    System.out.println(c1); // a
    System.out.println(c2); // '





    
  }
  
}
