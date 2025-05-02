public class Panda extends Animal{
  private int age;

  public Panda(String name, int age) {
    super(name);
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public boolean equals(Panda panda) {
    return super.getName().equals(panda.getName()) && this.age == panda.getAge();
  }

  public String toString() {
    return ("Panda(" + "name=" + super.getName() + ",age=" + this.age + ")");
  }

  @Override
  public void sound() {
    System.out.println("Hahaha...");
  }

  public static void main(String[] args) {
    Panda p1 = new Panda("Tom", 15);
    System.out.println(p1); // Panda(name=Tom,age=15)
    Panda p2 = new Panda("Suki", 18);
    System.out.println(p1.equals(p2)); // false
  }
}
