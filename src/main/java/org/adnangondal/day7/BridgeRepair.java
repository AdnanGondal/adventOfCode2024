package org.adnangondal.day7;

import java.util.*;

public class BridgeRepair {

  public Integer getTotalCalibration(Map<Integer, List<Integer>> results) {
    return results.entrySet().stream()
        .mapToInt(entrySet -> getValueIfValid(entrySet.getKey(), entrySet.getValue()))
        .sum();
  }

  protected static int getValueIfValid(Integer testValue, List<Integer> operands) {

    if (operands.size() == 0) {
      return 0;
    }

    List<Integer> results = new ArrayList<>();
    results.add(operands.getFirst());

    for (int i = 1; i < operands.size(); i++) {
      List<Integer> newResults = new ArrayList<>();
      for (Integer result : results) {
        newResults.add(result + operands.get(i));
        newResults.add(result * operands.get(i));
      }
      results = newResults;
    }

    return results.contains(testValue) ? testValue : 0;
  }
}
