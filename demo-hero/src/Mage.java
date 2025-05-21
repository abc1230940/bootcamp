public class Mage extends Hero {

  public static final int[][] levels = new int[][] {{250, 200, 10, 10, 20, 20, 10, 10, 5},
                                                    {300, 300, 15, 15, 30, 25, 20, 15, 10},
                                                    {350, 400, 18, 20, 40, 30, 30, 20, 15}};

  private Stave stave;

  public Mage() {
    super(levels[0][0], levels[0][1], 1);
    this.stave = null;
  }

  public void equip(Stave stave) {
    if (this.stave == null && stave != null) {
      if (super.getLevel() == 1) {
        this.stave = Stave.ARCHANGEL;
      }
      
    }
  }

  public void remove(Stave stave) {
    if (this.stave.equals(stave)) {
      this.stave = null;
    }
  }

  public int getMaxHp() {
    if (super.getLevel() == 1) {
      return Mage.levels[0][0];
    } else if (super.getLevel() == 2) {
      return Mage.levels[1][0];
    } else if (super.getLevel() == 3) {
      return Mage.levels[2][0];
    }
    return -1;
  }

  public int getMaxMp() {
    if (super.getLevel() == 1) {
      return Mage.levels[0][1];
    } else if (super.getLevel() == 2) {
      return Mage.levels[1][1];
    } else if (super.getLevel() == 3) {
      return Mage.levels[2][1];
    }
    return -1;
  }

  public int getPa() {
    if (super.getLevel() == 1) {
      return Mage.levels[0][2];
    } else if (super.getLevel() == 2) {
      return Mage.levels[1][2];
    } else if (super.getLevel() == 3) {
      return Mage.levels[2][2];
    }
    return -1;
  }

  public int getPd() {
    if (super.getLevel() == 1) {
      return Mage.levels[0][3];
    } else if (super.getLevel() == 2) {
      return Mage.levels[1][3];
    } else if (super.getLevel() == 3) {
      return Mage.levels[2][3];
    }
    return -1;
  }

  public int getMa() {
    if (super.getLevel() == 1) {
      return Mage.levels[0][4];
    } else if (super.getLevel() == 2) {
      return Mage.levels[1][4];
    } else if (super.getLevel() == 3) {
      return Mage.levels[2][4];
    }
    return -1;
  }

  public int getMd() {
    if (super.getLevel() == 1) {
      return Mage.levels[0][5];
    } else if (super.getLevel() == 2) {
      return Mage.levels[1][5];
    } else if (super.getLevel() == 3) {
      return Mage.levels[2][5];
    }
    return -1;
  }

  public int getAg() {
    if (super.getLevel() == 1) {
      return Mage.levels[0][6];
    } else if (super.getLevel() == 2) {
      return Mage.levels[1][6];
    } else if (super.getLevel() == 3) {
      return Mage.levels[2][6];
    }
    return -1;
  }

  public int getCc() {
    if (super.getLevel() == 1) {
      return Mage.levels[0][7];
    } else if (super.getLevel() == 2) {
      return Mage.levels[1][7];
    } else if (super.getLevel() == 3) {
      return Mage.levels[2][7];
    }
    return -1;
  }

  public int getCd() {
    if (super.getLevel() == 1) {
      return Mage.levels[0][8];
    } else if (super.getLevel() == 2) {
      return Mage.levels[1][8];
    } else if (super.getLevel() == 3) {
      return Mage.levels[2][8];
    }
    return -1;
  }
  

  public static void main(String[] args) {
    Mage m1 = new Mage();
    m1.levelUp();
    m1.levelUp();
    System.out.println(m1.getLevel());
    System.out.println(m1.getMaxHp());
    System.out.println(m1.getHp());
    System.out.println(m1.getMaxMp());
    System.out.println(m1.getMp());
    System.out.println(m1.getMa());
    m1.equip(Stave.ARCHANGEL);

  }
}
