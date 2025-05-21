import java.util.ArrayList;

public class Zoo {
  private ArrayList<Animal> animals;
  private ArrayList<Cat> cats;

  public Zoo() {
    this.animals = new ArrayList<>();
    this.cats = new ArrayList<>();
  }

  public void add(Animal animal) {
    this.animals.add(animal);
  }

  public void add(Cat cat) {
    this.cats.add(cat);
  }

  public static void main(String[] args) {
    Zoo z1 = new Zoo();
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Cat());
    animals.add(new Lion());
    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat());
    cats.add(new Cat());
    // cats.add(new Lion());
    
  }
}
