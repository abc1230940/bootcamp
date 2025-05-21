import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball> {
  private int num;
  private Color color;

  public Ball(int num, Color color) {
    this.num = num;
    this.color = color;
  }

  @Override
  public int compareTo(Ball ball) {
    // -1 > this goes first
    // 1 -> ball goes first
    if (this.color == Color.BLUE) {
      return -1; 
      } 
    if (ball.getColor() == Color.BLUE) {
      return -1;
      } 
     if (this.color == Color.YELLOW) {
      return -1;
    }
    return 1;
  }

  public int getNum() {
    return this.num;
  }

  public Color getColor() {
    return this.color;
  }

  public String toString() {
    return ("Ball(" + "number=" + this.num + ",color=" + this.color +")");
  }

  public static enum Color {
    RED, BLUE, YELLOW;
  }
  
  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(1, Color.BLUE));
    balls.add(new Ball(2, Color.RED));
    balls.add(new Ball(3, Color.YELLOW));

    for (Ball ball : balls) {
      System.out.println(ball);
    }

    // Java default Sorting usage:
    Collections.sort(balls); // Collections.sort() requires a class fufill comparable interface
    System.out.println(balls);

    Collections.sort(balls, new SortedByNum()); // descending order

  }
}
