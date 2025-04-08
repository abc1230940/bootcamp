public class DemoDouble {
  public static void main(String[] args) {
    // Store a number with decimal places
    // Type: double
    double y = 9.9;
    System.out.println(y); // 9.9

    // store 99.9 into variable price
    double price = 99.9;
    // store 3 into variable quantity
    int quantity = 3;
    // calculate checkout amount
    double checkout = price * quantity;
    System.out.println(checkout); // 299.700000005

    // ! int / int = int
    // 10 -> int value
    // 3 -> int value
    // 1. 10 / 3 -> int / int -> int (10 / 3 -> 3)
    // 2. assign result into w (3 -> 3.0)
    double w = 10 / 3;
    System.out.println(w); // 3.0

    // ! double / int -> double
    int score1 = 71;
    int score2 = 82;
    // calculate the average score
    // step 1: (int / int) / int -> int (71 + 82) / 2 -> 76
    // step 2: 76 -> 76.0
    double average = (score1 + score2) / 2;
    // ! understand why 76.0? but not 76.5
    System.out.println(average); // 76.0

    average = (score1 + score2) / 2.0;
    System.out.println(average); // 76.5


    // ! Problem for "double"
    double o1 = 0.1 + 0.2;
    System.out.println(o1); // 0.30000000000000004

    // divided by zero -> System Error
    // double r3 = 10 / 0;
    // System.out.println(r3);

    double r4 = 0 / 10;
    System.out.println(r4); // 0.0
}
  
}
