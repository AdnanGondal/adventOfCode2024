package org.adnangondal.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MullItOverTest {

  private MullItOver mullItOver;

  @BeforeEach
  void setUp() {
    this.mullItOver = new MullItOver();
  }

  @Test
  void getSum_simpleInvalid_returnsCorrectResult() {

    String testStr = "mul( 2 , 4 )";

    assertEquals(0, mullItOver.sumMultiplications(testStr));
  }

  @Test
  void getSum_simpleMultiple_returnsCorrectResult() {

    String testStr = "mul(2,4)";

    assertEquals(8, mullItOver.sumMultiplications(testStr));
  }

  @Test
  void getSum_twoMultiples_returnsCorrectResult() {

    String testStr = "mul(2,4)xmul(1,1)";

    assertEquals(9, mullItOver.sumMultiplications(testStr));
  }

  @Test
  void getSum_oneValidAndOneInvalid_returnsCorrectResult() {

    String testStr = "mul(2,4)xmul(1,1]";

    assertEquals(8, mullItOver.sumMultiplications(testStr));
  }

  @Test
  void getSum_testCase_returnsCorrectResult() {

    String testStr = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";

    assertEquals(161, mullItOver.sumMultiplications(testStr));
  }
}
