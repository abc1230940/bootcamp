import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // LinkedList -> Deque -> Queue
    Queue<Cat> queue1 = new LinkedList<>();
    queue1.add(new Cat("John"));
    queue1.add(new Cat("Jacky"));
    queue1.add(new Cat("Vincent"));
    System.out.println(queue1.poll()); // John
    System.out.println(queue1); // [Cat(name=Jacky), Cat(name=Vincent)]

    Deque<Cat> queue2 = new LinkedList<>();
    queue2.addLast(new Cat("Mary"));
    queue2.addFirst(new Cat("Peter"));
    queue2.addLast(new Cat("Sally"));
    System.out.println(queue2.pollFirst()); // Cat(name=Peter)
    System.out.println(queue2); // [Cat(name=Mary), Cat(name=Sally)]
    System.out.println(queue2.pollLast()); // Cat(name=Sally)
    System.out.println(queue2); // [Cat(name=Mary)]

    Deque<Cat> queue3 = new ArrayDeque<>();
    queue3.addFirst(new Cat("Kitty"));
    queue3.addLast(new Cat("Brian"));
    queue3.addFirst(new Cat("Henry"));
    System.out.println(queue3.pollFirst());
    System.out.println(queue3.pollLast());
    System.out.println(queue3);

    Queue<Cat> queue4 = new ArrayDeque<>();
    Collection<Cat> queue5 = new ArrayDeque<>();
    Iterable<Cat> queue6 = new ArrayDeque<>();



    List<Cat> cats = new LinkedList<>();
    

    Animal a1 = new Cat("John");
    Object o1 = new Cat("Peter");
  }
  
}
