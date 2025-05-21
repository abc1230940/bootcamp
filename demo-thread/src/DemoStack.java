import java.util.Stack;

public class DemoStack {
  private static final Stack<Integer> INTEGERS = new Stack<>();
  public static void main(String[] args) {
    // Thread-safe for all methods in Stack.class
    // Stack
    // ! Stack always use push and pop
    Stack<String> stack1 = new Stack<>();
    stack1.push("John");
    stack1.push("Peter");
    stack1.push("Jennie");
    System.out.println(stack1.pop()); // Jennie remove and pick up the last element -> // ! 遲到但先離開
    stack1.push("Lucas");
    System.out.println(stack1.pop()); // Lucas
    // push() 儲有modcount

    stack1.add("Vincent");
    System.out.println(stack1.pop()); // Vincent

    stack1.addFirst("Sally"); // 不是add在last, 不建議用
    System.out.println(stack1.pop()); // Peter

    // Test Stack.push()
    Runnable task = () -> {
      for (int i = 0; i < 100000; i++) {
        INTEGERS.push(1);
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
    System.out.println(INTEGERS.size());
    
  }
}
