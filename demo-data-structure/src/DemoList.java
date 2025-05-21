import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    // ArrayList<Bird> birds = new ArrayList<>();
    List<Bird> birds = new ArrayList<>();

    // List interface has a set of methods to be implemented
    System.out.println(birds.isEmpty()); // ->基於polymorphism, compile time -> 跟interface, runtime時會call返ArrayList的isEmpty()

    // Because ArrayList implements List, so we know ArrayList must contains add() method
    birds.add(new Bird("John", null));

    // ! Why we use List<Bird> as object reference type?
    birds = new LinkedList<>(birds); // 一條list內容可以倒返去新的list
    System.out.println(birds); // [Bird(name=John)]
    birds.add(new Bird("Vincent", null));
    System.out.println(birds.getLast().getName()); // Vincent

    LinkedList<Bird> manyBirds = new LinkedList<>();
    manyBirds.add(new Bird("Ricky", null));
    manyBirds.addFirst(new Bird("Jacky", null));
    System.out.println(manyBirds); // [Bird(name=Jacky), Bird(name=Ricky)]
    manyBirds.poll(); 
    System.out.println(manyBirds); // [Bird(name=Ricky)]
    manyBirds.push(new Bird("Tommy", null));
    System.out.println(manyBirds); // [Bird(name=Tommy), Bird(name=Ricky)]

    // ! usually we use List as type reference, until you want to use specific methods of the class
    // List<String> emails = new ArrayList<>();


    
  }
  
}
