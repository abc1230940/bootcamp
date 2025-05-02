public class Zoo {
  private Animal[] animals;

  public Zoo() {
    this.animals = new Animal[3];
  }

  public void setAnimals(Animal[] animals) {
    this.animals = animals;
  }

  public Animal[] getAnimals() {
    return this.animals;
  }

  public Animal getAnimal(String name) {
    for (int i = 0; i < animals.length; i++) {
      if (animals[i] != null && animals[i].getName().equals(name)) {
        return animals[i];
      }
    }
    return null;
  }

  // Dog, Cat, Panda
  public void getAnimal2(Class<?> clazz) {
    for (int i = 0; i < animals.length; i++) {
      if (animals[i] != null && animals[i].getClass() == clazz) {
        System.out.println(animals[i].getName());
      }
    }
  }



  public static void main(String[] args) {
    Zoo z1 = new Zoo();
    Animal[] animals = new Animal[] {new Cat("John", 12), new Dog("Mary"),
        new Panda("Tom", 15)};
    z1.setAnimals(animals);
    z1.getAnimal("John").sound();
    z1.getAnimal("Mary").sound();
    z1.getAnimal("Tom").sound();

    z1.getAnimal2(Dog.class);

  }
}
