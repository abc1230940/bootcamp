public class BirdOwner {
  // ! Array implementation
  // private Bird[] birds
  // ! ArrayList implementation
  // private ArrayList<Bird> birds
  // ! LinkedList underlying implementation
  private Bird head;

  public BirdOwner(Bird head) {
    this.head = head;
  }

  public void add(Bird bird) {
    Bird temp = this.head;
    while(temp != null) {
      if (temp.getNext() == null) {
        break;
      }
      temp = temp.getNext();
    }
    temp.setNext(bird);
  }

  public Bird lastBird() {
    Bird temp = this.head;
    while(temp != null) {
      if (temp.getNext() == null) {
        return temp;
      }
      temp = temp.getNext();
    }
      return null;  
  }

  public static void main(String[] args) {
    BirdOwner bo = new BirdOwner(new Bird("Vincent", new Bird("Niko", new Bird("Ricky", null))));
    Bird jacky = new Bird("Jacky", null);

    bo.add(jacky);
    bo.add(new Bird("Alex", null));

    // Find the last bird
    System.out.println(bo.lastBird().getName()); // Alex

    }
  
}
