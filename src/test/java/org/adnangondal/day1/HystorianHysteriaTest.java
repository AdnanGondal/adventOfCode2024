package org.adnangondal.day1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HystorianHysteriaTest {

    @Test
    void test_find_getTotalDistance_withEmptyInputs_returns_0() {

        assertThat(HystorianHysteria.getTotalDistance(List.of(), List.of())).isZero();

    }

    @Test
    void test_find_getTotalDistance_withExampleInput_returns_CorrectResult() {

        assertThat(HystorianHysteria.getTotalDistance(List.of(3, 4, 2, 1 ,3 ,3), List.of(4, 3, 5, 3, 9, 3))).isEqualTo(11);

    }
}