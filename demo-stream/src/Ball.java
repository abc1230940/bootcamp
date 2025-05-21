public class Ball {
  private Color color;
  private int number;
  
  public Ball (Color color, int number) {
    this.color = color;
    this.number = number;
  }

  public int getNumber() {
    return this.number;
  }

  public String toString() {
    return ("Ball(" + "color=" + this.color + ",number=" + this.number + ")");
  }

  public static enum Color {
    RED, BLUE;
  }
}
