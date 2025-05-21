import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static class SortedByNamDesc implements Comparator<String> {
    @Override 
    public int compare(String s1, String s2) {
      return (s1.compareTo(s2)) > 0 ? -1 : 1; // 大Alphabet放前
      }
    }

  public static class SortedByAgeDesc implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      return (p1.getAge() > p2.getAge())? -1 : 1;
      }
    }
  
  
  public static void main(String[] args) {
    Queue<String> q1 = new PriorityQueue<>(new SortedByNamDesc()); // Underlying data structure -> ArrayList -> Array -> 將這種個人放入去
    q1.add("Vincent");
    q1.add("Lucas");
    q1.add("Sally");

    for (String s : q1) {
      System.out.println(s);
    }
    // Lucas
    // Vincent
    // Sally

    // consume the queue
    while(!q1.isEmpty()) {
      System.out.println(q1.poll()); // ! ordering -> pick up (slow) 
    }

    // method: poll()
    // - ordering -> compareTo()
    // ! 可改寫comparator, comparable不行

    Queue<Person> q2 = new PriorityQueue<>(new SortedByAgeDesc());
    q2.add(new Person("John", 56));
    q2.add(new Person("Kitty", 67));
    q2.add(new Person("Haha", 78));
    System.out.println(q2.poll());
    q2.add(new Person("Mama", 97));
    System.out.println(q2.poll());
    }
}
