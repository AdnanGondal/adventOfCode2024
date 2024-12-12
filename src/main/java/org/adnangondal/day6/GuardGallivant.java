package org.adnangondal.day6;

import java.util.HashSet;
import java.util.Set;

public class GuardGallivant {

  private final LabMap labMap;
  private final Guard guard;

  public GuardGallivant(char[][] grid) {
    this.labMap = new LabMap(grid);
    this.guard = new Guard(grid);
  }

  public int getDistinctPositionsCovered() {
    Set<Position> distPositions = new HashSet<>();

    while (labMap.isInsideMap(guard.getPosition())) {
      guard.move(labMap);
      if (!labMap.isInsideMap(guard.getPosition())){
        break;
      }
      distPositions.add(guard.getPosition());

    }


    return distPositions.size();
  }
}
