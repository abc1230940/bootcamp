public class DemoSwitch {
  public static void main(String[] args) {
    // if -> control the range of values
    int x = 3;
    if (x > 1 && x < 5) {
      System.out.println(x);
    }
    if (x == 3) {
      System.out.println(x);
    }

    // switch -> 都係if的意思
    // ! 1. it can check one variable ONLY
    // ! 2. equals to (No range checking)
    // ! 3. you have to "break" the switch yourself
    switch (x) {
      case 1:
        System.out.println("hello");
        break;
      case 2:
        System.out.println("goodbye");
        break;
      case 3:
        System.out.println("bootcamp");
        break;
      default: // -> else 意思
        System.out.println("other cases...");
    }

    int value = 3;
    x = 1;
    // ! no break, 3^4 -> 有break同冇break的分別(知)
    switch (x) {
      case 1:
        value = value * 3;
      case 2:
        value = value * 3;
      case 3:
        value = value * 3;
      case 4:
        value = value * 3;
    }
    System.out.println(value);
  }

}
