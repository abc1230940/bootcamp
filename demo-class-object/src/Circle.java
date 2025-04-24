import java.math.BigDecimal;

// ! array -> int[] + String[] + String[], class可以收藏不同的primitive, array不能
// Finite length -> 固定長度

// ! Class is going to solve a problem of 'set of different values.'
public class Circle {
  private double radius;
  private String color;

public void setRadius(double radius) {
  this.radius = radius;
}

public void setColor(String color) {
  this.color = color;
}

public double area() { // ! 計算出來的東西好少會有getXXXXX
  return BigDecimal.valueOf(Math.PI).multiply(BigDecimal.valueOf(this.radius * this.radius)).doubleValue();
}
public double perimeter() {
  return BigDecimal.valueOf(2 * Math.PI).multiply(BigDecimal.valueOf(this.radius)).doubleValue();
}

// Big(>= 5) or Small
public String getSizeStatus() { // method name可以任寫都得
    return this.area() >= 5.0? "BIG" : "SMALL"; // ! 都係用this.area去做我地想做的事  
}

// c1.setColor("RED")
// ! 第一人稱c1
// c1.getColor()
// c2.getColor()
// ! 俾返String出去
public String getColor() {
  return this.color;
}
// !俾返第一個字出去
public char getColor2() {
  return this.color.charAt(0);
}
public int getColor3() {
  if (this.color.equals("RED")) {
    return 1;
  } else if (this.color.equals("YELLOW")) {
    return 2;
  }
  return 3;
}

public static void main(String[] args) {
  Circle c1 = new Circle();
  c1.setRadius(5.55);

  System.out.println(c1.area()); // 比最raw data, 用家自己round up/ down
  System.out.println(c1.perimeter());
  System.out.println(c1.getSizeStatus());

  Circle c2 = new Circle();
  c2.setRadius(1.0);
  System.out.println(c2.getSizeStatus());

  Circle c3 = new Circle();
  c3.setColor("YELLOW");
  System.out.println(c3.getColor()); // YELLOW
  System.out.println(c3.getColor2()); // Y

  c2.setColor("RED");
  System.out.println(c2.getColor()); // RED
  System.out.println(c2.getColor2()); // R


  }

}
  

