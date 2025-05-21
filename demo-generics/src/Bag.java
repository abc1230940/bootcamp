import java.util.ArrayList;

// ! Write less code (Bag2(LifeGood), Bag3(Food), Bag4(Water))
// ! 但係不十分常用，因為好多時冇需要特別開多條ArrayList專門俾那一個class, 通常都係大雜燴咁就最好
public class Bag<T extends LifeGood> {
  private ArrayList<T> things; // Water and Food

  public Bag() {
    this.things = new ArrayList<>();
  }

  public void add(T thing) {
  this.things.add(thing);
  }

  // ! Generics for static method -> 非形容object
  // ! U extends LifeGood -> 只可以放LifeGood中的東西
  // 任何東西不涉及object的東西都能夠用到這個方法
  public static <T extends LifeGood> void addTwoThings(Bag<T> bag, T LifeGood1, T LifeGood2) {
    bag.add(LifeGood1);
    bag.add(LifeGood2);
  }

  public static void main(String[] args) {
    Bag<Food> bag1 = new Bag<>();
    Bag<Water> bag2 = new Bag<>();
    Bag<LifeGood> bag3 = new Bag<>();

    // Bag<Object> bag4 = new Bag<>();

    // If we don't have generics in java
    Bag2 lifegoodBag2 = new Bag2();

    Bag<LifeGood> newBag = new Bag<>();
    Bag.addTwoThings(newBag, new Food(), new Water());
    System.out.println(newBag);

  }
}
