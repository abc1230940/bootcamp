import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // double + double
    System.out.println(0.1 + 0.2); // 0.30000000000000004

    // Solution -> Big Decimal能夠解決double出好多小數點的問題，仲有float
    BigDecimal bd1 = new BigDecimal("0.1"); // Approach 1 -> 但數字上不受限制
    BigDecimal bd2 = BigDecimal.valueOf(0.2); // ! Approach 2 -> preferable

    System.out.println(bd1);
    System.out.println(bd2);

    // ! bd1 + bd2 -> 0.3 非primitive, 不能+, >, <
    BigDecimal bd3 = bd1.add(bd2); // big decimal的工具
    System.out.println(bd3); // 0.3
    System.out.println(bd1); // 0.1
    System.out.println(bd2); // 0.2

    // ! subtract()
    BigDecimal bd4 = BigDecimal.valueOf(0.3);
    BigDecimal bd5 = BigDecimal.valueOf(0.1);
    BigDecimal bd6 = bd4.subtract(bd5);
    System.out.println(bd6);

    // ! multiply
    BigDecimal bd7 = BigDecimal.valueOf(0.2);
    BigDecimal bd8 = BigDecimal.valueOf(0.3);
    BigDecimal bd9 = bd7.multiply(bd8);
    System.out.println(bd9);

    // ! divide
    // 10 / 3
    // rounding? 3.45 -> 3.4 (HALF_DOWN)? -> 斬開 3.45 -> 3.5 (HALF_UP)? 4捨5入
    BigDecimal bd10 = BigDecimal.valueOf(10);
    BigDecimal bd11 = BigDecimal.valueOf(3);

    // ! BigDecimal divides BigDecimal, 不是primitive就是object, 寫法要記
    BigDecimal bd12 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3.0), 2, RoundingMode.HALF_UP);
    System.out.println(bd12); // 3.33
    
    BigDecimal bd13 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0), 1, RoundingMode.HALF_UP);
    System.out.println(bd13); // 4.3
    BigDecimal bd14 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0), 1, RoundingMode.HALF_DOWN);
    System.out.println(bd14); // 4.2
    // BigDecimal 不能support除唔盡的數，X 3.333333 ok 2.5, 所以會有Non-terminating decimal expansion

    BigDecimal bd15 = new BigDecimal("5").divide(BigDecimal.valueOf(2)); // 用唔同寫法都得，但一定要BigDecimal / BigDecimal
    System.out.println(bd15); // 2.5

    // ! absolute value -> .abs()
    System.out.println(BigDecimal.valueOf(-2).abs()); // 2
    // ! Power of
    System.out.println(BigDecimal.valueOf(2).pow(3)); // power只能放int, 少用
    // ! change to other primitive
    BigDecimal source = BigDecimal.valueOf(2); // 不停用這個BigDecimal去轉換為不同的primitive
    double result = source.doubleValue();
    int result2 = source.intValue();
    double result3 = source.floatValue(); // float value精度低過double, 所以咁樣assign係安全的，調返轉唔得
    long result4 = source.longValue();
    String result5 = source.toString(); // "2"

  }
  
}
