public class Child {
  // 20 Candies
  // Candy has color (RED, PURPLE, YELLOW)
  // Teacher disturbutes candy to child (6 children)
  // Many children
  // Print out thr color of candy per child
  private Candy[] candies;

  public Child() {
    this.candies = new Candy[0];
  }

  // !!!!!! 被動的物件都要寫methods -> candy比人派出去，child hold candy -> child有方法比人塞糖, account有方法比人credit the balance
  // Child owns Candy[]
  // Bag owns Ball[]
  // Archer owns HP

  public Candy[] getCandys() {
    return this.candies;
  }

  public boolean receive(Candy newCandy) { // ! 如果預見到array的格數係字知的，就應該用呢個方法去自動加格會最好
    if (newCandy == null) {
      return false;
    }
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[i] = this.candies[i];
      newCandies[newCandies.length - 1] = newCandy; // newCandy係地址
      this.candies = newCandies;
    }
    return false;
   }

}
