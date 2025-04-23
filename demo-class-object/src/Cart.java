import java.math.BigDecimal;
import java.util.Arrays;

// ! VERRRRRRRRY IMPORTANT
public class Cart {
  private Item[] items; // items係有能力裝住array的地址, 但沒有array,不能。length,因為冇object在上面

  // Item.java -> price, quantity

  // Cart.java -> checkoutAmount()

  public Cart() { // empty constructor, 整咗個array object出嚟
    this.items = new Item[0];
  }

  public Item[] getItems() {
    return this.items;
  }
  public int size() { // 因為有array, 所以不會爆炸
    return this.items.length;
  }
  // this.item -> 10
  // for 0-9
  // newItems[10]
  public void add(Item item){
    Item[] newItems = new Item[this.items.length + 1]; // 開個新的array+1長度, 因為舊有的array固定咗，不能夠無啦啦加多一格新
    for (int i = 0; i < this.items.length; i++) { // ! 將舊有item放返入去newItems
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item; // ! 將新item放入去newItems
    this.items = newItems;
  }

  public double checkoutAmount() {
    double amount = 0;
    for (int i = 0; i < this.items.length; i++) {
      amount = BigDecimal.valueOf(this.items[i].amount()).add(BigDecimal.valueOf(amount)).doubleValue();
    }
    return amount;
  }

  public static void main(String[] args) {
    int[] arr = new int[3]; // fixed length
    arr[0] = 10;
    arr[1] = 100;
    arr[2] = -2;
    System.out.println(Arrays.toString(arr));
    int[] arr2 = arr; // backup the address of arr object, 有支針再指住arr指住的object
    arr = new int[4];
    System.out.println(Arrays.toString(arr)); // [0,0,0,0] 
    System.out.println(Arrays.toString(arr2)); 

    String s ="hello";
    System.out.println(s); // printing the values in the address of object
    s = "hello1"; // new string object
    System.out.println(s); // different address

    //
    Cart cart = new Cart();
    Item rice = new Item(50.5, 2);
    Item water = new Item(7.5, 20);
    Item fish = new Item(150, 1);
    cart.add(rice); // ! 將新的item add落cart object上面, cart object上面有指向items array object的地址
    cart.add(water);
    cart.add(fish);
    System.out.println(cart.size()); // 3
    System.out.println(cart.getItems()[1].getQuantity()); // 20
    System.out.println(cart.checkoutAmount());

      
    }

  }


