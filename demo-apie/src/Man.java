public class Man {
  private static final int FIXED_TURN_DEGREE = 10;
  private int degree;

  public Man() {
    this.degree = 0;
  }

  public String getDirection() {
    int position = (this.degree / 90);
    int extra = (this.degree % 90);
    if (extra > 45) {
      position += 1;
    }
    position += 0;
    switch(position) {
      case 0:
        return "NORTH";  
      case 1:
        return "EAST";
      case 2:
        return "SOUTH";
      case 3:
        return "WEST";
      case 4:
        return "NORTH";
    }
    return null;
  }

  public void turnLeft() {
    this.degree = (this.degree - FIXED_TURN_DEGREE + 360) % 360;
  }
    

  public void turnRight() {
    this.degree = (this.degree + FIXED_TURN_DEGREE + 360) % 360;
  }
  

  public static void main(String[] args) {
    Man m1 = new Man();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    System.out.println(m1.getDirection());
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    System.out.println(m1.getDirection());
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    m1.turnLeft();
    System.out.println(m1.getDirection());
  }
}
