public class Bird {
  private String name;
  private Bird bird;
  
  public Bird(String name, Bird bird) {
    this.name = name;
    this.bird = bird;
  }

  public Bird getNext() {
    return this.bird;
  }

  public String getName() {
    return this.name;
  }
   public void setNext(Bird bird) {
    this.bird = bird;
   }

   @Override
   public String toString() {
    return ("Bird(" + "name=" + this.name + ")");
   }

  public static void main(String[] args) {
    Bird[] birds = new Bird[3];

    Bird vincent = new Bird("Vincent", new Bird("Niko", new Bird("Ricky", null)));
    System.out.println(vincent.getNext().getNext().getName()); // Ricky

  }
}
