import java.math.BigDecimal;

public class Customer { // blueprint 藍圖
  // ! class content

  // Attribute -> 舊嘢嘅特微
  // private -> by default, this object is not readable & not writable
  private String name; 
  private String email;
  // ...
  private Order[] orders;

  // One customer has many orders, One order has many items
  public Customer() {
    this.orders = new Order[0];
  }
  // Setter -> 放attribute入盒的工具
  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  // Getter -> 拎到attribute的工具
  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }
  public int orderSize() { // 因為有array, 所以不會爆炸
    return this.orders.length;
  }
  public void add(Order order) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders;
  }

  // VIP, if the total amount of all orders >= 10000 (boolean method isVIP)
  // customer1.isVIP() -> true / false
  public boolean isVIP() {
    double total = 0;
    for (int i = 0; i < this.orders.length; i++) { // for loop裡有for loop, 極端case: order裡可以冇item
      total = BigDecimal.valueOf(total).add(BigDecimal.valueOf(this.orders[i].amount())).doubleValue();
    }
    if (total >= 10000) {
      return true;
    }
    return false;
  }

  
  // main method is NOT a must for a class file -> machine
  public static void main(String[] args) {
    // ! Create Object (new ...) -> 之前BigDecimal, Array, LocalDate都係之前人寫咁嘅藍圖(class)，我地可以用
    BigDecimal bd = new BigDecimal("1.3");

    Customer john = new Customer(); // 係一個盒，可以裝住name & email
    john.setName("John Chan"); // 客填的名
    john.setEmail("john@gmail.com"); 
    Order order1 = new Order();
    order1.add(new Item(15.3, 9));
    order1.add(new Item(2.5, 3));
    john.add(order1);

    Customer mary = new Customer();
    mary.setName("Mary Wong");
    mary.setEmail("mary@gmail.com");
    Order order2 = new Order();
    order2.add(new Item(1000.3, 9));
    mary.add(order2);
    System.out.println(mary.isVIP()); // false
    Order order3 = new Order();
    order3.add(new Item(200.5, 10));
    mary.add(order3);
    System.out.println(mary.isVIP()); // true



    String name = john.getName();
    String email = john.getEmail();
    System.out.println(name);
    System.out.println(email);

    System.out.println(mary.getName());
    System.out.println(mary.getEmail());
    
  }
  
}
