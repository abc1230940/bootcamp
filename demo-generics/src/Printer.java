// Generics -> 同ArrayList相似
// ! During compile time, you can write less codes (StringPrinter.java, IntegerPrinter.java)

import java.util.ArrayList;
import java.util.HashMap;

// Cat, Dog
public class Printer<T> {
  private T value;

  public Printer(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  // ! During runtime, you have to define "what is T"
  // 指針要指返去另一個位先可以用到
  public static void main(String[] args) {
    // Printer<T> genericsPrinter = new Printer<T>(1); -> runtime時必須要決定用嚟做咩
    Printer<String> stringPrinter = new Printer<String>("hello");
    Printer<Integer> integerPrinter = new Printer<Integer>(10);

    Printer<Object> objectPrinter = new Printer<Object>("hello"); // define做objectPrinter, 所以可以做乜都得
    ((String) objectPrinter.getValue()).charAt(1); // OK

    Printer<Number> numberPrinter = new Printer<>(Long.valueOf(10));
    numberPrinter = new Printer<>(Double.valueOf(10.9));

    ArrayList<String> strings = new ArrayList<>();
    // strings.add(10);
    ArrayList<Object> objects = new ArrayList<>();

    // Java 1.5 (Why Java created Generics -> because need to create ArrayList, HashSet, HashMap are convenient for usage. People do not need to use array)
    HashMap<String, Integer> map1 = new HashMap<>();
  }
}
