public enum Bow {
  RECURVE(new int[][] {{17, 8, 13}, {26, 14, 19}, {35, 17, 23}}),
  GUINSOO(new int[][] {{24, 13, 16}, {36, 17, 23}, {48, 22, 30}});

  private int level;
  private int[][] stats;

  private Bow(int[][] stats) {
    this.level = 1;
    this.stats = stats;
  }

  public int getPa() {
    if (this.level == 1) {
      return stats[0][0];
    } else if (this.level == 2) {
      return stats[1][0];
    } else if (this.level == 3) {
      return stats[2][0];
    }
    return -1;
  }

public int getMa() {
  if (this.level == 1) {
    return stats[0][1];
  } else if (this.level == 2) {
    return stats[1][1];
  } else if (this.level == 3) {
    return stats[2][1];
  }
  return -1;
}

public int getCc() {
  if (this.level == 1) {
    return stats[0][2];
  } else if (this.level == 2) {
    return stats[1][2];
  } else if (this.level == 3) {
    return stats[2][2];
  }
  return -1;
}

}
