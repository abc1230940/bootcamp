import java.util.Random;

public class Student {
  // Bag
  // Bag has many Balls (5 balls)
  // random pick a ball from bag
  // A ball has a color nad a number
  // colors: (RED, YELLOW, BLUE)
  // numbers (1-9)
  private Bag bag;
  
  public Student() {
    this.bag = new Bag();
  }

  public Bag getBag() {
    return this.bag;
  }

  public boolean place(Ball ball) { // 借袋的功能再放入去,因為bag先有改變ball的權限，所以只能call佢
    return this.bag.add(ball);
  }

  public String randomPick(Ball ball) {
    if (this.bag.isEmpty()) {
      return "Empty Bag!!!";
    }
    while (ball == null) {
      int random = new Random().nextInt(this.bag.getSize()); // ! 0-4
      ball = this.bag.pick(random);
      if (ball != null) {
        break;
      }
      
    }
    return ball.toString();
    
    
  }

  public static void main(String[] args) {
    Student s1 = new Student(); // ! Create student object, Bag object, Ball array object
    
  }
}
