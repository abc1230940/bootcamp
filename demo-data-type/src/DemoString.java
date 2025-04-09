public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    System.out.println(c1);
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

    // String + int -> String (Step 1)
    // Assign String value to String variable (Step 2)
    String s3 = "hello" + 13;
    System.out.println(s3);

    // String + boolean -> String
    s3 = s3 + true;
    System.out.println(s3);

    // ! 1. String method 1: equal() 
    // primitive has no tools, only one function, value storage ONLY
    // String is not a primitive. So String can store value and has tool
    String s4 = "hello";
    s4.equals("hello");
    System.out.println(s4.equals("hello")); // true, asking if s4 equals to "hello"
    System.out.println(s4.equals("male")); // false, asking if s4 equals to "male"

    System.out.println(1 + 1); // 2
    int r2 = 1 + 1;

    boolean result = s4.equals("hello");
    System.out.println(result); // true
    System.out.println(s4.equals("Hello")); // false, case sensitive

    // ! String method 2: length()
    // 參數 = parameter
    // length has no parameters
    System.out.println(s4.length()); // 5
    int s4Length = s4.length(); // ! 儲資料，因為係integer,所以儲落int
    System.out.println(s4Length); // 5
    double d1 = s4.length(); // ! why OK?
    // short s10 = s4.length(); // ! why NOT OK?

    // ! String Method 3: charAt()
    // 1 is an index, which always start with 0 -> 0係第一個position
    System.out.println(s4.charAt(1)); // e
    System.out.println(s4.charAt(0)); // h
    char c4 = s4.charAt(1);
    System.out.println(c4);

  }
  
}
