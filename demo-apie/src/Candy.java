public class Candy {
  // ! how to distinguish 2 RED color of candies
  private String color;
  
  public Candy(String color) {
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public String toString() {
    return ("Candy(" + "color" + this.color + ")");
  }
  
}
