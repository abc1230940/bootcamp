import java.math.BigDecimal;

public class Circle extends Shape { // concrete class extend abstract class -> end abstract method
  private double radius;

  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  @Override // 
  public double area() {
    return BigDecimal.valueOf(this.radius)
            .multiply(BigDecimal.valueOf(this.radius))
            .multiply(BigDecimal.valueOf(Math.PI))
              .doubleValue();
  }


}
