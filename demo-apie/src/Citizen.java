// Citizen -> find Library -> find Bookshelf -> find Books
// book.getBorrower() -> 方向可以倒返轉

public class Citizen implements Bookable {
  private String name;
  private Library library;
  private Book[] books;

  public Citizen(String name) {
    this.name = name;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }


  @Override
  public boolean borrow(Book book) {
    return this.library.remove(book);

  }

  public boolean search(String bookName) {
    return library.search(bookName) != null;
  }
  

  public static void main(String[] args) {
    Citizen c1 = new Citizen("John");
    Citizen c2 = new Citizen("Mary");
    Library l1 = new Library();
    Book book1 = new Book("ABC", 1);
    Book book2 = new Book("DEF", 2);
    Book book3 = new Book("IJK", 3);
    Library library = new Library(book1, book2, book3);
  }
}
