import java.time.LocalDate;
import java.util.Objects;

public class Cat extends Animal {
  private String name;

  public Cat() {

  }

  public Cat(String name, LocalDate dob) {
    super(dob);
    this.name = name;
    
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Cat)) {
      return false;
    }
    Cat cat = (Cat) obj;
    return this.name.equals(cat.getName());
  }

  public String toString() {
    return ("Cat(" + "name=" + this.name + ",dob=" + super.getDob() +")");  //! 如果想直接用.dob 在Animalattribute 轉public就得，但一定唔會用
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  // for fun -> 不會無啦啦compareString的長度
  // MEthod Signature (Override): Return Type + Method name + arguments ("int" compareTo (Cat cat)"
  // Method Signature (Polymorphism) : Method name + arguments -> "compareTo(Cat cat)" -> 要Animal animal先一樣
  public int compareTo(Cat cat) { // 我自己的定義
    if (this.name.length() == cat.getName().length()) {
      return 0;
    } 
    return this.name.length() > cat.getName().length() ? 1 : -1;
  }
  
  public static void main(String[] args) {
    Cat c1 = new Cat();
    Cat c2 = new Cat();
    System.out.println(c1.compareTo(c2)); // -1
    System.out.println(c2.compareTo(c1)); // 1
  }
}
