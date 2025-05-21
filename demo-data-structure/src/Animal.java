import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Animal implements Comparable<Animal>{
  private LocalDate dob;

  public Animal() {

  }

  public Animal(LocalDate dob) {
    this.dob = dob;
  }

  public LocalDate getDob() {
    return this.dob;
  }

  @Override
  public int compareTo(Animal animal) {
    return this.dob.isAfter(animal.getDob())? -1 : 1;
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("John", LocalDate.of(2024, 6, 5));
    Cat c2 = new Cat("Peter", LocalDate.of(2024, 7, 5));
    Cat c3 = new Cat("Lucas", LocalDate.of(2024, 6, 30));

    List<Cat> cats = new ArrayList<>(List.of(c1, c2, c3));
    Collections.sort(cats); // Animal有cmparable這個技能，仔女都會有技能可以有人comparable -> 必須要在Animal裡面寫Override CompareTo這個技能 .sort會call compareTo, 如果animal 沒有implements comparable, 咁佢地個仔女都唔會有，如果呀媽整走咗comparable, 仔女便沒有
    System.out.println(cats); //! 問題：如果沒有寫override其實會係點？

  }
}



  
