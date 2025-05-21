import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// ! Stream()永遠點都唔可以增加數目 -> high level programming
// ! for loop可以

public class DemoStream {

  public static class Staff {
    private String department;
    private int salary;

    public Staff(String department, int salary) {
      this.department = department;
      this.salary = salary;
    }

    public String getDepartment() {
      return this.department;
    }

    public int getSalary() {
      return this.salary;
    }

    @Override
    public String toString() {
      return ("Staff(" + "Name=" + this.department + ",salary=" + this.salary + ")");
    }

  public static void main(String[] args) {
    List<String> names = new ArrayList<>(List.of("John","Peter","Jenny"));

    // for loop
    names.forEach(name -> {
      System.out.println(name);
    });

    // print those names starts with J
    names.forEach(name -> {
      if (name.startsWith("J")) {
        System.out.println(name);
      }
    });

    // ! Java 8 stream
    // ! filter()
    names.stream() // 
      .filter(name -> name.startsWith("J") && name.endsWith("y") || name.length() == 5)
      .forEach(name -> System.out.println(name));

    // ! Map() -> 變身
    names.stream() // 
      .filter(name -> name.startsWith("J") && name.endsWith("y") || name.length() == 5)
      .map(name -> new Child(name))
      .forEach(child -> {
        System.out.println(child.getName());
      });

    // ! Collect() -> 再變返去成條list一堆東西-> !!!!!! eliminate -> change the remaining -> back to a list(終結方法)
    names.stream()
    .filter(name -> name.startsWith("J") && name.endsWith("y") || name.length() == 5)
      .map(name -> new Child(name))
      .collect(Collectors.toList());

    List<Integer> numbers = new ArrayList<>(List.of(2, 4, 7, -1, 100));
    // Stream<Integer> result = numbers.stream();
    List<Integer> result =
    numbers.stream()
      .filter(number -> number > 6 && number % 2 == 0)
      .map(number -> (int) Math.pow(number, 2))
      .collect(Collectors.toList());
    System.out.println(result);

    // ! loop + if + break
    // findAny
    // ! Optional is a class, name is optional object, which may store null or non-null value
    Optional<String> name = names.stream().filter(n -> n.startsWith("J")).findFirst();
    if (name.isPresent()) { // true if non-null
      System.out.println("There is a name starts with J " + name.get());
    } else {
      System.out.println("There is no name starts with J.");
    }

    System.out.println(name); // Optional[John]

    // Ascending ordering
    Comparator<String> sortedByDescending = (s1, s2) -> s2.compareTo(s1) > 0 ? -1 : 1;
    names.stream() //
      .sorted(sortedByDescending) //
      .collect(Collectors.toList()) //
      .forEach(n -> System.out.println(n));

    // 8, 9, 2, -5, 100, 10000, -300, 11
    // filter odd number -> square -> value > 80 > sorted -> print out
    List<Integer> numbers2 = new ArrayList<>(List.of(8, 9, 2, -5, 100, 10000, -300, 11));
    List<Integer> result2 = numbers2.stream()
      .filter(n -> n % 2 == 1) //
      .map(n -> n * n) //
      .filter(n -> n > 80)
      .sorted()
      .collect(Collectors.toList());
    System.out.println(result2);

    // Array -> ArrayList -> Stream() -> // ! for String
    String[] strings = new String[] {"abc", "def"};
    long count = Arrays.asList(strings).stream().filter(e -> e.startsWith("a")).count();

    int[] arr = new int[] {3, 6, -1};
    Arrays.asList(arr); // ! List<int[]> -> 不是我們要的

    // IntStream -> not important
    // 统計學的function -> for本身int用，不需要轉做Integer咁煩
    Arrays.stream(arr).average();
    OptionalInt maxValue = Arrays.stream(arr).max();
    System.out.println(maxValue.getAsInt()); 

    OptionalDouble average = Arrays.stream(arr).average();
    System.out.println(average.getAsDouble()); // 6

    // List<Integer>
    // boxed -> auto-box (int -> Integer) -> 將int變為Integer的工具
    List<Integer> resultList = Arrays.stream(arr).boxed().filter(e -> e > 4).collect(Collectors.toList());
    System.out.println(resultList); // [6]


    // default RED color
    // List<Integer> -> 8, 9, 4, 1
    // Descending order
    // List<Ball>

    List<Integer> numbers3 = new ArrayList<>(List.of(8, 9, 4, 1));
    Comparator<Integer> sortedNumbersByDescending = (n1, n2) -> n1.compareTo(n2) > 0 ? -1 : 1;
    List<Ball> balls = numbers3.stream()
    .sorted(sortedNumbersByDescending)
    .map(n -> new Ball(Ball.Color.RED, n))
    .collect(Collectors.toList());

    System.out.println(balls);

    // List<Double>, radius = 3.5, 4.5, 1.5
    // BigDecimal
    // List<Double> circle area

    List<Double> doubles = new ArrayList<>(List.of(3.5, 4.5, 1.5));
    List<Double> result3 = doubles.stream()
    .map(n -> (BigDecimal.valueOf(n * n).multiply(BigDecimal.valueOf(Math.PI)).doubleValue()))
    .collect(Collectors.toList());

    System.out.println(result3);
  

  // Counting
  List<String> nameList = new ArrayList<>();
  nameList.add("John");
  nameList.add("John");
  nameList.add("Peter");
  long countJohn = nameList.stream().filter(e -> e.equals("John")).count();
  System.out.println(countJohn);
  // ! distinct -> return a new list, which contains unique elements
  nameList.add("Mary");
  nameList.add("Peter");
  System.out.println(nameList.stream().distinct().count());
  System.out.println(nameList.stream().distinct().collect(Collectors.toList()));

  // ! flatMap -> 常用方法 -> 合併
  Box box1 = new Box(new ArrayList<>(List.of(new Ball(Ball.Color.RED, 1), new Ball(Ball.Color.BLUE, 2))));
  Box box2 = new Box(new ArrayList<>(List.of(new Ball(Ball.Color.RED, 3), new Ball(Ball.Color.BLUE, 4))));
  List<Box> boxList = new ArrayList<>();
  boxList.add(box1);
  boxList.add(box2);
  List<Ball> combinedBallList = boxList.stream().flatMap(box -> box.getBalls().stream()).collect(Collectors.toList());
  System.out.println(combinedBallList);

  // 傳統方法
  List<Ball> combinedBallList2 = new ArrayList<>();
  for (Box box : boxList) {
    combinedBallList2.addAll(box.getBalls());
  }
  System.out.println(combinedBallList2);


  // ! Stram: From ArrayList -> Map -> 強 -> 可以用到 (count, max, min, sum, average)
  // 可以歸類
  List<Staff> staffs = new ArrayList<>(List.of(new Staff("IT", 25000), new Staff("IT", 35000), new Staff("HR", 18000), new Staff("HR", 28000)));

  // groupingBy -> 分類
  // collect() -> 底裡係call put()這個方法, 封裝
  Map<String, List<Staff>> departmentMap = staffs.stream().collect(Collectors.groupingBy(s -> s.getDepartment()));
  System.out.println(departmentMap);

  Map<String, Integer> salaryMap = staffs.stream().collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors.summingInt(s -> s.getSalary())));
  System.out.println(salaryMap);

  // maxBy()要用到Optional
  Map<String, Optional<Staff>> salaryMap2 = staffs.stream().collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors.maxBy((s1, s2) -> s1.getSalary() > s2.getSalary() ? 1 : -1)));
  Optional<Staff> hightstSalatyIT = salaryMap2.get("IT");
  System.out.println(hightstSalatyIT);

  // ! 將佢地分2類(Pass / fail,  male / female, elderly / not elderly) -> 普通for loop + if 都做到 -> Boolean!
  Map<Boolean, List<Staff>> salaryPartition = staffs.stream().collect(Collectors.partitioningBy(s -> s.getSalary() > 20000));
  System.out.println(salaryPartition.get(true)); // [Staff(Name=IT,salary=25000), Staff(Name=IT,salary=35000), Staff(Name=HR,salary=28000)]
  System.out.println(salaryPartition.get(false)); // [Staff(Name=HR,salary=18000)]
  
  }

  }
}

  

  

