import java.math.BigDecimal;

public class TestNumber {
  public static void main(String[] args) {
    // 
    // float 0.6f -> String
    float num = new BigDecimal("0.6").add(new BigDecimal("0.1")).floatValue();
    System.out.println(num);

    // double + double
    double num2 = 0.6d + 0.1f;
    System.out.println(num2);
  }
}
