// Citizen -> find Library -> find Bookshelf -> find Books
// book.getBorrower() -> 方向可以倒返轉

import java.util.Objects;

// ! "Citizen implements Interface Bookable" -> implies citizen object has borrow method at compile time
public class Citizen implements Bookable {
  private String name;
  private Library library;
  private Book[] books;
  private String hkid;

  public Citizen(String name, String hkid) {
    this.name = name;
    this.hkid = hkid;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  public String getHkid() {
    return this.hkid;
  }


  @Override
  public boolean borrow(Book book) {
    return this.library.remove(book);

  }

  public boolean search(String bookName) {
    return library.search(bookName) != null;
  }

  @Override // hkid
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Citizen)) {
      return false;
    }
      Citizen citizen = (Citizen) obj;
      return this.hkid.equals(citizen.getHkid());
  }

  @Override
  public int hashCode() { // ! 要用大階C
    // HKID
    return Objects.hash(this.hkid);
  }

  // ! 合約 -> 入到嚟呢到就一定要有呢個技能
  public static <T extends Bookable> void xxx(T object) { // 要放一個能夠借書的object
    object.borrow(new Book("ABC", 1));
  }
  

  public static void main(String[] args) {
    // Citizen.xxx(new Cat("John", 13)); -> Cat.class didin't implement bookable
    Citizen.xxx(new Citizen("John", "123"));
    
}
}
