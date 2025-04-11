public class DemoWhileLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    System.out.println(x); // 16

    // For Loop (init, continue condition, modifier)
    // While Loop (continue condition)
    int k = 0;
    int value = 2; // loop外不用i
    while (k < 3) {
      value = value * 2;
      k++;
    }
    System.out.println(value);

    // Do While Loop
    // ! No entry condition (At least execute once)
    k = 0;
    do {
      System.out.println("hello");
      k++;
    } while(k < 3); // continue creiteria
    
  }
  
}
