public class DemoMathOperator {
  public static void main(String[] args) {
    // + 1 -> 都是+1的展示誠法，++常用
    int x = 3;
    x = x + 1;
    x += 1;
    x++;
    ++x; 
    System.out.println("x = " + x); // x = 7

    // -1
    int y = 5;
    y = y - 1;
    y -= 1;
    y--;
    --y;
    System.out.println("y = " + y); // y = 1

    // + or - non 1 number
    int z = 10;
    z = z + 2;
    z += 2;
    z = z - 3;
    z -= 3;
    System.out.println("z = " + z); // z = 8

    // * or /
    int a = 6;
    a = a * 2;
    a *= 2;
    a = a / 2;
    a /= 2;
    System.out.println("a = " + a); // a = 6

    // Count number of even number between 0 - 9
    int counter = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        counter++;
      }
    }
    System.out.println("Numbers of even number between 0 - 9 = " + counter);

    // Larger Number
    int num1 = 10;
    int num2 = 12;
    int max = 0;
    if (num1 > num2) {
      max = num1;
    } else {
      max = num2;
    }
    System.out.println(max);

    int num3 = 13;
    if (num3 > max) {
      max = num3;
    }
    System.out.println(max);

    // Find Min. number
    // 40, 32, -19
    int num4 = 40;
    int num5 = 32;
    int num6 = -19;
    int min = 0;
    if (num4 < num5) {
      min = num4;
    } else {
      min = num5;
    }
    if (num6 < min) {
      min = num6;
    }
    System.out.println(min);
  
  }

}
