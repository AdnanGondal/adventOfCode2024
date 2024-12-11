package org.adnangondal.day6;

import java.util.Objects;

public class Position {

  private int x;
  private int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Position move(Direction direction) {
    switch (direction) {
      case UP:
        return new Position(x - 1, y);
      case RIGHT:
        return new Position(x, y + 1);
      case DOWN:
        return new Position(x + 1, y);
      case LEFT:
        return new Position(x, y - 1);
      default:
        throw new IllegalArgumentException("Unknown direction");
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Position position = (Position) o;
    return x == position.x && y == position.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
