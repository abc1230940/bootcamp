import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    // A set of String
    // ! Diiference between ArrayList and HashSet
    // 1. ArrayList has ordering, while HashSet has not
    // 2. HashSet avoids duplicate elements, while ArrayList is able to store duplicated elements
    HashSet<String> strings = new HashSet<>();
    // Java allows "bypass" the returned value.
    strings.add("abc");
    strings.add("def");
    System.out.println(strings.size()); // 2

    System.out.println(strings.add("ijk")); // true -> hashset會return埋true/false俾你
    System.out.println(strings.size()); // 3

    // ! because "def" already exists in strings HashSet, we cannot add a duplicated object into HashSet
    System.out.println(strings.add("def")); // false
    System.out.println(strings.add("def")); // false
    System.out.println(strings.size()); // 3

    // ! HashSet has the most of the methods of ArrayList
    strings.remove("ijk");
    strings.isEmpty();
    strings.contains("abc");

    ArrayList<String> names = new ArrayList<String>();
    names.add("John");
    names.add("Peter");
    names.add("Peter");

    // ! ArrayList allows duplication of objects
    System.out.println("Size" + strings.size()); // 2

    // HashSet can remove the duplicated names by adding names into HashSet -> 不知有任何名的情況下都可以用
    HashSet<String> uniqueNames = new HashSet<>();
    for (String name : names) {
      uniqueNames.add(name);
    }
    // HashSet's toString()寫咗，可以直接出，不用寫toString
    System.out.println(uniqueNames); // [John, Peter]

    ArrayList<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat("Jennie"));
    cats.add(new Cat("Vincent"));
    cats.add(new Cat("Lucas"));
    cats.add(new Cat("Jennie"));

    // HashSet
    // add() -> call euqals() identified by the author to check if there are duplicated values
    HashSet<Cat> newCats = new HashSet<>();
    for (Cat cat : cats) {
      newCats.add(cat); // ! add() -> equals() and hashCode()
    }
    System.out.println(newCats);

    // 1. true / false
    boolean foundDuplicated = false;
    for (Cat cat : cats) {
      if (!newCats.add(cat)) {
        foundDuplicated = true;
        break;
      } 
    }
    System.out.println(foundDuplicated);

    // 2. Has ordering, remove duplicated
    HashSet<Cat> catset = new HashSet<>();
    ArrayList<Cat> orderedCats = new ArrayList<>();
    for (Cat cat : cats) {
      if (catset.add(cat)) {
        orderedCats.add(cat);
      }
    }
    System.out.println(orderedCats);

    }
  }
  


