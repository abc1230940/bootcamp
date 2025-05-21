import java.util.concurrent.atomic.AtomicInteger;

public class DemoSolution1 {
  private AtomicInteger x; // 原子性 -> 只能夠被一個人修改的性質 ß： 只有好少數primitive先可以做到，String天生原除性
  // ! 所以其實本身int x其實預設read銀都write都可以比人干擾

  public DemoSolution1() {
    this.x = new AtomicInteger(0);
  }

  public void add() {
    this.x.addAndGet(1); // 過程中沒有中轉狀態，沒有其他人能改變，除了自己
  }

  public int getX() {
    return this.x.get();
  }

  public static void main(String[] args) {
    DemoSolution1 object = new DemoSolution1();


    Runnable task = () -> {
      for (int i = 0; i < 100000; i++) {
        object.add();
      }
    };

    Thread worker1 = new Thread(task);
    worker1.start();
    Thread worker2 = new Thread(task);
    worker2.start();

    try {
      worker1.join(); // ! main thread is waiting for worker1 come back, then proceed
      worker2.join(); // ! main thread is waiting for worker2 come back, then proceed
    } catch (InterruptedException e) { // checked exception

    }



    System.out.println(object.getX()); // ! < 200000, because 2 threads read and write on x.
  
  }
  
}
