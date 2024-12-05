package org.adnangondal.day1;

import java.util.List;
import org.adnangondal.util.DataReader;

public class HystorianHysteria {

  public static void main(String[] args) throws Exception {
    List<List<Integer>> inputs = DataReader.readDay1NumbersFromFile("day1/data.txt");
    System.out.println("Total distance is " + getTotalDistance(inputs.get(0), inputs.get(1)));
  }

  public static Integer getTotalDistance(List<Integer> a, List<Integer> b) {

    List<Integer> aSorted = a.stream().sorted().toList();
    List<Integer> bSorted = b.stream().sorted().toList();
    int sum = 0;

    for (int i = 0; i < a.size(); i++) {
      sum += Math.abs(aSorted.get(i) - bSorted.get(i));
    }

    return sum;
  }
}
