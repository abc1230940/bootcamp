public class Bag {
  private Ball[] balls;
  
  public Bag() {
    this.balls = new Ball[5];
  }

  public int getSize() { // array可以隨時getSize
    return this.balls.length;
  }

  public boolean isEmpty() { // presentation
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] != null) {
        return false;
      }
    }
    return true;
  }

  public boolean isFull() { // presentation
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] == null) {
        return false;
      }
    }
    return true;
  }

  public boolean add(Ball newBall) { // 之後先再諗點樣set method
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] == null) {
        this.balls[i] = newBall;
        return true;
      }
    }
    return false;
  }

  public Ball pick(int index) {
    if (index < 0 || index >= this.balls.length) {
      return null; // 不return任何東西
    }
    Ball ball = this.balls[index];
    this.balls[index] = null; // ! 拎走個波之後的動作，要清空呢一個index = null, 個位先會變空格
    return ball;
  }
}
