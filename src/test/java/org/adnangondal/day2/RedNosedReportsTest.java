package org.adnangondal.day2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RedNosedReportsTest {

    @Test
    void test_isReportSafe_emptyList_returns_false() {

        assertThat(RedNosedReports.isReportSafe(List.of())).isFalse();
    }

    @Test
    void test_isReportSafe_SingleElem_returns_true() {

        assertThat(RedNosedReports.isReportSafe(List.of(1))).isTrue();
    }

    @Test
    void test_isReportSafe_increasingLevels_returns_true() {

        assertThat(RedNosedReports.isReportSafe(List.of(1, 3, 6, 7, 9))).isTrue();
    }

    @Test
    void test_isReportSafe_decreasingLevels_returns_true() {

        assertThat(RedNosedReports.isReportSafe(List.of(7, 6, 4, 2, 1))).isTrue();
    }

    @Test
    void test_isReportSafe_increasingAnddecreasingLevels_returns_false() {

        assertThat(RedNosedReports.isReportSafe(List.of(1, 3, 2, 4, 5))).isFalse();
    }

    @Test
    void test_getNumberOfSafeReports_forExampleReports_returns_true() {
        RedNosedReports rnr = new RedNosedReports();

        List<List<Integer>> reports = List.of(
                List.of(7, 6, 4, 2, 1),
                List.of(1, 2, 7, 8, 9),
                List.of(9, 7, 6, 2, 1),
                List.of(1, 3, 2, 4, 5),
                List.of(8, 6, 4, 4, 1),
                List.of(1, 3, 6, 7, 9)
        );

        int res = rnr.getNumberOfSafeReports(reports);

        assertEquals(2, res);

    }


}