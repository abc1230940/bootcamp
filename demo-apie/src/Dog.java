public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  public boolean equals(Dog dog) {
    return super.getName().equals(dog.getName());
  }
  public String toString() {
    return ("Dog(" + "name=" + super.getName() + ")");
  }

  @Override
  public void sound() {
    System.out.println("Woof...");
  }

  public void bark() {
    System.out.println("barking!!!!");
  }
  
  public static void main(String[] args) {
    Dog d1 = new Dog("Steven");
    System.out.println(d1.toString());
    Dog d2 = new Dog("Lucas");
    System.out.println(d1.equals(d2));
  }
}
