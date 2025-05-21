import java.util.Hashtable;

public class DemoHashtable {
  private static final Hashtable<String, Integer> nameMap = new Hashtable<>();
  private static final Hashtable<Integer, String> nameMap2 = new Hashtable<>(); // Map<Integer, String> nameMap2 = new HashMap<>(); -> 沒有synchronized

  public static synchronized void operate(Hashtable<String, Integer> map, Integer valueToAdd) {
    Integer result = map.get("bootcamp");
    result = result + valueToAdd;
    map.put("bootcamp", result);
  }

  public static void main(String[] args) {
    // Hashtable.put
    nameMap.put("bootcamp", 0);
    Runnable task = () -> {
      for (int i = 1; i <= 10000; i++) {
        operate(nameMap, i);
      }
    };

    Runnable task2 = () -> {
      for (int i = 1; i <= 10000; i++) {
        nameMap2.put(i, "hello");
      }
    };
    
    Thread worker1 = new Thread(task2);
    worker1.start();
    Thread worker2 = new Thread(task2);
    worker2.start();
    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(nameMap2.size());
  }
}
