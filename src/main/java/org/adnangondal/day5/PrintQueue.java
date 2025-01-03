package org.adnangondal.day5;

import java.util.Arrays;
import java.util.List;
import javafx.util.Pair;
import org.adnangondal.util.DataReader;

public class PrintQueue {

  public static void main(String[] args) throws Exception {
    List<Pair<String, String>> rules = DataReader.parseRulesFromFile_day5("day5/rules.txt");
    List<String> pageNumbersList = DataReader.parsePageNumbersFromFile_day5("day5/pageNumbers.txt");

    PrintQueue pq = new PrintQueue();
    System.out.println( pq.getSumOfValidMiddlePages(rules, pageNumbersList));

  }

  public int getSumOfValidMiddlePages(
      List<Pair<String, String>> rules, List<String> pageNumbersList) {
    return pageNumbersList.stream()
        .mapToInt(pageNumbers -> getMidpointIfValid(rules, pageNumbers))
        .sum();
  }

  protected static int getMidpointIfValid(List<Pair<String, String>> rules, String pageNumbers) {
    if (pageNumbers.isEmpty()) return 0;
    int[] nums = Arrays.stream(pageNumbers.split(",")).mapToInt(Integer::parseInt).toArray();

    return rules.stream().allMatch(rule -> validateRuleAgainstNumbers(rule, nums))
        ? nums[nums.length / 2]
        : 0;
  }

  private static boolean validateRuleAgainstNumbers(Pair<String, String> rule, int[] nums) {
    int firstNum = Integer.parseInt(rule.getKey());
    int secondNum = Integer.parseInt(rule.getValue());
    int firstNumIndex = -1;
    int secondNumIndex = -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == firstNum) {
        firstNumIndex = i;
      }
      if (nums[i] == secondNum) {
        secondNumIndex = i;
      }
    }

    return firstNumIndex == -1 || secondNumIndex == -1 || secondNumIndex >= firstNumIndex;
  }
}
