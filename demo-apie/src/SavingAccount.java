public class SavingAccount extends SubAccount {
  private Currency currency; // 可以唔駛用String
  
  private SavingAccount(Currency currency) {
    this.currency = currency;
  }

  public static SavingAccount OfHKD() {
    return new SavingAccount(Currency.HKD);
  }

  public static void main(String[] args) { // ! SavingAccount所有methods都從SubAccount繼承, 所以可以用得返晒所有methods
    SavingAccount sa = new SavingAccount(Currency.USD); // 開美金saving account
    System.out.println(sa.getBalance());
    sa.credit(150);
    sa.debit(100); // true
    System.out.println(sa.getBalance()); // 50.0
    System.out.println(sa.debit(60));
    System.out.println(sa.getBalance()); // 50.0

    CurrentAccount ca = new CurrentAccount();
    ca.credit(200);
    ca.debit(110);
    System.out.println(ca.getBalance()); // 90

    PersonalAccount pa = new PersonalAccount();
    // add $100 to saving account
    // add $500 to current account
    // deduct $80 from current account
    // deduct $230 from current account
    // print out the balance of this personal account
    pa.getSavingAccount().credit(100);
    pa.getCurrentAccount().credit(500);
    pa.getCurrentAccount().debit(80);
    pa.getSavingAccount().debit(230);
    System.out.println(pa.balance());



  }
}