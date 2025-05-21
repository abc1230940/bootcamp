public enum Stave {
  ARCHANGEL(new int[][] {{5, 15, 8}, {12, 28, 15}, {17, 37, 20}}),
  LIANDRY(new int[][] {{18, 32, 14}, {25, 46, 21}, {33, 60, 28}});


private int level;
private int[][] stats;

private Stave(int[][] stats) {
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