import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String toString() {
    return ("Person(" + "name=" + this.name + ",age=" + this.age + ")");
  }

  public static class SortedByAge implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
      if (p2.getAge() > p1.getAge()) {
        return 1;
      }
      if (p2.getAge() == p1.getAge()) {
        return p2.getName().compareTo(p1.getName());
      }
      return -1;
      }
      
}

// Collections.sort(persons) -> loop persons -> each person.compareTo()
// You prepare program C. Java prepared program B (Collections.sort) 

  public static void main(String[] args) {
    // Sorted by age, decending order
    // Sorted by name, ascending order 

    Person p1 = new Person("Mary", 18);
    Person p2 = new Person("Peter", 39);
    Person p3 = new Person("Kitty", 39);
    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    persons.add(p3);

    Collections.sort(persons, new SortedByAge());
    System.out.println(persons);
  }
}
