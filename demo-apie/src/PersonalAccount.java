public class PersonalAccount extends Account {
  
  public PersonalAccount() {
    // super(); // implicitly calling Account() constructor
  }

  @Override
  public double totalValue() {
    return -1.0;
  }

  public static void main(String[] args) {
    PersonalAccount pa = new PersonalAccount();
    
  }
}