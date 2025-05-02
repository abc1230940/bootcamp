public class DemoPolyphorphism {
  public static void main(String[] args) {
    // I -> Inheritance ( extends)
    // A -> Abstraction (implements)
    // P -> Polymorphism (Parent Class / Interface)
    // E -> Encapsulation (Getter/ Setter for private variable), Library封裝bookshelf, 佢地的方法

    Animal a1 = new Dog("Peter");
    // Dog d1 = a1; -> Why error? type unsafe
    Animal a2 = new Cat("Kitty", 10);

    // ! Java compile time: Method readability based on object type of "object reference"
    // a1.bark();
    System.out.println(a1.getName()); // Animal.class has getName(), Cat and Dog also have getName()
    // ! Compile-time: Animal has sound(), Cat / Dog also have sound()
    // ! Run-time Found the object is Dog, so the result "wow wow"
    a1.sound();
    a2.sound();

    // ! how to eliminate the risk? we can use instanceof to check type of object
    if (a1 instanceof Dog) {
      Dog d1 = (Dog) a1; // force conversion (downcast) - risky
      d1.bark();
    } else if (a1 instanceof Cat) {
      Cat c1 = (Cat) a1; // force conversion (downcast) - risky
    }
    
  }
}
