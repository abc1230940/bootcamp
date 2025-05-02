// Account, SubAccount

// PersonalAccount & CommericalAccount
// Saving & Current

import java.math.BigDecimal;

public abstract class Account {
  // private double balance;
  private SubAccount[] subAccounts; // saving, stock, foriegn exchange

  // super()
  public Account() {
    this.subAccounts = new SubAccount[2];
    this.subAccounts[0] = new SavingAccount(); // ! New Concept
    this.subAccounts[1] = new CurrentAccount();
  }

  // public double getBalance() {
    // return this.balance;
  // }

  public SubAccount getSavingAccount() {
    return this.subAccounts[0];
  }

  public SubAccount getCurrentAccount() {
    return this.subAccounts[1];
  }

   public double balance() {
     // loop SubAccounts to sum up balance
     double total = 0.0;
     for (int i = 0; i < this.subAccounts.length; i++) { // 記得要用this
      total +=  BigDecimal.valueOf(this.subAccounts[i].getBalance()).doubleValue();
     }
     return total;
   }

  public static void main(String[] args) {
    // ! Polymorphism
    Animal animal = new Cat("John", 12);
    Animal cat = animal;
    animal = new Dog("Susan"); // ! Dog is a child of Animal Class
    
    // animal = new Circle(3.0, "RED"); // Circle is not a child of Animal Class
    // Cat cat = new Animal("Peter"); // NOT OK
    // Cat dog = new Dog("Peter"); // NOT OK 
    Cat cat = new Cat("Jimmy", 10);

    // Parent Class Array
    // Zoo.java has Animal[] -> 裡面有Dog and Cat
    Animal[] animals = new Animal[] {new Cat("John", 12), new Dog("Peter")};

    // ! Polymorphism的用途
    // Bag -> Ball, Phone
    // Ball extends Gift
    // Phone extends Gift
    // Bag -> Gift[]

    

    
  }
}