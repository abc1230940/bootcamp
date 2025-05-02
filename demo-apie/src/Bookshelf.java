// ! Advantage of Bookshelf -> 通常會有requiement俾你睇

public class Bookshelf {
  private static int MAX_SIZE = 3; // 用呢個方式寫會更好，因為MAX SIZE可以隨時變, 配合add
  private Book[] books;

  public Bookshelf() {
    books = new Book[0];
  }

  public Book[] getBooks() {
    return this.books;
  }

  public boolean isFull() {
    return this.books.length >= MAX_SIZE;
    
  }

  // ! 被動方(先寫)
  public boolean add(Book newBook) {
    if (newBook == null || isFull()) {
      return false;
    }
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      newBooks[i] = this.books[i];
    }
    newBooks[newBooks.length - 1] = newBook;
    this.books = newBooks;
    return true;
  }

   // ! equals()
   public boolean remove(Book book) {
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].equals(book)) {
        this.books[i] = null;
        return true;
      }
    }
    return false;
  }

  public boolean borrow(Book book) {
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i] == null) {
        System.out.println("The book is borrowed");
        return false;
      }
    book = this.books[i];
    this.books[i] = null;
    break;
    
    }
    System.out.println(book.toString());
    return true;
  }

  public static void main(String[] args) {
    Bookshelf bookshelf = new Bookshelf();
    bookshelf.add(new Book(100));
    bookshelf.add(new Book(101));
    System.out.println(bookshelf.isFull());
    bookshelf.add(new Book(102));
    System.out.println(bookshelf.isFull());

  }
}
