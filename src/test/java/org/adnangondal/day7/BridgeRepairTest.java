package org.adnangondal.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class BridgeRepairTest {

  @Test
  void test_getValueMethod_returns_0_onEmptyList() {

    assertEquals(0, BridgeRepair.getValueIfValid(0L, List.of()));
  }

  @Test
  void test_getValueMethod_returns_correctResult_whenMultiply() {
    Long testValue = 190L;
    List<Long> operands = List.of(10L, 19L);

    assertEquals(testValue, BridgeRepair.getValueIfValid(testValue, operands));
  }

  @Test
  void test_getValueMethod_returnsCorrectResult_whenInvalidOperands() {
    Long testValue = 83L;
    List<Long> operands = List.of(17L, 5L);

    assertEquals(0, BridgeRepair.getValueIfValid(testValue, operands));
  }

  @Test
  void test_getValueMethod_returns_correctResult_whenMixedOperands() {
    Long testValue = 3267L;
    List<Long> operands = List.of(81L, 40L, 27L);

    assertEquals(testValue, BridgeRepair.getValueIfValid(testValue, operands));
  }

  @Test
  void test_getCalibrationResult_returnsCorrectResult() {

    List<Equation> equations = getTestCalibrationValues();
    BridgeRepair br = new BridgeRepair();

    Long res = br.getTotalCalibration(equations);

    assertEquals(3749L, res);
  }

  private List<Equation> getTestCalibrationValues() {
    List<Equation> calibrations = new ArrayList<>();
    calibrations.add(new Equation(190L, List.of(10L, 19L)));
    calibrations.add(new Equation(3267L, List.of(81L, 40L, 27L)));
    calibrations.add(new Equation(83L, List.of(17L, 5L)));
    calibrations.add(new Equation(156L, List.of(15L, 6L)));
    calibrations.add(new Equation(7290L, List.of(6L, 8L, 6L, 15L)));
    calibrations.add(new Equation(161011L, List.of(16L, 10L, 13L)));
    calibrations.add(new Equation(192L, List.of(17L, 8L, 14L)));
    calibrations.add(new Equation(21037L, List.of(9L, 7L, 18L, 13L)));
    calibrations.add(new Equation(292L, List.of(11L, 6L, 16L, 20L)));

    return calibrations;
  }
}
