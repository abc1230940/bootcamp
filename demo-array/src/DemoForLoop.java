import java.math.BigDecimal;
import java.util.Arrays;

public class DemoForLoop {
  public static void main(String[] args) {
    // array + for loop
    // find max
    int max = Integer.MIN_VALUE;
    int[] arr = new int [] {100, -20, 200, 17};
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      } else {
        continue;
      }
    }
    System.out.println(max); // 200

    // Approach
    max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }
    System.out.println(max); // 200

    // equals(), length(), charAt()
    
    // ! convert from string to char array
    char[] chs = "hello".toCharArray();
    System.out.println(Arrays.toString(chs)); // [h, e, l, l, o]

    // convert l to x and a to b
    // "hello" -> "hexxo"
    // ! 這個方法更快, 一個for loop同時做緊嘢種東西
    char[] chs2 = "hello".toCharArray(); 
    for (int i = 0; i < chs2.length; i++) {
      if (chs2[i] == 'l') {
        chs2[i] = 'x';
      } else if (chs2[i] == 'a') {
        chs2[i] = 'b';
      }
    }
    System.out.println(Arrays.toString(chs2)); // [h, e, x, x, o]
    // ! convert from char[] to String
    System.out.println(String.valueOf(chs)); // "hexxo"

    System.out.println("hello".replace('l', 'x')); // ! hexxo -> 但呢個工具只係換一個char, 但比較慢，如果replace 2
    
    System.out.println("hello".equals("Hello")); // false
    System.out.println("hello".equalsIgnoreCase("Hello")); // true
    System.out.println("hello".equalsIgnoreCase("Helloa")); // false

    double[] values = new double[] {0.2, 0.5, 1.9};
    // double[] newValues = new double[3];
    // add 0.1
    // result [0.3, 0.6, 2.0]
    // BigDecimal只係工具，就是可以.add, .subtract, .multiply
    for (int i = 0; i < values.length; i++) {
       values[i] = BigDecimal.valueOf(values[i])
           .add(BigDecimal.valueOf(0.1))
           .doubleValue();
    }
    System.out.println(Arrays.toString(values));

    // BigDecimal可以成為一個array, 但要跟返bigDecimal的格式
    BigDecimal[] bigDecimals = new BigDecimal[3];
    bigDecimals[0] = BigDecimal.valueOf(2);
    bigDecimals[1] = BigDecimal.valueOf(3.0);
    bigDecimals[2] = BigDecimal.valueOf(4.5);

    System.out.println(Arrays.toString((bigDecimals))); // [2, 3.0, 4.5]

    float[] fArr = new float[bigDecimals.length]; // 可以直接寫佢個長度, 因為係抄寫
    for (int i = 0; i < bigDecimals.length; i++) {
      fArr[i] = bigDecimals[i].floatValue(); 
    }
    System.out.println(Arrays.toString(fArr));

  }
  
}
