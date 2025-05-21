import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // ArrayList -> A set of something (ordering)
    // HashSet -> A set of something (no ordering)

    // key -> value
    // value (a set of something) -> 3a(key) -> 30個同學(values)
    Student s1 = new Student("John");
    Student s2 = new Student("Peter");
    Student s3 = new Student("Jennie");

    ArrayList<Student> class3a = new ArrayList<>();
    class3a.add(s1);
    class3a.add(s2);
    class3a.add(s3);

    Student s4 = new Student("Annie");
    Student s5 = new Student("Joe");
    Student s6 = new Student("Ken");

    ArrayList<Student> class3b = new ArrayList<>();
    class3b.add(s4);
    class3b.add(s5);
    class3b.add(s6);

    // Add a new student "Steven" into class 3a by HashMap
    // No Loop

    // HashMap<Key, Value>
    HashMap<String, ArrayList<Student>> searchingEngine = new HashMap<>();
    searchingEngine.put("3A", class3a);
    searchingEngine.put("3B", class3b);

    searchingEngine.get("3A").add(new Student("Steven"));
    System.out.println(searchingEngine.get("3A").get(3).getName());


    // null -> add
    // Put Sally into class C if it exists.
    // if 3C not exists, create the class
    if (searchingEngine.containsKey("3C")) {
      searchingEngine.get("3C").add(new Student("Sally"));
    } else {
      ArrayList<Student> class3c = new ArrayList<Student>();
      class3c.add(new Student("Sally"));
      searchingEngine.put("3C", class3c);
      System.out.println(searchingEngine.get("3C"));
    }



    // ! Search students by a String value
    ArrayList<Student> results = searchingEngine.get("3B");
    for (Student s : results) {
      System.out.println(s.getName());
    }

    UserProfile up1 = new UserProfile("John", "Chan", "jc@gmail.com");
    UserProfile up2 = new UserProfile("Mary", "Cheung", "mc@gmail.com");
    UserProfile up3 = new UserProfile("Lucas", "Lau", "ll@gmail.com");

    // "put()" is something similar to add()
    // put() -> add a whole entry into the HashMap
    HashMap<String, UserProfile> userMap = new HashMap<>();
    userMap.put("johnchan001", up1);
    userMap.put("marycheung100", up2);
    userMap.put("lucaslau999", up3);

    String userId = "marycheung100";
    UserProfile profile = userMap.get(userId);
    System.out.println(profile.getFirstName());
    System.out.println(profile.getLastName());
    System.out.println(profile.getEmail());
    

    HashMap<Dog, LocalDate> dobMap = new HashMap<>();
    dobMap.put(new Dog(2), LocalDate.of(2024, 12, 5));
    dobMap.put(new Dog(3), LocalDate.of(2022, 8, 31));

    // ! because Dog's equals()
    System.out.println(dobMap.get(new Dog(3))); // 2022-08-31
    System.out.println(dobMap.containsKey(new Dog(1))); // false
    System.out.println(dobMap.containsValue(LocalDate.of(2024, 12, 5))); // true

    HashMap<String, String> nameMap = new HashMap<>();
    nameMap.put("vincent", "orange");
    nameMap.put("lucas", "apple");
    System.out.println(nameMap.get("Jennie")); // null
    String newValue = nameMap.get("vincent") + "!!!";
    nameMap.put("vincent", newValue);

    // for-each
    // HashMAp is a set of Entry
    // A entry - key + value
    for (Map.Entry<String, String> entry: nameMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());  // no ordering
    }

    // Problem Solving
    // counting
    int[] arr = new int[] {-1, 3, -1, 3, 3, 8};

    HashMap<Integer, Integer> countMap = new HashMap<>();
    for (int x : arr) {
      if (countMap.get(x) == null) {
        countMap.put(x, 1);
      } else {
        countMap.put(x, countMap.get(x) + 1);
      }
      }
      for (Map.Entry<Integer, Integer> entry2: countMap.entrySet()) {
        System.out.println(entry2.getKey() + " " + entry2.getValue());
      }
      


    }
    
    // HashMap
    // Output
    // there are 2 of -1, 3 of 3, 1 of 8
  }

