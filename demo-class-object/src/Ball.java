public class Ball {

  // Attributes
  private String color;
  private double size;

  // constructor -> no return
  // ! by default, implicitly empty constrctr exists -> 唔寫佢都隱形存在
  // ! 如果主動開咗個constructor, public Ball()就會不存在，在main不能再開到empty constructor
  public Ball() { // -> 本身存在，但我想寫出來 -> ok
  }

  // can be more than one constructor
  // All arguments(parameters) constructor
  // ! 當這個出現，empty constructor會消失, 如果想再要返empty constructor就要主動寫返出嚟(line 10 - 11)
  public Ball (double size) { 
    this.size = size; // 其實object還未生成，所以this尷尬
  }

  // methods
  // setter
  public void setColor(String color) {
    this.color = color; //儲存的資料係this.color
  }
  public void setSize(int size) {
    this.size = size; //儲存的資料係this.size
  }

  // getter
  public String getColor() { // call getColor method
    return this.color; // read返this.color
  }
  public double getSize() {
    return this.size;
  }
  

  // main (create object, set, get)
  public static void main(String[] args) {
    // make objects, and input the attributes to each object
    // "new" associate with constructor
    Ball ball1 = new Ball(10); // Call the another constructor
    ball1.setColor("Blue");
    ball1.setSize(20); // setSize會取代佢

    Ball ball2 = new Ball(); // call empty constructor
    ball2.setColor("Red");
    ball2.setSize(30);

    // get the attribute from the objects
    System.out.println(ball1.getColor());
    System.out.println(ball1.getSize());
    System.out.println(ball2.getColor());
    System.out.println(ball2.getSize());
    
  }
  
}
