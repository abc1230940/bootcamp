public class Color {
  private String value;

  public String getValue() {
    return this.value;
  }
  public void setColor(String value) {
    this.value = value;
  }
  
  public static void main(String[] args) {
    Color c1 = new Color();
    Color c2 = new Color();
    c2.setColor("Red");

    System.out.println(c1 == c2); // false
  }
}
