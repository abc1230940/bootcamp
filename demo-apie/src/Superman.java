// Fly
// Eat
// Class signiture: extends and implements
public class Superman extends Human implements Living, Flyable {
  private String name; // ! Incorrect design

  public Superman(String name) {
    this.name = name;
  }

  @Override
  public void eat() {
    System.out.println("I am eating...");
  }

  @Override
  public void fly() {
    System.out.println("I am flying...");
  }

  @Override
  public void sleep() {
    System.out.println("I am sleeping...");
  }

  @Override
  public void drink() {
    System.out.println("I am drinking water...");
  }

  @Override 
  public String getName() {
    return this.name;
  }

  public void getSecondName() {
    return super.getName();
  }

  public 

  public static void main(String[] args) {
    Superman s1 = new Superman("John");
    System.out.println(s1.getName()); // John
  }
}
