import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle(double base, double height, String color) {
    super(color);
    this.base = base;
    this.height = height;
  }

  public void setBase(double base) {
    this.base = base;
  }
  public void setHeight(double height) {
    this.height = height;
  }

  public double getBase() {
    return this.base;
  }
  public double getHeight() {
    return this.height;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.base * this.height)
            .divide(BigDecimal.valueOf(2.0), 2, RoundingMode.HALF_UP)
              .doubleValue();
  }
  
}
