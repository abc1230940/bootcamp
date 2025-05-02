public class Ball {
  private final String color;
  private final int number;

  public Ball(String color, int number) {
    this.color = color;
    this.number = number;
  }

  public String getColor() {
    return this.color;
  }
  public int getNumber() {
    return this.number;
  }

  public boolean equals(Ball ball) {
    return this.color.equals(ball.getColor()) && this.number == ball.getNumber();
  }

  public String toString() {
    return ("Ball(" + "color=" + this.color + "number=" + this.number + ")");
  }
  
}
