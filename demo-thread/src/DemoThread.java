public class DemoThread {
  private int x;

  public DemoThread() {
    // this.x = 0;
  }

  public void add() {
    this.x++;
  }

  public int getX() {
    return this.x;
  }

  // for loop 10000 / 100000對java分別不大
  // JVM execute main method // create a thread to run the programm -> 農夫
    public static void main(String[] args) {
      int sum = 0;
      for (int i = 0; i < 100000; i++) {
        sum += i;
      }
      System.out.println(sum);
    

    DemoThread obj = new DemoThread();
    for (int i = 0; i < 100_000; i++) {
      obj.add();
    }
    System.out.println(obj.getX()); // 100000

    // functional interface -> void run()
    Runnable task = () -> System.out.println("hello");

    // ! main thread (original worker) -> 有個農夫做緊嘢
    // 次序不知

    Thread worker1 = new Thread(task);
    worker1.start(); // sub-thread 1 starts to work, while main thread still proceed his own work
    Thread worker2 = new Thread(task);
    worker2.start(); // sub-thread 2 starts to work, while main and sub-thread 1 still proceed his own work
    System.out.println("Program ends... "); // main thread comes here, but he doesn't know where worker1 and worker2 are.

  }
}
