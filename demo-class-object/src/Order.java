import java.math.BigDecimal;

public class Order {
  // belongs to the file的死物, static variable (Not related to Object)
  private static long counter = 0; // objects之間本身不能access, common area, 每個object都可以access, 沒有static -> 代表係object的attribute
  // barcode number, order number, invoice都會用這個static method
  private static String slogen = "hello"; // 所有objects都refer緊一個slogen eg: company name

  // Attributes -> 每個object的特徵不一樣，先需要寫attribute
  private Item[] items;
  private long id; // id多數會用long
  // private String slogen = "hello" -> 製造大量"hello" reference -> waste memory
   

  // Constructor
  public Order() { // 當製作object時，就會++counter, 其放落object自己的this.id
    this.items = new Item[0];
    ++counter;
    this.id = counter;
  }
  // ! Once we have static variable design, id is not required to inputte by the user.
  // public Order(long id) {  //Item[] items) { // 用家不需要識array // 訂單號碼, unique
    // this.items = new Item[0];
    // this.id = id;
  // }

  // Methods
  public void add(Item item) { // ! 要知道
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
    this.items = newItems;
   }
   public long getId() {
    return this.id;
   }
   public double amount() {
    double amount = 0;
    for (int i = 0; i < this.items.length; i++) {
      amount = BigDecimal.valueOf(this.items[i].amount()).add(BigDecimal.valueOf(amount)).doubleValue();
    }
    return amount;
  }
  

  public static void main(String[] args) {
    Order order1 = new Order(); // call constructor -> is an array // counter = 1
    Item apple = new Item(6.5, 3);
    order1.add(apple);
    System.out.println(order1.amount());
    
    Order order2 = new Order();
    Item lemon = new Item(5.5, 10)
    order2.add(lemon);
    System.out.println(order2.getId()); // 2
    
    Order order3 = new Order();
    Item tomato = new Item(7.5, 15);
    order3.add(lemon);
    System.out.println(order3.getId()); // 3
  }
  
  
} 

