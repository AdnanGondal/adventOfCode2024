package org.adnangondal.day6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuardGallivantTest {

  @Test
  void test_emptyGrid_returns_0() {
    char[][] grid = {{}};
    GuardGallivant gv = new GuardGallivant(grid);

    assertEquals(0, gv.getDistinctPositionsCovered());
  }

  @Test
  void test_example_returns_correctAnswer() {
    char[][] grid = {
            "....#.....".toCharArray(),
            ".........#".toCharArray(),
            "..........".toCharArray(),
            "..#.......".toCharArray(),
            ".......#..".toCharArray(),
            "..........".toCharArray(),
            ".#..^.....".toCharArray(),
            "........#.".toCharArray(),
            "#.........".toCharArray(),
            "......#...".toCharArray()
    };

    GuardGallivant gv = new GuardGallivant(grid);

    assertEquals(41, gv.getDistinctPositionsCovered());
  }
}
