import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Class -> Object (row), Attribute (column of a row)

// ! List<Person> -> 表達excel裡面worksheet的狀態
// ! excel同database溝通上，裡面冇optional呢種東西，database不知你講緊咩
// Java -> database -> 會有programme轉換成另一個編碼

public class DemoOptional {

  // ! SHOULD NOT use Optional as attribute tye
  private Optional<String> name; // ! For attribute, always use null to present "no value" instead of Optional attribute係數據，非情景, 不需要同人交代可能冇

  // ! SHOULD NOT use Optional for getter
  public Optional<String> getName() { // get完後會再get, 多餘 -> 畫蛇添足
    return this.name;
  }

  // ! SHOULD NOT use Optional for constructor
  public DemoOptional (Optional<String> str) {
    
  }

  public static void main(String[] args) {
    List<String> names = new ArrayList<>(List.of("John", "Mary", "Lucas")); // 不用擔心有null
    Optional<String> result = findTargetString(names, "Mary");
    if (result.isPresent()) {
      System.out.println("The target name is " + result);
    } else {
      System.out.println("The target is not found");
    }

     findTarget(null, 'c'); // NPE

     // The way to create optional object
     Optional<Ball> ball1 = Optional.of(new Ball(Ball.Color.RED, 13)); // Ball不一定存在
     Optional<Ball> balls = Optional.empty();

     // ! Use ofNullable when you don;t know if the object is null
     Ball b1 = null;
     Optional<Ball> ball3 = Optional.ofNullable(b1);

     // ! Optional.of(null) -> 不能用 ! You must pull non-null object into of()

     // 同LocalDate一樣，Optional都係透過封裝建立new object, 但唔俾你用new

    
  }

  // ! Optional.class is ONLY for return type. 想表達搵唔到呢個情景
  // ! 找東西不一定會找到，所以會出Optional null
  public static Optional<String> findTargetString(List<String> strings, String target) { // 會有搵唔到的機會
    if (strings != null && strings.contains(target)) {
      return Optional.of(target);
    }
    return Optional.empty(); // 代表係null

  }

  // ! SHOULD NOT use Optional as type of parameter
  // Because you still cannot avoid null pointer exception
  public static boolean findTarget(Optional<String> str, char target) { // Optinal -> 對方都可以俾個null出來
    if (!str.isPresent()) {
      return false;
    }
    return str.get().contains(String.valueOf(target));
  }
}
