package org.adnangondal.day4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeresSearchTest {

    private CeresSearch ceresSearch;

    @BeforeEach
    void setUp() {
        ceresSearch = new CeresSearch();
      }

    @Test
    void test_wordSearch_emptyInput_returns_0() {

        String[][] input = {};

        int res = ceresSearch.wordSearch(input);

        assertEquals(0,res);
  }
}
