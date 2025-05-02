// Library, Book, Citizen
// extends, implements
// main: John, Mary (Citizen) -> want to borrow the same book
// Eg: john borrow bookA -> success
// Mary -> fails
public class Library {
  private Bookshelf bookshelf;

  public Library() {
    bookshelf = new Bookshelf();
  }


public Book search(String bookName) {
    for (int i = 0; i < this.bookshelf.getBooks().length; i++) {
      if (this.bookshelf.getBooks()[i].getName().toLowerCase().contains(bookName.toLowerCase())) {
        return this.bookshelf.getBooks()[i];
      }
      
  }
  return null;
}

public boolean remove(Book book) {
  return this.bookshelf.remove(book);
}
 

  

  }



  
  

