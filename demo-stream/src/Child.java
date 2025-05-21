import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Child {
  private String name;

  public Child(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void walk() {
    System.out.println("I am walking...");
  }

  public void drink() {
    System.out.println("I am drinking...");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return ("Child(" + "name=" + this.name + ")");
  }

  // ! Static Nested Class
  public static class Ball {
    private int num;
  }

  // ! Inner Class
  public class Toy {
    private String code;
    @Override
    public String toString() {
      return "Child.Toy("
        + "code=" + this.code
        + ",name=" + name // ! Inner class is able to access Outer Class (Child) attributes
        + ")";
    }
  }

  public static void main(String[] args) {
    Child c1 = new Child("John");
    Child.Ball b1 = new Child.Ball();

    Child c2 = new Child("Peter");
    Child.Toy t1 = c2.new Toy();
    Child.Toy t2 = c2.new Toy();

    System.out.println(t1); // Child.Toy(code=null,name=Peter)
    c2.setName("Annie");
    System.out.println(t1); // Child.Toy(code=null,name=Annie)

    Walkable child  = new Walkable() {
        @Override
        public void walk() {
            System.out.println("I am child and walking...");
        }
    };

    child.walk();

    Drinkable child2 = new Drinkable() {
        @Override
        public void drink() {
            System.out.println("I am child2 and drinking...");
        }
    };

    child2.drink();

    // Java 8: Lambda Expression -> Interface只有一個method -> @FunctionalInterface
    // ! "Walkable child3" -> child3 only need to implement walk() method
    // ! Because you have only one method need to be implemented, so "() -> " must present walk() implementation
    Walkable child3 = () -> System.out.println("I am walking ...");
    child3.walk();

    // What if the method implementation has more than 1 line of code...
    Walkable child4 = () -> {
        System.out.println("I am child.");
        System.out.println("I am walking on the road");
    };
    child4.walk();

    //!有咩情況只會用一次個object而唔需要開class? -> 如果個個人都要用呢個object,當然開個class會更好

    // Living child5 = () -> {  // ! The target type of this expression must be a functional interfaceJava(553648781)
    // }; // ! Living 入面有2個method -> 即使extends另一個interface -> 都唔俾
    
  }
}
