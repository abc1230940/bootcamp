public class Animal { // more abstract -> Parent Class
  // Cat.java, Dog.java -> Child Class

  // ! Common attributes for Cat and Dog
  private String name;
  // private int age;
  private Cat cat;
  private Dog dog;
  private Panda panda;

  // Constructor cannot be inherited
  public Animal(String name) {
    this.name = name;
    // this.age = age;
  }

  // method can be inherited
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sound() {
    System.out.println("defalt sound...");
  }

  public static void main(String[] args) {
     Animal a1 = new Animal("John");
     System.out.println(a1.getName());
     a1.setName("Sally");
     System.out.println(a1); // Sally

    Cat c1 = new Cat("Peter", 20);
    System.out.println(c1.getName()); // Cat繼承咗Animal的method
    c1.setAge(18);
    System.out.println(c1.getAge());


  }
  
}
