package org.adnangondal.day5;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrintQueueTest {

  List<Pair<String, String>> rules = List.of(new Pair<>("47", "53"));

  @Test
  void test_getMidpointIfValid_returns0_ifEmpty() {

    int res = PrintQueue.getMidpointIfValid(rules, "");

    assertEquals(res, 0);
  }
}
