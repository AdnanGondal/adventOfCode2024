package org.adnangondal.day6;

public enum Direction {
  UP,
  RIGHT,
  DOWN,
  LEFT;

  public Direction turnRight() {
    switch (this) {
      case UP:
        return RIGHT;
      case RIGHT:
        return DOWN;
      case DOWN:
        return LEFT;
      case LEFT:
        return UP;
      default:
        throw new IllegalArgumentException("Unknown direction");
    }
  }
}
