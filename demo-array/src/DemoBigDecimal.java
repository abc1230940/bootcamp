import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // double + double
    System.out.println(0.1 + 0.2); // 0.30000000000000004

    // Solution -> Big Decimal能夠解決double出好多小數點的問題
    BigDecimal bd1 = new BigDecimal("0.1"); // Approach 1
    BigDecimal bd2 = BigDecimal.valueOf(0.2); // Approach 2 -> preferable

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
    BigDecimal bd12 = bd10.divide(bd11, 2, RoundingMode.HALF_UP);
    System.out.println(bd12);

  }
  
}
