public abstract class Shape {
  // Parent Class - 越flexible越唔好, 影響readability -> 第一步要望的東西: abstract -> 不可能有new
  // ! 1. Concrete class - can be "new"
  // ! 2. Abstract class - cannot be "new"

  // Abstract Class:
  // 1. May contain abstract method -> 連自己想做咩都唔知


  private String color;
  // Child inherit attributes, instance methods
  // But cannot inherit constructor
  
  
  // constructor
  public Shape(String color) { // ! 俾child calls super時用
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public abstract double area(); // ! 我這裡只係族譜 child class必須要有求area method

  

  public static void main(String[] args) {
    // Shape s1 = new Shape("white");
    // Shape s2 = new Shape();
    Circle c1 = new Circle();
    Shape[] s1 = new Shape[] {new Rectangular("WHITE", 10.5, 5.5), new Triangle(10.5, 5.5, "BLACK")};
    
    double totalArea = 0;
    for (int i = 0; i < s1.length; i++) {
        totalArea += s1[i].area();
    }
    System.out.println(totalArea);
    
  }
}