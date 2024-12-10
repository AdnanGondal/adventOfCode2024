package org.adnangondal.day5;

import java.util.List;
import javafx.util.Pair;

public class PrintQueue {

  public int getSumOfValidMiddlePages(
      List<Pair<String, String>> rules, List<String> pageNumbersList) {

    int sum = 0;
    for (String pageNumbers : pageNumbersList) {
      sum += getMidpointIfValid(rules, pageNumbers);
    }
    return 0;
  }

  protected static int getMidpointIfValid(List<Pair<String, String>> rules, String pageNumbers) {

    return 0;
  }
}
