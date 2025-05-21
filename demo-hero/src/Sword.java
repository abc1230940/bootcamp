public enum Sword {
  DORNA(new int[][] {{22, 5, 14}, {30, 9, 21}, {38, 13, 28}}),
  HEXDRINKER(new int[][] {{28, 9, 19}, {40, 12, 30}, {57, 16, 38}});

private int level;
private int[][] stats;

private Sword(int[][] stats) {
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