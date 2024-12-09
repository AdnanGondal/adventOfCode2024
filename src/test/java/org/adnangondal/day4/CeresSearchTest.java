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

    @Test
    void test_wordSearch_singleRightElement_returns_1() {

        String[][] input = {
                {"X", "M", "A", "S"},
                {"Z", "Z", "Z", "Z"},
                {"Z", "Z", "Z", "Z"},
                {"Z", "Z", "Z", "Z"},
        };

        int res = ceresSearch.wordSearch(input);

        assertEquals(1,res);
    }

    @Test
    void test_wordSearch_singleElementLeft_returns_1() {

        String[][] input = {
                {"S", "A", "M", "X"},
                {"Z", "Z", "Z", "Z"},
                {"Z", "Z", "Z", "Z"},
                {"Z", "Z", "Z", "Z"},
        };

        int res = ceresSearch.wordSearch(input);

        assertEquals(1,res);
    }

    @Test
    void test_wordSearch_twoElementsLeftAndRight_returns_2() {

        String[][] input = {
                {"S", "A", "M", "X"},
                {"X", "M", "A", "S"},
                {"Z", "Z", "Z", "A"},
                {"Z", "Z", "Z", "S"},
        };

        int res = ceresSearch.wordSearch(input);

        assertEquals(2,res);
    }

    @Test
    void test_wordSearch_twoElementsRightAndDown_returns_2() {

        String[][] input = {
                {"S", "A", "M", "X"},
                {"Z", "Z", "Z", "M"},
                {"Z", "Z", "Z", "A"},
                {"Z", "Z", "Z", "S"},
        };

        int res = ceresSearch.wordSearch(input);

        assertEquals(2,res);
    }

    @Test
    void test_wordSearch_twoElementsUpAndDown_returns_2() {

        String[][] input = {
                {"S", "O", "L", "X"},
                {"A", "Z", "Z", "M"},
                {"M", "Z", "Z", "A"},
                {"X", "Z", "Z", "S"},
        };

        int res = ceresSearch.wordSearch(input);

        assertEquals(2,res);
    }

    @Test
    void test_wordSearch_Example_returns_18() {

        String[][] input = {
                {"M", "M", "M", "S", "X", "X", "M", "A", "S", "M"},
                {"M", "S", "A", "M", "X", "M", "S", "M", "S", "A"},
                {"A", "M", "X", "S", "X", "M", "A", "A", "M", "M"},
                {"M", "S", "A", "M", "A", "S", "M", "S", "M", "X"},
                {"X", "M", "A", "S", "A", "M", "X", "A", "M", "M"},
                {"X", "X", "A", "M", "M", "X", "X", "A", "M", "A"},
                {"S", "M", "S", "M", "S", "A", "S", "X", "S", "S"},
                {"S", "A", "X", "A", "M", "A", "S", "A", "A", "A"},
                {"M", "A", "M", "M", "M", "X", "M", "M", "M", "M"},
                {"M", "X", "M", "X", "A", "X", "M", "A", "S", "X"}
        };


        int res = ceresSearch.wordSearch(input);

        assertEquals(18,res);
    }


}
