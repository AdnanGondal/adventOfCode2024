package org.adnangondal.day5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import javafx.util.Pair;
import org.junit.jupiter.api.Test;

class PrintQueueTest {

  List<Pair<String, String>> rules =
      List.of(
          new Pair<>("47", "53"),
          new Pair<>("97", "13"),
          new Pair<>("97", "61"),
          new Pair<>("97", "47"),
          new Pair<>("75", "29"),
          new Pair<>("61", "13"),
          new Pair<>("75", "53"),
          new Pair<>("29", "13"),
          new Pair<>("97", "29"),
          new Pair<>("53", "29"),
          new Pair<>("61", "53"),
          new Pair<>("97", "53"),
          new Pair<>("61", "29"),
          new Pair<>("47", "13"),
          new Pair<>("75", "47"),
          new Pair<>("97", "75"),
          new Pair<>("47", "61"),
          new Pair<>("75", "61"),
          new Pair<>("47", "29"),
          new Pair<>("75", "13"),
          new Pair<>("53", "13"));

  @Test
  void test_getMidpointIfValid_returns0_ifEmpty() {

    int res = PrintQueue.getMidpointIfValid(rules, "");

    assertEquals(res, 0);
  }

  @Test
  void test_getMidpointIfValid_returnsMidpoint() {

    int res = PrintQueue.getMidpointIfValid(rules, "75,47,61,53,29");

    assertEquals(61, res);
  }

  @Test
  void test_getMidpointIfinvalid_returns0() {

    int res = PrintQueue.getMidpointIfValid(rules, "97,13,75,29,47");

    assertEquals(0, res);
  }

  @Test
  void test_getSumOfMidpoints_withExampleData_returnsCorrectSum() {
    List<String> pageNumbers =
        List.of(
            "75,47,61,53,29",
            "97,61,53,29,13",
            "75,29,13",
            "75,97,47,61,53",
            "61,13,29",
            "97,13,75,29,47");
    int expected = 143;

    PrintQueue pq = new PrintQueue();
    int res = pq.getSumOfValidMiddlePages(rules, pageNumbers);

    assertEquals(expected, res);
  }
}
