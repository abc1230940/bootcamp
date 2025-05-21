import java.util.List;
import java.util.Vector;


// ! Vector是parent, Stack是child, List<>是Interface
// ! Vector是用add(), Stack是用push()
// ! Victor = Sychronized ArrayList<>
public class DemoVictor {
  private static final List<String> strings = new Vector<>(); 
  public static void main(String[] args) {
    // Test Victor.add()
    Runnable task = () -> {
      for (int i = 0; i < 100000; i++) {
        strings.add("haha");
      }
    };

    Thread worker1 = new Thread(task);
    worker1.start();
    Thread worker2 = new Thread(task);
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(strings.size());
  }
  
}
