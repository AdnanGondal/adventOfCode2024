package org.adnangondal.day2;

import java.util.List;
import org.adnangondal.util.DataReader;

public class RedNosedReports {

  public static void main(String[] args) throws Exception {
    List<List<Integer>> inputs = DataReader.readDay2NubersFromFile("day2/data.txt");
    RedNosedReports rnr = new RedNosedReports();
    System.out.println(rnr.getNumberOfSafeReports(inputs));
  }

  public int getNumberOfSafeReports(List<List<Integer>> reports) {
    int safeReports = 0;

    for (List<Integer> report : reports) {
      if (isReportSafe(report)) {
        safeReports++;
      }
    }

    return safeReports;
  }

  public static boolean isReportSafe(List<Integer> reports) {
    int n = reports.size();

    if (n == 0) {
      return false;
    }

    if (n == 1) {
      return true;
    }

    boolean isIncreasing = reports.get(1) - reports.get(0) > 0;

    for (int i = 0; i < n - 1; i++) {
      int diff = (reports.get(i + 1) - reports.get(i));

      if (isIncreasing && diff < 0
          || !isIncreasing && diff > 0
          || Math.abs(diff) < 1
          || Math.abs(diff) > 3) {
        return false;
      }
    }

    return true;
  }
}
