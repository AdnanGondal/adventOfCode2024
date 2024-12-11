package org.adnangondal.day6;

public class Guard {

  private Position position;
  private Direction direction;

  public Guard(Position startPosition, Direction startDirection) {
    this.position = startPosition;
    this.direction = startDirection;
  }

  public Position getPosition() {
    return position;
  }

  public void move(LabMap map) {
    Position nextPosition = position.move(direction);
    if (map.isObstacle(nextPosition)) {
      direction = direction.turnRight();
    } else {
      position = nextPosition;
    }
  }
}
