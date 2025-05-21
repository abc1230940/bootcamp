import java.time.LocalDate;

public class Calculator {
  // Polymorphism (Static - Compile time)
  // Polymorphism (Dynamic - Runtime)

  // ! Method Signature (Polymorphism): Method name + Arguments "compareTo (Cat cat)"
  public int sum(int x, int y) {
    return x + y;
  }

  // because the arguments are different to the first method
  public double sum(double x, double y) {
    return x + y;
  }

  public static void main(String[] args) {
    new Calculator().sum(1.3, 1.3); // line 9 -> Java容許你同一個名但係不同parameter
    new Calculator().sum(1, 2); // line 5

    // ! Dynamic Polymorphism
    Animal animal = new Cat("John", LocalDate.of(2025, 2, 28));
    animal.getDob(); // ! Ok, because because getDob() belongs to Object "Reference type" (Animal.class)
    // animal.getName(); NOT OK

    // ! Runtime -> method implementation follows "Object Type" (Cat.class)
    System.out.println(animal.getDob());
  }
  
}
