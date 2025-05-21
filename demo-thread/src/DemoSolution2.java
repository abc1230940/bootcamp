public class DemoSolution2 {
  private int x;

  public DemoSolution2() {

  }

  // ! cons: lower the performance
  public synchronized void add() { // ! 加咗synchonized這個字，做x++前要拎一條鎖匙,之後鎖, 只有一個thread進入 -> very slow!!!!!
    // ! this is the key lock and unlock the door of add() method
    x++; // read and write
  }

  public int getX() {
    return this.x;
  }

  public static void main(String[] args) {
    DemoSolution2 object = new DemoSolution2();


    Runnable task = () -> {
      System.out.println("Thread name" + Thread.currentThread().getName() + "starts to work.");
      for (int i = 0; i < 100000; i++) {
        object.add();
      }
      System.out.println("Thread name" + Thread.currentThread().getName() + "completed.");
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
