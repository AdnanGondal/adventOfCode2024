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

    Set<Integer> results = new HashSet<>();
    results.add(operands.getFirst());

    for (int i = 1; i < operands.size(); i++) {
      Set<Integer> newResults = new HashSet<>();
      for (Integer result : results) {
        Integer sum = result + operands.get(i);
        Integer product = result * operands.get(i);

        if (sum.equals(testValue) || product.equals(testValue)) {
          return testValue;
        }
        newResults.add(sum);
        newResults.add(product);
      }
      results = newResults;
    }

    return results.contains(testValue) ? testValue : 0;
  }
}
