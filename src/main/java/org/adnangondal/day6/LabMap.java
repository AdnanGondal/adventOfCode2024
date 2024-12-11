package org.adnangondal.day6;

public class LabMap {
  private char[][] grid;

  public LabMap(char[][] grid) {
    this.grid = grid;
  }

  public boolean isObstacle(Position position) {
    return grid[position.getX()][position.getY()] == '#';
  }

  public boolean isInsideMap(Position position) {
    int x = position.getX();
    int y = position.getY();
    return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length;
  }
}
