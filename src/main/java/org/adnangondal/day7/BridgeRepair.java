package org.adnangondal.day7;

import java.util.*;
import org.adnangondal.util.DataReader;

public class BridgeRepair {

  public static void main(String[] args) {
    List<Equation> equations = DataReader.readDay7DataFromFile("day7/data.txt");
    BridgeRepair br = new BridgeRepair();
    System.out.println(br.getTotalCalibration(equations));
  }

  public Long getTotalCalibration(List<Equation> equations) {
    return equations.stream()
        .mapToLong(eq -> getValueIfValid(eq.getTestValue(), eq.getOperands()))
        .sum();
  }

  protected static Long getValueIfValid(Long testValue, List<Long> operands) {

    if (operands.isEmpty()) {
      return 0L;
    }

    Set<Long> results = new HashSet<>();
    results.add(operands.getFirst());

    for (int i = 1; i < operands.size(); i++) {
      Set<Long> newResults = new HashSet<>();
      for (Long result : results) {
        Long sum = result + operands.get(i);
        Long product = result * operands.get(i);

        newResults.add(sum);
        newResults.add(product);
      }
      results = newResults;
    }

    return results.contains(testValue) ? testValue : 0L;
  }
}
