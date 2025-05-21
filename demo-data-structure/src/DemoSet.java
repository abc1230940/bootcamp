import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoSet {
  public static void main(String[] args) {
    Set<Cat> cats = new HashSet<>();
    cats.add(new Cat("John"));
    cats.add(new Cat("Jacky"));
    cats.add(new Cat("John"));
    System.out.println(cats);

    ArrayList<ArrayList<String>> strings = new ArrayList<>();
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");

    ArrayList<String> names = new ArrayList<>();
    names.add("John");
    names.add("Peter");
    strings.add(fruits);
    strings.add(names);
    System.out.println(strings.get(0)); // fruit list
    System.out.println(strings.get(1)); // name list
    // 好難搵到自己想要的東西

    Map<String, ArrayList<String>> map = new HashMap<>();
    map.put("Fruits", fruits);
    map.put("Names", names);
    System.out.println(map.get("Names")); // [John, Peter]

    // Floor, 
    Map<String, Map<String, ArrayList<String>>> building = new HashMap<>();

    ArrayList<String> p1a = new ArrayList<>(List.of("John", "Peter"));
    ArrayList<String> p1b = new ArrayList<>(List.of("Sally", "Tommy"));

    ArrayList<String> p2a = new ArrayList<>(List.of("ABC", "DEF"));

    ArrayList<String> p3a = new ArrayList<>(List.of("IJK", "XYZ"));
    ArrayList<String> p3b = new ArrayList<>(List.of("OPQ", "RST"));
    ArrayList<String> p3c = new ArrayList<>(List.of("KLJ", "OOO"));

    Map<String, ArrayList<String>> floor1 = new HashMap<>();
    floor1.put("PA", p1a);
    floor1.put("PB", p1b);

    Map<String, ArrayList<String>> floor2 = new HashMap<>();
    floor2.put("PA", p2a);

    Map<String, ArrayList<String>> floor3 = new HashMap<>();
    floor3.put("PA", p3a);
    floor3.put("PB", p3b);
    floor3.put("PC", p3c);

    building.put("FLOOR1", floor1);
    building.put("FLOOR2", floor2);
    building.put("FLOOR3", floor3);

    System.out.println(building.get("FLOOR3").get("PB")); // [OPQ, RST]

    ArrayList<ArrayList<String>> lines = new ArrayList<>();
    lines.add(p1a);
    lines.add(p1b);
    lines.add(p2a);
    lines.add(p3a);
    lines.add(p3b);
    lines.add(p3c);
    // Not good for retrieving data
    lines.get(4); // we do not know the target data location.
    // ArrayList is for ordering data.

    // Dog, Cat
    // 指針只係指住Animal, 不能夠中途換Cat / Dog
    ArrayList<Animal> animals = new ArrayList<>(); // 咁樣做會sacrifice咗child class的methods
    // animals = new ArrayList<Cat>();
    animals.add(new Dog(12));
    animals.add(new Cat("John"));
    for (Animal animal : animals) {
      if (animal instanceof Cat) {
        System.out.println(((Cat) animal).getName()); // 所以要夾硬將佢變返
      } else if (animal instanceof Dog) {
        System.out.println(((Dog) animal).getAge());
      }    
    } 

    ArrayList<Cat> cats2 = new ArrayList<>();
    cats2.add(new Cat("Peter"));
    
    // ! Generics
    // The definition of arraylist can be ArrayList<Cat>, ArrayList<Dog>, ArrayList<Animal> -> 能夠指向arrayList的可能性
    // ! Difference between ArrayList<? extends Animal> and ArrayList<Animal>
    // ! It’s used when you want to read elements as Animal without knowing the exact subtype.
    // ! 可以隨時換成其他Class的List都得
    ArrayList<? extends Animal> animal3 = new ArrayList<Cat>(); // "? extends 可能係Cat /Dog"
    ArrayList<? extends Animal> animal4 = new ArrayList<Dog>();
    ArrayList<? extends Animal> animal5 = new ArrayList<Animal>();
    animal3 = new ArrayList<Dog>();
    animal3 = new ArrayList<Animal>();
    
    
    
    // Scenario 1:
    // 2 Cat List or 1 Dog List
    // 如果手頭上只有catlist / 只有doglist, 都可以用呢個方法
    // 不過其實都好少用，只係可睇得明source code的方法
    Map<String, ArrayList<? extends Animal>> map1 = new HashMap<>();

    // Convenient for write data -> 放咩list都得
    ArrayList<Cat> catlist1 = new ArrayList<>();
    catlist1.add(new Cat("Ken"));
    catlist1.add(new Cat("Oscar"));

    map1.put("cat1", catlist1);

    ArrayList<Dog> doglist1 = new ArrayList<>();
    doglist1.add(new Dog(10));
    doglist1.add(new Dog(99));

    map1.put("dog1", doglist1);

    // Data Retrieval (read -> No obvious advantages) -> 都係要夾硬將佢放變Cat / Dog
    for (Animal animal : map1.get("cat1")) {

    }


    // Scenario 2:
    // many animal list -> every list contain cat and dog
    ArrayList<Animal> animals1 = new ArrayList<>();
    animals1.add(new Cat("Peter"));
    animals1.add(new Dog(12));
    ArrayList<Animal> animals2 = new ArrayList<>();
    animals2.add(new Cat("Mary"));
    animals2.add(new Dog(13));
    Map<String, ArrayList<Animal>> animalMap = new HashMap<>();

    // ! Animal is the parent of Cat (OK)
    // ! but ArrayList<Animal> IS NOT the parent of ArrayList<Cat> -> 2樣嘢嚟，不要將佢變成係一樣的東西(非常重要)
    // catMap2.put

  }
  
}
