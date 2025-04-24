public class Calculator {
  private int age;

  public Calculator (int age) {
    this.age = age;
  }
  // ! Instance method (Input, Instance variable -> output)
  public int sum(int x, int y) {
    // int + int -> int
    return x + y + this.age;
  }

  // ! Static method (Input -> Output)
  // ! Not able to access thr Instance variable
  public static int sum2(int x, int y) {
    return x + y;
  }

  // 第二個static method
  public static void print(String str) {
    System.out.println("The String is " + str);

  }

  public static void main(String[] args) {

    // ! Instance method -> only apply to object
    Calculator c1 = new Calculator(65);
    int result = c1.sum(1,2);
    System.out.println(result); // 68

    // ! static method
    // ! not able to access Instance variable -> 不需要有object都可以使用到
    int result2 = sum2(1, 2);
    System.out.println(result2); // 3
    System.out.println(Calculator.sum2(1,2)); // 3

    Calculator.print("hello");

    

  }
  
}
