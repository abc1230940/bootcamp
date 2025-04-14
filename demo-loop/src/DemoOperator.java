public class DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);
    ++x;
    System.out.println(x); // 5

    x = ++x + 1;
    System.out.println(x); // 7

    x = x++ + 1;
    System.out.println(x); // 8

    int y = 2;
    x = ++y + 1; //先搞y，再搞x (前置++會加1)
    System.out.println(x); // 4
    System.out.println(y); // 3

    x = y++ + 1;
    // x = y + 1;
    // y++;
    System.out.println(x); // 4
    System.out.println(y); // 4

    int k = 0;
    while (k++ < 3) { // ++k會先1, k++會之後先+1
      System.out.println("hello");
  }
  y = 8;

  x = ++y + ++y + 2;
  // step 1: first ++y -> 9
  // step 2: second ++y -> 10
  // step 3: 9 + 10 + 2
  System.out.println(x); // 21
  System.out.println(y); // 10

  y = 8; // reset
  x = y++ + y++ + 2;
  // step 1: first y++ -> 8
  // step 2: first y++ -> 9
  // step 3: 8 + 9 + 2 -> 21
  System.out.println(x); // 19
  System.out.println(y); // 10
}

}