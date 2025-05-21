public class DemoEncapsulation {
  public static void main(String[] args) {
    // Encapsulation -> 透過方法去封裝入面的attribute

    // Role of writing programm
    // ! 1. Author
    // ! 2. User


    // ! Author
    // Customer, Order, Item
    // Customer has Orders (Order[]) -> 作者的決定用array
    // Order has Item (Item[])
    // Customer.class -> add(Order order)
    // Order.class -> add(Item item) 
    // Order.class -> remove(Item item)
    // ! 這2個方法唔俾你直接改到個array

    // Encapsulation (done by author)
      // 1. Author use array to present One to Many (In future, Author can use ArrayList instead of Array)
      // AND
      // ! 2. provide add() and remove() but no setter & getter -> 不給你array

    // ! from user perspective -> 簡單好用就得，用家要嚟享受
    // Readability (Convenient for calling method, easy to understand)
    // customerA.add(order)
    // orderA.add(itemA)
  }
  
}
