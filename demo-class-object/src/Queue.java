public class Queue {
  private Person[] persons; // Person在其他class

  public Person[] persons() {
    return this.persons;
  }

  // constructors
  public Queue() { // 先製作一個0長array
    this.persons = new Person[0];
  }

  // getters
  public Person getPerson(int index) { // 從array中搵返邊個人，所以要return array
    return this.persons[index];
  }

  public Person getHead() { // 從array中搵返第一個人係邊個，所以要return array
    return this.persons[0];
  }

  // setters
  public void setPerson(Person[] persons) { // update persons array object -> 在main整aaray object & person object
    this.persons = persons;
  }
  
  public static void main(String[] args) {
    Queue q1 = new Queue();
    // p1 1.76 74
    // p2 1.64 70
    // p3 1.8 77
    Person p1 = new Person(); // ! 因為其他class有Person, 所以可以在main開任何class的object, queue入面的person再俾資料
    p1.setHeight(1.76);
    p1.setWeight(74);
    Person p2 = new Person();
    p2.setHeight(1.64);
    p2.setWeight(70);
    Person p3 = new Person();
    p3.setHeight(1.8);
    p3.setWeight(77);
    Person [] persons = new Person[3];
    persons[0] = p1;
    persons[1] = p2;
    persons[2] = p3;
    q1.setPerson(persons);
    System.out.println(q1.getPerson(0));

    System.out.println(q1.getHead().getBmi()); // 找出

    for (int i = 0; i < q1.persons.length; i++) { // 找出q1裡面所有人的weight status
      System.out.println(q1.getPerson(i).getWeightStatus());
    }

  }
}
