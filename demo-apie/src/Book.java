import java.util.Objects;

public class Book {
  private long id;
  private String name;
  // private Library library; // ! book -> Library object address

public Book(String name, long id) {
  this.name = name;
  this.id = id;
}

public String getName() {
  return this.name;
}

public long getId() {
  return this.id;
}

// ! equals()
// this.book vs book
// 最專業寫法
// ! Object能接收任何物件
public boolean equals(Object obj) {
  if (this == obj) { // object address
    return true;
  }
  if (!(obj instanceof Book)){
    return false;
  }
  Book book = (Book) obj;
  // return this.id == book.getId() && this.name.equals(book.getName()); // 雖然check到同id就一樣，但都可以再check 埋個名，no harm
  return Objects.equals(this.id, book.getId());
}

public String toString() {
  return ("Book(" + "id=" + this.id +")");
}

public static void main(String[] args) {
  // ! In Java, all class implicitly extends Object
  Object o1 = new Superman("John");
  Human h1 = new Superman("John");

  Superman sm = (Superman) h1; // 又係夾硬將human放入superman

  Book b1 = new Book("ABC", 1);
  Book b2 = new Book("ABC", 2); 
  System.out.println(b1.equals(b2)); // false
  Book b3 = new Book("DEF", 1);
  System.out.println(b1.equals(b3)); // true
  System.out.println(b1.equals(new Cat("MarY", 5))); // false
  Book b4 = b1;
  System.out.println(b1.equals(b4)); // true

  Animal a1 = new Cat("Steven", 10);
  System.out.println(a1 instanceof Cat);
  a1 = new Dog("Peter");
  // ! a1 is a dog or cat? instanceof for parent class裝住child class
  System.out.println(a1 instanceof Cat); // false
  System.out.println(a1 instanceof Dog); // true
  Cat c2 = new Cat("Mary", 20);
  System.out.println(c2 instanceof Cat); // 原會寫


}
}
