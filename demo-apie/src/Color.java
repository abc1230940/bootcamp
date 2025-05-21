// ! 1. Finite values
// ! 2. Not usually changes

public enum Color {
  RED(1, 'R'), //
  BLUE(2, 'B'), //
  YELLOW(3, 'Y'); //
  
  private int value;
  private char ch;

  private Color (int value, char ch) {
    this.value = value;
    this.ch = ch;
  }

  public int getValue() {
    return this.value;
  }

  public static Color of(int value) {
    for (Color c : Color.values()) {
      if (c.getValue() == value) {
        return c;
      }
    }
    return null;
  }
}
