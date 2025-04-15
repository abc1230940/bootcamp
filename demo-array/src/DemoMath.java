import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    // abs
    // pow

    // int -> double (safe -> auto-conversion)
    double result = Math.pow(2.0, 3);
    System.out.println(result); //8.0

    // square root
    System.out.println(Math.sqrt(81)); // 9.0

    System.out.println(Math.abs(-3.0)); // 3.0
    // double result2 = 0.0;
    // if (value < 0) {
    // result = value * -1;
    // } else 
    // result2 = value
    // }
    // 不會用，直接用Math.abs()

    // random -> 隨機整個0-1的數 -> 透過*100, 就會變成0-100的數
    System.out.println(Math.random());

    // ! 較好用random的整數
    System.out.println(new Random().nextInt(3)); // 0-2
    System.out.println(new Random().nextInt(3) + 1); // 1-3

    // 0 - 48
    // 1 - 49
    System.out.println(new Random().nextInt(49) + 1); // 1 - 49 -> 會有機會出重覆的數

    // Generate 6 numbers between 1 - 49
    int[] marksix = new int[6];
    int k = 0;
    while (k < 6) {
       marksix[k] = new Random().nextInt(49) + 1;
       k++;
    }

    // Generate 6 different numbers between 1 - 49
    int[] marksix2 = new int[6];
    int uniqueCount = 0;
    boolean isDuplicated = false;
    while (uniqueCount < 6) {
      int generatedValue = new Random().nextInt(49) + 1;
      // ! Check if generated value is already in the array -> isDuplicated
      // code .. for loop + if
      isDuplicated = false; // 要reset做false先
      for (int i = 0; i < marksix2.length; i++) {
        if (generatedValue == marksix2[i]) {
          isDuplicated = true;
          break; // 如果係true, 就不會做下面的步驟
        } 
      }

      if (!isDuplicated) {
        marksix2[uniqueCount] = generatedValue;
        uniqueCount++;
      }
      
    }
    System.out.println(Arrays.toString(marksix2)); // ! 記
    
    
  } 
  
}
