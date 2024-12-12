package org.adnangondal.day6;


import org.adnangondal.util.DataReader;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
    char[][] grid = DataReader.parseGrid_day6("day6/grid.txt");

        GuardGallivant gv = new GuardGallivant(grid);
        System.out.println(gv.getDistinctPositionsCovered());

    }
}
