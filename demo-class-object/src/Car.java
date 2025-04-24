public class Car {

  public static long counter = 0;

  private String color;
  private String brand;
  private double price;

  public Car(String color, String brand, double price) {
    this.color = color;
    this.brand = brand;
    this.price = price;
    ++counter;
  }

  public void setColor(String color) {
    this.color = color;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public void setPrice(double price) {
    this.price = price;
  }

  public String getColor() {
    return this.color;
  }
  public String getBrand() {
    return this.brand;
  }
  public double getPrice() {
    return this.price;
  }

  public boolean isExpensive() {
    if (this.price > 10000) {
      return true;
    }
    return false;
  }

  public String equal(Car otherCar) {
    if (this.price == otherCar.getPrice()) {
      return "They have same price";
    }
    return "They don't have same price";
  }

  public static void main(String[] args) {
    Car c1 = new Car("red", "Toyota", 20000.22);
    Car c2 = new Car("blue", "BMW", 5000.55);
    Car c3 = new Car("yello", "Audi", 100000.99);

    System.out.println(c1.equal(c2));
    System.out.println(c1.isExpensive());
    System.out.println(counter);

  }

  
}
