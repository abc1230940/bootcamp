public class Mage extends Hero {

  public static final int[] level1 = new int[] {200, 50, 10, 5, 8, 4, 20, 40, 5};
  public static final int[] level2 = new int[] {200, 50, 10, 5, 8, 4, 20, 40, 5};
  public static final int[] level3 = new int[] {200, 50, 10, 5, 8, 4, 20, 40, 5};

  private int hp;
  private int mp;
  private int level;

  
  public Mage() {
    super(level1[0], level1[1], 1);
  }

  

  



  

  public static void main(String[] args) {
    Mage m1 = new Mage();

  }
}
