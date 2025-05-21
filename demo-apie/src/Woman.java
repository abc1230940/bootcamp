public class Woman {
  private Direction direction;

  public Woman() {
    this.direction = Direction.NORTH;
  }

  // Similar to Man.java
  public String getDirection() {
    if (this.direction == Direction.EAST) {
      return "EAST";
    } else if (this.direction == Direction.SOUTH) {
      return "SOUTH";
    } else if (this.direction == Direction.WEST) {
      return "WEST";
    } else {
      return "NORTH";
    }
  }

  public Direction turnLeft() {
    int result = (this.direction.getValue() - 1 + 4) % 4;
    this.direction = Direction.of(result);
    return Direction.of(result);
  }

  public Direction turnRight() {
    int result = (this.direction.getValue() + 1 + 4) % 4;
    this.direction = Direction.of(result);
    return Direction.of(result);
  }

}
