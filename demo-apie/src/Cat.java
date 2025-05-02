import java.util.Arrays;
import java.util.Scanner;

// ! Attributes can be inherited
public class Cat extends Animal{
  // private String name;
  private int age;

  // ! Constructor cannot be inherited
  public Cat(String name, int age) {
    // ! super (parent的意思)
    super(name); // ! calling parent's class constructor -> Animal的constructor
    this.age = age;
  }

  // public void setName(String name) {
    //this.name = name;
  // }
   public void setAge(int age) {
     this.age = age;
   }

  // public String getName() {
    // return this.name;
  // }
   public int getAge() {
     return this.age;
   }

  public boolean equals(Cat cat) {
    return super.getName().equals(cat.getName()) && this.age == cat.getAge();
  }

  public String toString() {
    return ("Cat(" + "name=" + super.getName() + ",age=" + this.age + ")");
  }

  // Child class can override the parent class method
  public void sound() {
    System.out.println("Meow...");
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("Jonh", 10);
    System.out.println(c1.getName()); // John
    // c1.setName("Peter");
    System.out.println(c1.getName()); // Peter
    Cat c2 = new Cat("Peter", 10);
    System.out.println(c1); // Cat(name=Peter,age=10)
    System.out.println(c2);
    System.out.println(c1.equals(c2)); // true
    System.out.println(c1 == c2); // false

    Scanner scanner = new Scanner(System.in);
    String[] catNames = new String[5]; // default value: [null,null,null,null,null] -> String value
    int idx = 0;
    while(true) { // 開一個loop永遠唔停
      System.out.println("Please name the Cat:");
      String input = scanner.nextLine();
      boolean found = false;
      for (int i = 0; i < idx; i++) {
        if (catNames[i].equals(input)) {
          found = true;
          break;
        }
      }
      if (found) {
        System.out.println("The cat name " + input + " alrady exists.");
        continue; // goes to while loop
      } else {
        catNames[idx++] = input;
      }
      // check exit condition
      if (idx >= catNames.length) {
        break;
      }
    
  }
  scanner.close();
  System.out.println(Arrays.toString(catNames));

}

}

