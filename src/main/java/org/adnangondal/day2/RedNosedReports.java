package org.adnangondal.day2;

import java.util.List;

public class RedNosedReports {

    public int getNumberOfSafeReports(List<List<Integer>> reports){
        int safeReports = 0;

        for (List<Integer> report : reports){
            if (isReportSafe(report)) {
                safeReports++;
            }
        }

        return safeReports;
    }

    private static boolean isReportSafe(List<Integer> report) {

        return false;
    }
}
