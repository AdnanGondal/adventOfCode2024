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

    public static boolean isReportSafe(List<Integer> reports) {
        int n = reports.size();

        if (n == 0){
            return false;
        }

        if (n == 1){
            return true;
        }

        boolean isIncreasing = reports.get(1)-reports.get(0) > 0 ? true : false;

        for (int i=0;i<n-1;i++){
            int diff = (reports.get(i+1)-reports.get(i));

            if (isIncreasing){
                if (diff < 0){
                    return false;
                }
            } else {
                if (diff > 0){
                    return false;
                }
            }

            if (Math.abs(diff) < 1 || Math.abs(diff) > 3 ){
                return false;
            }
        }


        return true;
    }
}
