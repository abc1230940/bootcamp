public class Archer extends Hero {

  public static final int[][] levels = new int[][] {{200, 200, 20, 20, 15, 15, 20, 25, 10},
                                                    {250, 250, 30, 25, 18, 20, 30, 30, 15},
                                                    {300, 300, 40, 28, 23, 25, 40, 35, 18}};

  private Bow bow;

  public Archer() {
      super(levels[0][0], levels[0][1], 1);
      this.bow = null;
    }

    public int getMaxHp() {
      if (super.getLevel() == 1) {
        return Archer.levels[0][0];
      } else if (super.getLevel() == 2) {
        return Archer.levels[1][0];
      } else if (super.getLevel() == 3) {
        return Archer.levels[2][0];
      }
      return -1;
    }
  
    public int getMaxMp() {
      if (super.getLevel() == 1) {
        return Archer.levels[0][1];
      } else if (super.getLevel() == 2) {
        return Archer.levels[1][1];
      } else if (super.getLevel() == 3) {
        return Archer.levels[2][1];
      }
      return -1;
    }
  
    public int getPa() {
      if (super.getLevel() == 1) {
        return Archer.levels[0][2];
      } else if (super.getLevel() == 2) {
        return Archer.levels[1][2];
      } else if (super.getLevel() == 3) {
        return Archer.levels[2][2];
      }
      return -1;
    }
  
    public int getPd() {
      if (super.getLevel() == 1) {
        return Archer.levels[0][3];
      } else if (super.getLevel() == 2) {
        return Archer.levels[1][3];
      } else if (super.getLevel() == 3) {
        return Archer.levels[2][3];
      }
      return -1;
    }
  
    public int getMa() {
      if (super.getLevel() == 1) {
        return Archer.levels[0][4];
      } else if (super.getLevel() == 2) {
        return Archer.levels[1][4];
      } else if (super.getLevel() == 3) {
        return Archer.levels[2][4];
      }
      return -1;
    }
  
    public int getMd() {
      if (super.getLevel() == 1) {
        return Archer.levels[0][5];
      } else if (super.getLevel() == 2) {
        return Archer.levels[1][5];
      } else if (super.getLevel() == 3) {
        return Archer.levels[2][5];
      }
      return -1;
    }
  
    public int getAg() {
      if (super.getLevel() == 1) {
        return Archer.levels[0][6];
      } else if (super.getLevel() == 2) {
        return Archer.levels[1][6];
      } else if (super.getLevel() == 3) {
        return Archer.levels[2][6];
      }
      return -1;
    }
  
    public int getCc() {
      if (super.getLevel() == 1) {
        return Archer.levels[0][7];
      } else if (super.getLevel() == 2) {
        return Archer.levels[1][7];
      } else if (super.getLevel() == 3) {
        return Archer.levels[2][7];
      }
      return -1;
    }
  
    public int getCd() {
      if (super.getLevel() == 1) {
        return Archer.levels[0][8];
      } else if (super.getLevel() == 2) {
        return Archer.levels[1][8];
      } else if (super.getLevel() == 3) {
        return Archer.levels[2][8];
      }
      return -1;
    }
  }

