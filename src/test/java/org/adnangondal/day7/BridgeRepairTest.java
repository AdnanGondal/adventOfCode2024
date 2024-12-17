package org.adnangondal.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class BridgeRepairTest {

  @Test
  void test_getValueMethod_returns_0_onEmptyList() {

    assertEquals(0, BridgeRepair.getValueIfValid(0, List.of()));
  }

  @Test
  void test_getValueMethod_returns_correctResult_whenMultiply() {
    Integer testValue = 190;
    List<Integer> operands = List.of(10, 19);

    assertEquals(testValue, BridgeRepair.getValueIfValid(testValue, operands));
  }

  @Test
  void test_getValueMethod_returnsCorrectResult_whenInvalidOperands() {
    Integer testValue = 83;
    List<Integer> operands = List.of(17, 5);

    assertEquals(0, BridgeRepair.getValueIfValid(testValue, operands));
  }

  @Test
  void test_getValueMethod_returns_correctResult_whenMixedOperands() {
    Integer testValue = 3267;
    List<Integer> operands = List.of(81, 40, 27);

    assertEquals(testValue, BridgeRepair.getValueIfValid(testValue, operands));
  }

  @Test
  void test_getCalibrationResult_returnsCorrectResult() {

    Map<Integer, List<Integer>> calibrations = getTestCalibrationValues();
    BridgeRepair br = new BridgeRepair();

    Integer res = br.getTotalCalibration(calibrations);

    assertEquals(3749, res);
  }

  private Map<Integer, List<Integer>> getTestCalibrationValues() {
    Map<Integer, List<Integer>> calibrations = new HashMap<>();
    calibrations.put(190, List.of(10, 19));
    calibrations.put(3267, List.of(81, 40, 27));
    calibrations.put(83, List.of(17, 5));
    calibrations.put(156, List.of(15, 6));
    calibrations.put(7290, List.of(6, 8, 6, 15));
    calibrations.put(161011, List.of(16, 10, 13));
    calibrations.put(192, List.of(17, 8, 14));
    calibrations.put(21037, List.of(9, 7, 18, 13));
    calibrations.put(292, List.of(11, 6, 16, 20));

    return calibrations;
  }
}
