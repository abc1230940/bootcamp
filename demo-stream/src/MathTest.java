import java.util.ArrayList;
import java.util.function.Consumer;

public class MathTest {
  public static void main(String[] args) {
    MathOperation addition = (x, y) -> x + y;
    System.out.println(addition.operate(10, 7));

    MathOperation multiplication = (x, y) -> x * y;
    System.out.println(multiplication.operate(5, 6));

    MathOperation substraction = (x, y) -> x - y;
    System.out.println(substraction.operate(10, 3));
    
    MathOperation division = (x, y) -> x / y;
    System.out.println(division.operate(10, 2));

    MathOperation rectangularArea = (length, width) -> length * width;

    MathOperation triangularArea = (base, height) -> base * height / 2;
    System.out.println(triangularArea.operate(5, 10));

    MathOperation pythagorean = (a, b) -> (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println(pythagorean.operate(3, 4));

    // for-each
    ArrayList<Child> childs = new ArrayList<>();
    childs.add(new Child("John"));
    childs.add(new Child("Peter"));
    childs.add(new Child("Steven"));

    // ! for-each
    for (Child child : childs) {
      System.out.println("Child: " + child.getName());
    }

    // ! for-each lambda -> 用到consumer -> 一個新式的for-each寫法，最緊要係識睇，總之跟大圍寫就得
    // Consumer<Child> printName = child -> System.out.println("Child: " + child.getName());
    // childs.forEach(printName);
    childs.forEach(child -> {
      // insert into Database
      child.walk();
      child.drink();
      System.out.println("Child: " + child.getName());
    });

  }

}
