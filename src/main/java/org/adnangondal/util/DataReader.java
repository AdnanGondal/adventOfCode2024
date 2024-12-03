package org.adnangondal.util;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    public static List<List<Integer>> readNumbersFromFile(String fileName) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        try (InputStream is = DataReader.class.getClassLoader().getResourceAsStream(fileName);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.trim().split("\\s+");
                if (numbers.length >= 2) {
                    firstList.add(Integer.parseInt(numbers[0]));
                    secondList.add(Integer.parseInt(numbers[1]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        result.add(firstList);
        result.add(secondList);
        return result;
    }
}