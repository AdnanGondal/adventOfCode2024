package org.adnangondal.day6;

public class Guard {

  private Position position;
  private Direction direction;

  public Guard(Position startPosition, Direction startDirection) {
    this.position = startPosition;
    this.direction = startDirection;
  }

  public Guard(char[][] grid){
    int initialX = -1;
    int initialY = -1;

    for (int i=0;i<grid.length;i++){
      for (int j=0;j<grid[0].length;j++){
        if (grid[i][j] == '^'){
          initialX = i;
          initialY = j;
          this.direction=Direction.UP;
        } else if (grid[i][j] == '>'){
          initialX = i;
          initialY = j;
          this.direction=Direction.RIGHT;
        } else if (grid[i][j] == 'V'){
          initialX = i;
          initialY = j;
          this.direction=Direction.DOWN;
        } else if (grid[i][j] == '<'){
          initialX = i;
          initialY = j;
          this.direction=Direction.LEFT;
        }
      }
    }
    this.position = new Position(initialX, initialY);


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
