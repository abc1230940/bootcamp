public class Teacher {
  private Candy[] candies;

  public Teacher() {
    this.candies = new Candy[] {new Candy("RED"),
    new Candy("RED"), new Candy("RED"), new Candy("RED"), new Candy("RED"),
    new Candy("YELLOW"), new Candy("YELLOW"), new Candy("YELLOW"),
    new Candy("YELLOW"), new Candy("YELLOW"), new Candy("YELLOW"),
    new Candy("YELLOW"), new Candy("BLUE"), new Candy("BLUE"),
    new Candy("BLUE"), new Candy("BLUE"), new Candy("BLUE"),
    new Candy("BLUE"), new Candy("BLUE"), new Candy("BLUE")};
  }
  public void distributeAll(Child[] childs) {
    int totalCandyCount = this.candies.length;
    int idx = 0;
    while (true) { // 20 times
      boolean isEmpty = false;
      for (int i = 0; i < childs.length; i++) {
        System.out.println(idx);
        distribute(childs[i], this.candies[idx]);
        this.candies[idx] = null;
        if (idx + 1 >= totalCandyCount) {
          isEmpty = true;
          break;
        }
        idx++;
      }
      if (isEmpty) {
        break;
      }
    }
  }
  



  public void distribute(Child child, Candy candy) { // teacher不是owner, 所以佢只可以call child method, distribute = receive
    child.receive(candy); // 要call child個method, 所以要擺晒2個參數入去
  }

  public static void main(String[] args) {
    Teacher t1 = new Teacher();
    Child child1 = new Child();
    Candy candy1 = new Candy("RED");
    t1.distribute(child1, candy1);
    
  }
}

