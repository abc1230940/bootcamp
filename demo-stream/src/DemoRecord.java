public class DemoRecord {
  public static void main(String[] args) {
    Person p1 = new Person("John", 13);
    // Person p2 = new Person();
    // 沒有Setter, 應該不能有empty constructor
    System.out.println(p1.age()); // 13
    System.out.println(p1.name()); // John

    Person p2 = new Person("John", 13);
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.hashCode() == p2.hashCode()); // true
    System.out.println(p1); // erson[name=John, age=13]

    System.out.println(Person.sum(3, 4)); // 7
    System.out.println(Person.VALUE); // 360
    System.out.println(p1.getInfo()); // John, 13

    Person p3 = new Person("John", 14);
    System.out.println(p2.equals(p3)); // true, rewrite equals() in Person.class
  }
  
}
