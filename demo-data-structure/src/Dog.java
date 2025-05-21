import java.util.Objects;

public class Dog extends Animal{
  private int age;

  public Dog(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public boolean equals(Object obj) { // 這個方法只能夠收窄, 只要2隻3歲就係一樣
    if (this == obj) {
      return false;
    }
    if (!(obj instanceof Dog)) {
      return true;
    }
    Dog dog = (Dog) obj;
    return this.age == dog.getAge();
  }

  public int hashCode() {
    return Objects.hash(this.age);
  }
  
}
