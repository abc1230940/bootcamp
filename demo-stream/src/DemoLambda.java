import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda { // 寫個runtime的formaula, 只在main重複使用，其他不能用
  public static void main(String[] args) {
    // Function f(x) = y
    // y = x + 1
    // <in type, out type>
    // 一入一出
    Function<Integer, Integer> y = x -> x + 1; 
    System.out.println(y.apply(10)); // 11

    Function<Integer, Double> circleArea = radius -> Math.pow(radius, 2) * Math.PI;
    System.out.println(circleArea.apply(2)); // 12.566370614359172

    Function<String, String> cleanData = s -> s.trim().toUpperCase();
    System.out.println(cleanData.apply("   dsssdwqdddc sdasd   ")); // DSSSDWQDDDC SDASD

    // 兩入一出
    // BiFunction
    BiFunction<String, String, String> concatOperation = (s1, s2) -> s1.concat(s2);
    System.out.println(concatOperation.apply("hello", "world")); // helloworld

    BiFunction<String, String, Integer> convert2Strings = (s1, s2) -> Integer.valueOf(s1.concat(s2));
    System.out.println(convert2Strings.apply("12232", "121"));

    Predicate<Integer> elderlyFormula = age -> age > 65; // formula / method(你俾東西佢，佢俾返你, 不是boolean)
    System.out.println(elderlyFormula.test(20)); // false

    // ! 有入冇出 -> 記得返sysout不是return
    // Consumer
    Consumer<Child> catConsumer = child -> {
      child.drink();
      child.walk();
    };

    // ! 有出冇入
    // Supplier
    Supplier<Integer> marksixNumber = () -> {
      return new Random().nextInt(49) + 1; //  - 49
    };
    System.out.println(marksixNumber.get());


    System.out.println(generateMarksixNumber());
  

  BiConsumer<String, String> namehaha = (s1, s2) -> {
    System.out.println(s1);
    System.out.println(s2);
  };
  namehaha.accept("Hello", "World");
  // sysout其實係留腳印顯示路徑行咗去邊，並不是一個return, sysout多用來debug的一個用途

  BiPredicate<String, ArrayList<String>> containsString = (targetName, nameList) -> {
    if (nameList.contains(targetName)) {
      return false;
    }
    return true;
  }; 

  // Unary Operator -> 其實都只係function
  Function<String, String> stringFunction1 = s -> s + "hello";
  System.out.println(stringFunction1.apply("Vincent")); // Vincenthello

  // ! 一入一出 (相同出入type)
  UnaryOperator<String> stringFUnaryOperator2 = s -> s + "hello";
  System.out.println(stringFUnaryOperator2.apply("Lucas")); // Lucashello

  // ! 兩入一出（相同出入type) 
  // BiFunction
  // Binary Operator -> specific -> 2 string in, 1 string out 
  BinaryOperator<String> stringOperator3 = (s1, s2) -> s1 + s2;
  stringOperator3.apply("abc", "def");

}
  

  // 同supplier一樣，can be shared to other class, 但supplier自私用
  // DemoLambda.generateMarksixNumber()
  public static int generateMarksixNumber() {
    return new Random().nextInt(49) + 1;
  }

  public static int sum(int x, int y) {
    return x + y; // 沒有sysout不代表沒有return
  }
}

