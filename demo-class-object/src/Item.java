import java.math.BigDecimal;

public class Item { // one item特徵

  private double price;
  private int quantity;

  public Item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  // item.getPrice() -> 自己的price
  public double getPrice() {
    return this.price;
  }
  public int getQuantity() {
    return this.quantity;
  }

  public double amount() {
    return BigDecimal.valueOf(this.price)
        .multiply(BigDecimal.valueOf(this.quantity)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Item i1 = new Item(10.5, 2);
    //i1.setPrice(20.5);
    //i1.setQuantity(5);
    Item i2 = new Item(100.5, 60);
    //i2.setPrice(100.5);
    //i2.setQuantity(3);
    Item i3 = new Item(5000.55, 10);
    //i3.setPrice(55.5);
    //i3.setQuantity(10);

    System.out.println(i3.amount());
  }
}
