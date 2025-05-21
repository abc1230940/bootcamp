// ! Java 10的東西

import java.util.ArrayList;
import java.util.List;

public class DemoTypeInference {
  // private var age; // ! var不能用來做任意，T先係任意, var只係for lazy use
  public static void main(String[] args) {
    String s = "hello"; // Strong type(左右要一樣，，不然要夾硬 / parent-child)

    // Java 10
    var s2 = "Oscar"; // ! During compile time (java file -> class file) , var -> String
    // s2 = 13; -> 已經決定咗var係string, 不能再轉，所以都係Strong type // Java is able to check s2 is with String Type during compile time.
    // so you cannot put a non-String value after Line 6
    s2.charAt(0); // java已經決定咗係String了先可以用charAt();

    var s3 = new Ball(Ball.Color.BLUE, 2);
    // s3 = "Oscar";

    // int result = sum(3, 4); // ! We cannot use a specific type of variable to receive the result, if the method return var type.
  
    List<String> names = new ArrayList<>(List.of("Mary", "Oscar", "Sue"));
    for (var name : names) { // 可以用，但好無謂, 右邊已講明係String, 所以左邊都一定係String

    }
  
  }

 //  public var sum(int x, int y) {
    //return x + y;
  // }

  // public int sum(var x, var y) {
   // x.charAt(y);
  // }
}
