package org.adnangondal.day4;

public class CeresSearch {

  String TARGET = "XMAS";

  public int wordSearch(String[][] input) {
    int count = 0;
    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[i].length; j++) {
        count += searchForWord(i, j, input);
      }
    }
    return count;
  }

  private int searchForWord(int x, int y, String[][] input) {
    int res = 0;
    int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};

    for (int dir = 0; dir < 8; dir++) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < TARGET.length(); i++) {
        int newX = x + i * dx[dir];
        int newY = y + i * dy[dir];
        if (newX >= 0 && newX < input.length && newY >= 0 && newY < input[x].length) {
          sb.append(input[newX][newY]);
        } else {
          break;
        }
      }
      if (sb.length() == TARGET.length() && sb.toString().equals(TARGET)) {
        res++;
      }
    }
    return res;
  }
}