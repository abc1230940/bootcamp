public class DemoPolyphorphism {
  public static void main(String[] args) {
    // I -> Inheritance ( extends)
    // A -> Abstraction (implements)
    // P -> Polymorphism (Parent Class / Interface)
    // E -> Encapsulation (Getter/ Setter for private variable), Library封裝bookshelf, 佢地的方法

    // ! 1. parent class
    Animal a1 = new Dog("Peter");
    // Dog d1 = a1; -> Why error? type unsafe
    Animal a2 = new Cat("Kitty", 10);

    // ! Java compile time: Method readability based on object type of "object reference"
    // a1.bark(); -> animal 沒有bark
    System.out.println(a1.getName()); // Animal.class has getName(), Cat and Dog also have getName()
    // ! Compile-time: Animal has sound(), Cat / Dog also have sound()
    // ! Run-time Found the object is Dog, so the result "wow wow"
    a1.sound();
    a2.sound();

    // ! how to eliminate the risk? we can use instanceof to check type of object
    if (a1 instanceof Dog) {
      Dog d1 = (Dog) a1; // force conversion (downcast) - risky -> 夾硬將個object被指住去d1
      d1.bark();
    } else if (a1 instanceof Cat) {
      Cat c1 = (Cat) a1; // force conversion (downcast) - risky -> 夾硬將佢變貓，係想call貓的東西
    }

    // 2. Interface -> 作用：能夠限制object的性能
    Flyable superman = new Superman("John"); // ! 只能call到Flyable interface裡面的方法, Flyable能夠限制object的性能->可以睇得更快
    superman.fly();
    // superman.eat();
    // superman.drink();
    
    // Example (Account)
    // Use Polymorphism to create objects
    Account ac = new PersonalAccount();
    // ac.getBalance();
    ac.getCurrentAccount().credit(500.0);
    ac.getSavingAccount().credit(1523.5);
    System.out.println(ac.getCurrentAccount().getBalance());
    if (ac instanceof PersonalAccount) {
      PersonalAccount pa = (PersonalAccount) ac;
    }

    SubAccount sa = SavingAccount.OfHKD();
    sa.credit(2000.0);
    sa.getBalance();

    // Example (Shape) -> Parent Class 同 Child class都有共同的方法
    // Polymorphism
    
    int x = 100;
    Shape shape;
    if (x > 50) {
      shape = new Circle(22.5, "RED");
    }
      shape = new Rectangular("BLUE", 15.5, 20.5);
    


    // 呢段code在設計上要考慮，要搵晒所有common的方法，咁之後就咁加返新形狀在上面，都可以用返同一樣的方法
    double area = shape.area();
    // ! area() is a common method for Circle and Rectangular 
    if (area > 10) {
      System.out.println("Area=" + area);
    } else {
      System.out.println("It is a small shape");
    }
  

    // ! 不確定是什麼，不安全
    // s1.getRadius();

    // getRadius() -> 只有圓形先有
    // getWidth(), getLength() - > 長方形先有
    // 好少會出現
    if (shape instanceof Circle) {
      Circle circle = (Circle) shape;
      System.out.println(circle.getRadius());
    } else if (shape instanceof Rectangular) {
      Rectangular rectangular = (Rectangular) shape;
      rectangular.getLength();
      rectangular.getWidth();
    }


      // ! number -> abstract class of int, long, byte, short
      Number number = Long.valueOf(3);
      number = Integer.valueOf(10);
      number = Byte.valueOf("7");
      number = Short.valueOf("8");
      number = Double.valueOf(3.9);
      number = Float.valueOf("8.4");

      long value = number.longValue(); // 8.4 -> 8 downgrade之後會變咗咁
      System.out.println(value); // 8
      double value2 = number.doubleValue();
      System.out.println(value2);

      // floating point issue , 由float轉double因memorz上出現問題
      double d1 = 8.4f;
      System.out.println(d1);

      // Real world: Use int for Integer and double for decimal place

  }
}

    
  
    
    
    

